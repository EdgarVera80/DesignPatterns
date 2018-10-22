package mx.com.practice.creational.singleton;

public class MainClass {

	public static void main(String[] args) {
		Singleton s=Singleton.getIntance();
		
		try {
			Singleton s2=(Singleton) s.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
