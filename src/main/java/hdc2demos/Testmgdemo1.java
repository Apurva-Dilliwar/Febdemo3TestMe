package hdc2demos;

import org.testng.annotations.Test;

public class Testmgdemo1 {
  @Test(priority=1, enabled=false)
  public void register() {
	  System.out.println("register");
  }
  @Test(priority=2)
  public void login() {
	  System.out.println("login");
  }
  @Test(priority=3)
  public void logout() {
	  System.out.println("logout");
  }
}
