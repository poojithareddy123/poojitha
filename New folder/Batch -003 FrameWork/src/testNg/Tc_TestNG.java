package testNg;

import org.testng.annotations.Test;

public class Tc_TestNG {
	public class TC_TestNG { 
		@Test   
		public void login(){    
			System.out.println("login completed");    } 
		@Test(dependsOnMethods="login")   
		public void logout(){    
		System.out.println("Logout completed");    } 
	}
}
