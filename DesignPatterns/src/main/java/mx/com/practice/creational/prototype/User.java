package mx.com.practice.creational.prototype;

public class User {
	private String name;
	private String level;
	private AccessControl accessControl;
	
	
	public User(String name, String level, AccessControl accessControl) {
		super();
		this.name = name;
		this.level = level;
		this.accessControl = accessControl;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLevel() {
		return level;
	}


	public void setLevel(String level) {
		this.level = level;
	}


	public AccessControl getAccessControl() {
		return accessControl;
	}


	public void setAccessControl(AccessControl accessControl) {
		this.accessControl = accessControl;
	}


	@Override
	public String toString() {
		return "Name: "+name+", Level: "+level+", Access Control Level:"+ 
				accessControl.getControlLevel()+", Access: "+accessControl.getAccess();
	}
	
	
}
