package hdc2demos;

import org.testng.annotations.Test;

public class Feb6_1 {
	  @Test(priority=1)
	  public void registration() {
		  System.out.println("code for registration");
	  }
	  @Test(priority=3)
	  public void logout() {
		  System.out.println("code for logout");
	  }
	  @Test (priority=2)
	  public void login() {
		  System.out.println("code for login");
	  }
  
}
