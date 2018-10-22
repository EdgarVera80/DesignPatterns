package mx.com.practice.creational.factory.method;

public class OrderXMLDisplayService extends DisplayService{
	@Override
	public XMLParser getParser() {
		return new OrderXMLParser();
	}
}