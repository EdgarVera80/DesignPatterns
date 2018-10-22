package mx.com.practice.creational.prototype;


public class Test {

	public static void main(String[] args) {
	
		AccessControl userAccessControl;
		try {
			userAccessControl = AccessControlProvider.getAccessControlObject("USER");
			User user = new User("User A", "USER Level", userAccessControl);
			System.out.println("************************************");
			System.out.println(user);
			
			userAccessControl = AccessControlProvider.getAccessControlObject("USER");
			user = new User("User B", "USER Level", userAccessControl);
			System.out.println("Changing access control of: "+user.getName());
			user.getAccessControl().setAccess("READ REPORTS");
			System.out.println(user);
			System.out.println("************************************");
			
			AccessControl managerAccessControl = AccessControlProvider.getAccessControlObject("MANAGER");
			user = new User("User C", "MANAGER Level", managerAccessControl);
			System.out.println(user);
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
				
	}

}
