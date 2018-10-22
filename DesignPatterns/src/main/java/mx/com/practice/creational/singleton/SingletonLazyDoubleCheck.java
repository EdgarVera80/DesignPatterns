package mx.com.practice.creational.singleton;

public class SingletonLazyDoubleCheck {
	private volatile static SingletonLazyDoubleCheck sldc =null; 
	
	private SingletonLazyDoubleCheck(){} //Private constructor
	
	public static SingletonLazyDoubleCheck getIntance(){
		if(sldc==null){
			synchronized(SingletonLazyDoubleCheck.class){
				if(sldc==null){
					sldc=new SingletonLazyDoubleCheck();
				}
			}		
		}
		return sldc;
	}
}
