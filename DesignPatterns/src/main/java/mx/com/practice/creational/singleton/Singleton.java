package mx.com.practice.creational.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 
 * @author evera
 * Ways to break the singleton pattern:
 * - If the class is Serializable.
 * - If it’s Clonable.
 * - It can be break by Reflection.
 * - And also if, the class is loaded by multiple class loaders.
 * 
 * Solutions:
 * - Implement the readResolve() and writeReplace() methods in your singleton class and return the same object through them.
 * - You should also implement the clone() method and throw an exception so that the singleton cannot be cloned.
 * - An "if condition" inside the constructor can prevent the singleton from getting instantiated more than once using reflection.
 * - To prevent the singleton getting instantiated from different class loaders, you can implement the getClass() method. The
 *   above getClass() method associates the classloader with the current thread; if that classloader is null, the method uses the
 *   same classloader that loaded the singleton class.
 */
public class Singleton implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3275327157168264505L;
	private static Singleton s = new Singleton();
	
	private Singleton(){
		if (s!=null){
			throw new IllegalStateException("Already Created."); 
		}
	}
	
	
	public static Singleton getIntance(){
		return s;
	}
	
	private Object readResolve()throws ObjectStreamException{
		return s;
	}
	
	private Object writeReplace()throws ObjectStreamException{
		return s;
	}
	
	public Object clone() throws CloneNotSupportedException{
		throw new CloneNotSupportedException("Singleton, cannot be clonned");
	}
	
	@SuppressWarnings({ "unused", "rawtypes" })
	private static Class getClass(String classname) throws ClassNotFoundException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		if(classLoader == null)
			classLoader = Singleton.class.getClassLoader();
		return (classLoader.loadClass(classname));
	}
}
