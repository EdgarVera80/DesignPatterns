package mx.com.practice.creational.factory.method;

public class ResponseXMLParser implements XMLParser {

	@Override
	public String parse() {
		System.out.println("Parsing response XML...");
		return "Response XML Message";
	}
}
