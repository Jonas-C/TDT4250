package tdt4250.conversion.api;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class ConversionSearch {
	
	private static final String DEFAULT_MESSAGE = "Sorry, no matches for this conversion";
	private Collection<Conversion> conversions = new ArrayList<Conversion>();
	
	
	public void addConversion(Conversion conversion) {
		conversions.add(conversion);
	}
	
	
	public void removeConversion(Conversion conversion) {
		conversions.remove(conversion);
	}
	
	
	public ConversionSearch(Conversion...conversions) {
		this.conversions.addAll(Arrays.asList(conversions));
	}
	
	
	private ConversionSearchResult search(String conversionValue, Iterable<Conversion> conversions) {
		StringBuilder messages = new StringBuilder();
		URI link = null;
		boolean success = false;
		for (Conversion conversion : conversions) {
			ConversionSearchResult result = conversion.convert(conversionValue);
			if(result.isSuccess()) {
				messages.append(result.getMessage());
				success = true;
				if (link == null) link = result.getLink();
			}
		}
		if(messages.length() == 0) {
			messages.append(DEFAULT_MESSAGE);
		}
		return new ConversionSearchResult(success, messages.toString(), link);
	}
	
	
	public ConversionSearchResult search(String conversionName, String conversionValue) {
		return search(conversionValue, conversions.stream().filter(conversion -> conversion.getConversionName().equals(conversionName)).collect(Collectors.toList()));
	}

	
	public ConversionSearchResult search(String conversionValue) {
		return search(conversionValue, conversions);
	}
	
	
}
