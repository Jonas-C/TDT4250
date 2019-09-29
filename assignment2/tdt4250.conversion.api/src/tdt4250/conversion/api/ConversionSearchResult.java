package tdt4250.conversion.api;

import java.net.URI;

import org.osgi.annotation.versioning.ConsumerType;

@ConsumerType
public class ConversionSearchResult {
	
	private final boolean success;
	private final String message;
	private final URI link;
	
	
	public ConversionSearchResult(boolean success, String message, URI link) {
		super();
		this.success = success;
		this.message = message;
		this.link = link;
	}

	
	public boolean isSuccess() {
		return success;
	}

	
	public String getMessage() {
		return message;
	}

	
	public URI getLink() {
		return link;
	}
	
	

}
