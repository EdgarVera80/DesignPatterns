package mx.com.practice.creational.factory.method;

public class FeedbackXML implements XMLParser {

	@Override
	public String parse() {
		System.out.println("Parsing feedback XML...");
		return "Feedback XML Message";
	}
}
