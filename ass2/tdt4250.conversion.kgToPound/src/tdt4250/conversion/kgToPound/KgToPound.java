package tdt4250.conversion.kgToPound;

import org.osgi.service.component.annotations.*;

import tdt4250.conversion.api.Conversion;
import tdt4250.conversion.util.Convert;

@Component(
		property = {
				Convert.CONVERSION_NAME_PROP + "=kgtopound",
				Convert.CONVERSION_EXPRESSION_PROP + "=X * 2.2",
				Convert.CONVERSION_FROM_IDENTIFIER_PROP + "=KG",
				Convert.CONVERSION_TO_IDENTIFIER_PROP + "=LBS"
		})
public class KgToPound extends Convert implements Conversion{

	// TODO: class provided by template

}
