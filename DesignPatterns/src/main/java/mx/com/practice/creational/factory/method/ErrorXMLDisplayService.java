package mx.com.practice.creational.factory.method;

public class ErrorXMLDisplayService extends DisplayService{

	@Override
	protected XMLParser getParser() {
		return new ErrorXMLParser();
	}
}
