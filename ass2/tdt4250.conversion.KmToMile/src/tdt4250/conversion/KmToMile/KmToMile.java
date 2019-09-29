package tdt4250.conversion.KmToMile;

import org.osgi.service.component.annotations.*;

import tdt4250.conversion.api.Conversion;
import tdt4250.conversion.util.Convert;

@Component(
		property= {
				Convert.CONVERSION_NAME_PROP + "=kmtomile",
				Convert.CONVERSION_EXPRESSION_PROP + "=x * 0.609344",
				Convert.CONVERSION_FROM_IDENTIFIER_PROP + "=km",
				Convert.CONVERSION_TO_IDENTIFIER_PROP + "=miles"
				
		})
public class KmToMile extends Convert implements Conversion{

	// TODO: class provided by template

}
