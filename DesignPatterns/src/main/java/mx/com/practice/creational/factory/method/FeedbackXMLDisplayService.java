package mx.com.practice.creational.factory.method;

public class FeedbackXMLDisplayService extends DisplayService{
	@Override
	protected XMLParser getParser() {
		return new FeedbackXML();
	}
}
