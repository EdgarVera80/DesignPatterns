package mx.com.practice.creational.factory.method;

public class Test {

	public static void main(String[] args) {
		DisplayService service = new FeedbackXMLDisplayService();
		service.display();
		
		service = new ErrorXMLDisplayService();
		service.display();
		
		service = new OrderXMLDisplayService();
		service.display();
		
		service = new ResponseXMLDisplayService();
		service.display();
	}
}
