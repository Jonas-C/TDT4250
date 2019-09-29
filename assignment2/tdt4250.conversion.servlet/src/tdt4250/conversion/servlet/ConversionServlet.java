package tdt4250.conversion.servlet;

import java.util.List;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

import javax.servlet.*;
import javax.servlet.http.*;

import org.osgi.service.component.annotations.*;
import org.osgi.service.http.whiteboard.propertytypes.HttpWhiteboardServletPattern;

import tdt4250.conversion.api.Conversion;
import tdt4250.conversion.api.ConversionSearch;
import tdt4250.conversion.api.ConversionSearchResult;

@Component
@HttpWhiteboardServletPattern("/conversion/*")
public class ConversionServlet extends HttpServlet implements Servlet {

	private static final long serialVersionUID = 1L;
	
	private ConversionSearch conversionSearch = new ConversionSearch();
	
	
	@Reference(
			cardinality = ReferenceCardinality.MULTIPLE,
			policy = ReferencePolicy.DYNAMIC,
			bind = "addConversion",
			unbind = "removeConversion"
	)
	public void addConversion(Conversion conversion) {
		conversionSearch.addConversion(conversion);
	}
	
	
	public void removeConversion(Conversion conversion) {
		conversionSearch.removeConversion(conversion);
	}
	

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<String> segments = new ArrayList<>();
		String path = request.getPathInfo();
		if(path != null) segments.addAll(Arrays.asList(path.split("\\/")));
		if(segments.size() == 0) {
			PrintWriter writer = response.getWriter();
			writer.print("Hey! Add a conversion to the end of the URL to convert something!\nInfo about usage can be found on GitHub :)\nExample usage: http://localhost:8080/conversion/celtofah?q=30");
			return;
		}
		if(segments.size() > 0 && segments.get(0).length() == 0) segments.remove(0);
		if(segments.size() > 1) {
			response.sendError(HttpServletResponse.SC_NOT_ACCEPTABLE, "Request must contain max 1 path segment");
			return;
		}
		String q = request.getParameter("q");
		ConversionSearchResult result = conversionSearch.search(segments.get(0).toLowerCase(), q);
		response.setContentType("text/plain");
		PrintWriter writer = response.getWriter();
		if(result.getLink() != null) writer.print(result.getLink());
		writer.print(result.getMessage());
		
		
	}

}