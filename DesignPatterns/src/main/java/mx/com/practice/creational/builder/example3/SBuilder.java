package mx.com.practice.creational.builder.example3;

public class SBuilder {
	private String text="";
	
	public SBuilder(){}
	
	public SBuilder(String text){
		this.text=text;
	}
	
	public void append(String text){
		this.text=this.text.concat(text);
	}
	
	public String toString(){
		return this.text;
	}
	
}
