package mx.com.practice.creational.singleton;


/**
 * 
 * @author evera
 * The synchronized has a price, this decreses the performance when the system has hight transactional.
 *
 */
public class SingletonLazyMultithreaded {
	private static SingletonLazyMultithreaded slmt =null; 
	
	private SingletonLazyMultithreaded(){} //Private constructor
	
	public static synchronized SingletonLazyMultithreaded getIntance(){
		if(slmt==null){
			slmt=new SingletonLazyMultithreaded();
		}
		return slmt;
	}
}
