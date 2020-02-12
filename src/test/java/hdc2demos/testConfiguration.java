package hdc2demos;

import org.testng.annotations.Test;

public class testConfiguration {
  @Test(groups = {"sanity", "regression"})
  public void registration() {
	  System.out.println("code for registration");
  }
  @Test(groups = {"regression"})
  public void logout() {
	  System.out.println("code for login");
  }
  @Test (groups= {"sanity"})
  public void login() {
	  System.out.println("code for login");
  }
}
