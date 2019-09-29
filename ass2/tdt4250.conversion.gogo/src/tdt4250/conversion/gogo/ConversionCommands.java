package tdt4250.conversion.gogo;


import java.io.IOException;
import java.util.Dictionary;
import java.util.Hashtable;

import org.apache.felix.service.command.Descriptor;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.framework.ServiceReference;
import org.osgi.service.cm.Configuration;
import org.osgi.service.cm.ConfigurationAdmin;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;

import tdt4250.conversion.api.Conversion;
import tdt4250.conversion.api.ConversionSearchResult;
import tdt4250.conversion.util.Convert;

@Component(
		service = ConversionCommands.class,
		property= {
				"osgi.command.scope=unit",
				"osgi.command.function=list",
				"osgi.command.function=add",
				"osgi.command.function=remove",
				"osgi.command.function=convert"
		}
		)
public class ConversionCommands {
	
	@Reference(cardinality = ReferenceCardinality.MANDATORY)
	private ConfigurationAdmin cm;

	
	private Configuration getConfig(String conversionName) {
		try {
			Configuration[] configs = cm.listConfigurations("(&(" + Convert.CONVERSION_NAME_PROP + "=" + conversionName + ")(service.factoryPid=" + Convert.FACTORY_PID + "))");
			if(configs != null && configs.length >= 1) return configs[0];
		}
		catch (IOException | InvalidSyntaxException e) {}
		return null;
	}
	
	
	@Descriptor("list available conversions")
	public void list() {
		System.out.print("Conversions: ");
		BundleContext bc = FrameworkUtil.getBundle(this.getClass()).getBundleContext();
		try {
			for(ServiceReference<Conversion> serviceReference : bc.getServiceReferences(Conversion.class, null)) {
				Conversion conversion = bc.getService(serviceReference);
				try {
					if(conversion != null) {
						System.out.print(conversion.getConversionName());
						if(getConfig(conversion.getConversionName()) != null) System.out.print("*"); 
					}
				}
				finally {
					bc.ungetService(serviceReference);
				}
				System.out.print(" ");
			}
		}
		catch(InvalidSyntaxException e) {}
		System.out.println();
	}
	
	
	@Descriptor("Add a conversion by typing in an equation")
	public void add(
			@Descriptor("Name of the conversion to be added")
			String conversionName,
			@Descriptor("The conversion expression")
			String conversionExpression,
			@Descriptor("The preferred identifier for the original value")
			String fromIdentifier,
			@Descriptor("The preferred identifier for the converted value to be converted to")
			String toIdentifier
			) throws IOException, InvalidSyntaxException {
		
		String actionName = "updated";
		Configuration config = getConfig(conversionName);
		if(config == null) {
			config = cm.createFactoryConfiguration(Convert.FACTORY_PID, "?");
			actionName = "added";
		}
		Dictionary<String, String> props = new Hashtable<>();
		props.put(Convert.CONVERSION_NAME_PROP, conversionName);
		props.put(Convert.CONVERSION_EXPRESSION_PROP, conversionExpression);
		props.put(Convert.CONVERSION_TO_IDENTIFIER_PROP, toIdentifier);
		props.put(Convert.CONVERSION_FROM_IDENTIFIER_PROP, fromIdentifier);
		config.update(props);
		System.out.println("\"" + conversionName + "\" dictionary " + actionName);		
	}
	
	
	@Descriptor("Remove a manually added conversion")
	public void remove(
			@Descriptor("Name of the manually added conversion")
			String conversionName
			) throws IOException, InvalidSyntaxException {
		
		Configuration config = getConfig(conversionName);
		boolean removed = false;
		if(config != null) {
			config.delete();
			removed = true;
		}
		System.out.println("\"" + conversionName + "\" dictionary " + (removed ? "removed" : "was not added manually and can't be removed"));
	}
	
	
	@Descriptor("Use a conversion to convert a number!")
	public void convert(
			@Descriptor("Name of the conversion to use")
			String conversionName,
			@Descriptor("Number to be converted")
			String conversionValue
			) throws IOException, InvalidSyntaxException {
		
		BundleContext bc = FrameworkUtil.getBundle(this.getClass()).getBundleContext();
		boolean isPresent = false;
		for (ServiceReference<Conversion> serviceReference : bc.getServiceReferences(Conversion.class, null)) {
			Conversion conversion = bc.getService(serviceReference);
			if(conversion != null) {
				if(conversionName.equals(conversion.getConversionName())) {
					isPresent = true;
					try {
						ConversionSearchResult search = conversion.convert(conversionValue);
						System.out.println(search.getMessage());
					}
					finally {
						bc.ungetService(serviceReference);
					}
				}
			}
			else System.out.println(serviceReference.getProperties());
		}
		if(isPresent == false) System.out.println("Conversion not found!");
	}
}
