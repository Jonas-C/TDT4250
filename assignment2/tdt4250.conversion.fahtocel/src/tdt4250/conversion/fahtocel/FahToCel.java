package tdt4250.conversion.fahtocel;

import org.osgi.service.component.annotations.*;

import tdt4250.conversion.api.Conversion;
import tdt4250.conversion.util.Convert;

@Component(
		property = {
				Convert.CONVERSION_NAME_PROP + "=fahtocel",
				Convert.CONVERSION_EXPRESSION_PROP + "=(x - 32) / 1.8",
				Convert.CONVERSION_FROM_IDENTIFIER_PROP + "=F",
				Convert.CONVERSION_TO_IDENTIFIER_PROP + "=C"
		})
public class FahToCel extends Convert implements Conversion {

	// TODO: class provided by template

}
