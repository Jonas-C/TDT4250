package tdt4250.conversion.util;

import java.util.HashMap;
import java.util.Map;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.script.SimpleBindings;

import org.osgi.framework.BundleContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Modified;

import tdt4250.conversion.api.Conversion;
import tdt4250.conversion.api.ConversionSearchResult;
import tdt4250.conversion.util.Convert;

@Component(
		configurationPid = Convert.FACTORY_PID,
		configurationPolicy = ConfigurationPolicy.REQUIRE
		)
public class Convert implements Conversion{
	
	public static final String FACTORY_PID = "tdt4250.conversion.util.Convert";
	
	public static final String CONVERSION_NAME_PROP = "conversionName";
	public static final String CONVERSION_EXPRESSION_PROP = "conversionExpression";
	public static final String CONVERSION_FROM_IDENTIFIER_PROP = "fromIdentifier";
	public static final String CONVERSION_TO_IDENTIFIER_PROP = "toIdentifier";
	

	private String conversionName;
	private String toIdentifier;
	private String fromIdentifier;
	private String conversionExpression;

	
	@Override
	public String getConversionName() {
		return conversionName;
	}
	
	
	@Override 
	public String getFromIdentifier() {
		return fromIdentifier;
	}

	
	@Override
	public String getToIdentifier() {
		return toIdentifier;
	}
	
	
	@Override
	public String getConversionExpression() {
		return conversionExpression;
	}
	
	
	protected void setConversionExpression(String conversionValue) {
		this.conversionExpression = conversionValue;
	}
	
	
	protected void setFromIdentifier(String fromIdentifier) {
		this.fromIdentifier = fromIdentifier;
	}
	
	
	protected void setToIdentifier(String toIdentifier) {
		this.toIdentifier = toIdentifier;
	}
	
	
	protected void setConversionName(String name) {
		this.conversionName = name;
	}
	
	
	public @interface UnitConversionConfig{
		String conversionName();
		String conversionExpression() default "";
		String toIdentifier() default "";
		String fromIdentifier() default "";
	}
	
	
	@Activate
	public void activate(BundleContext bc, UnitConversionConfig config) {
		update(bc, config);
	}
	
	
	@Modified
	public void modify(BundleContext bc, UnitConversionConfig config) {
		update(bc, config);
	}
	
	
	protected void update(BundleContext bc, UnitConversionConfig config) {
		setConversionName(config.conversionName());
		setConversionExpression(config.conversionExpression());
		setFromIdentifier(config.fromIdentifier());
		setToIdentifier(config.toIdentifier());	
	}
	
	
	protected String getSuccessMessageStringFormat() {
		return "%s: %.2f %s converted to %s %s";
	}
	

	protected String getFailureMessageStringFormat(String error) {
		return this.conversionName + ": Could not convert %s \n"+ error;
	}
	
	
	@Override
	public ConversionSearchResult convert(String conversionValue) {
		Map<String, Object> cValue = new HashMap<String, Object>();
		String result = "";
		try {
			cValue.put("x", Double.parseDouble(conversionValue));
			ScriptEngine scriptEngine = new ScriptEngineManager().getEngineByName("JavaScript");
			result = String.format("%.2f", scriptEngine.eval(this.conversionExpression.toLowerCase(), new SimpleBindings(cValue)));
		} 
		catch (Exception e) {
			if (e instanceof NumberFormatException) {
				return new ConversionSearchResult(false, String.format(getFailureMessageStringFormat("Input must be a number!"), conversionValue), null);
			}
			else if (e instanceof ScriptException){
				return new ConversionSearchResult(false, String.format(getFailureMessageStringFormat(""), conversionValue), null);
				
			}

		}
		return new ConversionSearchResult(true, String.format(getSuccessMessageStringFormat(), getConversionName(), cValue.get("x"), getFromIdentifier(), result, getToIdentifier()), null);
	}

	
	

}
