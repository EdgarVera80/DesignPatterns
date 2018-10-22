package mx.com.practice.creational.singleton;

/**
 * 
 * @author evera
 * Singleton class (BAD PRACTICE), Never do this.
 * The problem with this is that the objecte will be created as soon as the class gets loaded into the JVM.
 * if the object is never request, there would be an object useless inside the memory.
 *
 */
public class SingletonEager {
	private static SingletonEager se =new SingletonEager();  
	
	private SingletonEager(){} //Private constructor
	
	public static SingletonEager getIntance(){
		return se;
	}
}
