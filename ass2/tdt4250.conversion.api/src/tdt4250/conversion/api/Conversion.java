package tdt4250.conversion.api;

import org.osgi.annotation.versioning.ProviderType;

@ProviderType
public interface Conversion {
	
	String getConversionName();
	String getFromIdentifier();
	String getToIdentifier();
	String getConversionExpression();
	ConversionSearchResult convert(String conversionValue);

}
