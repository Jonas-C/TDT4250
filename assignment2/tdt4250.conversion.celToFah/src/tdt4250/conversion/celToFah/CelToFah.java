package tdt4250.conversion.celToFah;

import org.osgi.service.component.annotations.Component;

import tdt4250.conversion.api.Conversion;
import tdt4250.conversion.util.Convert;

@Component(
		property = {
				Convert.CONVERSION_NAME_PROP + "=celtofah",
				Convert.CONVERSION_EXPRESSION_PROP + "=X * 1.8 + 32",
				Convert.CONVERSION_FROM_IDENTIFIER_PROP + "=C",
				Convert.CONVERSION_TO_IDENTIFIER_PROP + "=F"
		})
public class CelToFah extends Convert implements Conversion {

}
