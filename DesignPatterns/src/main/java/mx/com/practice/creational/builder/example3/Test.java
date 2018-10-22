package mx.com.practice.creational.builder.example3;

public class Test {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
		
		
		StringCreator sc = new StringCreator.StringBuilder().append("").build();
		
		SBuilder s=new SBuilder();
		s.append("Hola");
		s.append("Edgar");
		
		System.out.println(s.toString());
	}

}
