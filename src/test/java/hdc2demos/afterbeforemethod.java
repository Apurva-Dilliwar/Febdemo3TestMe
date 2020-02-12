package hdc2demos;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class afterbeforemethod {
  @Test
  public void login() {
	  System.out.println("some 5 line of code for login");
  }
  @BeforeMethod
  public void launch() {
	  System.out.println("some 3 line of code for launch");
  }
  @Test
  public void register() {
	  System.out.println("some 20 line of code for register");
  }
  @AfterMethod
  public void closing() {
	  System.out.println("some 15 line of code for closing");
  }
  @BeforeClass
  public void clearBrowserchache() {
	  System.out.println("some 24 line of code for clearBrowserchache");
  }
  @AfterClass
  public void deletcookies() {
	  System.out.println("some 29 line of code for deletcookies");
  }
  @BeforeTest
  public void browserConfiguration() {
	  System.out.println("some 30 line of code for browserConfiguration");
  }
  @AfterTest
  public void browserRollback() {
	  System.out.println("some 35 line of code for browserRollback");
  }
}
