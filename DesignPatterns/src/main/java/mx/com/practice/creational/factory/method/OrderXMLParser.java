package mx.com.practice.creational.factory.method;

public class OrderXMLParser implements XMLParser {

	@Override
	public String parse() {
		System.out.println("Parsing order XML...");
		return "Order XML Message";
	}
}
