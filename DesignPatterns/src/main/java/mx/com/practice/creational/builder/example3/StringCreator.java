package mx.com.practice.creational.builder.example3;

public class StringCreator {
	private String text;
	
	public static class StringBuilder{
		private  String text="";
		
		public StringBuilder append(String text){
			this.text=this.text.concat(text);
			return this;
		}
		
		public StringCreator build(){
			return new StringCreator(this);
		}
	}
	
	public StringCreator(StringBuilder stringBuilder){
		this.text=stringBuilder.text;
	}
	public StringCreator(){
		
	}
	public String toString(){
		return this.text;
	}
}
