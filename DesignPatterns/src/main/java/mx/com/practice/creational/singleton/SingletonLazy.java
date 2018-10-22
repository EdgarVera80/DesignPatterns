package mx.com.practice.creational.singleton;

/**
 * 
 * @author evera
 * Singleton Class better than SingletonEager, but is not good for multi-threaded environment.
 *
 */
public class SingletonLazy {
	private static SingletonLazy sl =null; 
	
	private SingletonLazy(){} //Private constructor
	
	public static SingletonLazy getIntance(){
		if(sl==null){
			sl=new SingletonLazy();
		}
		return sl;
	}
}
