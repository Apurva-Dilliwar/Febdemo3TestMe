package hdc2demos;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Feb6 {
	WebDriver driver;
  @Parameters({"tester","location","browser"})
  @Test
  public void primemembership(String tester, String location, String browser) {
	  driver = Driverhdc2.getDriver(browser);
		System.out.println("code for prime");
		System.out.println("its executed by :" +tester);
		System.out.println("its executed from :"+location);
		System.out.println("its browser is :"+browser);
  }
  @Test
  public void renewal() {
	  System.out.println("code for renewal");
  }
//  @Parameters({"tester","location","browser"})
//  @Test
//  public void termination(String tester ,String location, String browser) {
//	  driver = Driverhdc2.getDriver(browser);
//	  System.out.println("code for termination ");
//	  System.out.println("its executed by :"+tester);
//		System.out.println("its executed from :"+location);
//		System.out.println("its browser is :"+browser);
//  }
  @BeforeTest
  public void browserConfiguration() {
	  System.out.println("some 30 line of code for browserConfiguration");
  }
  @AfterTest
  public void browserdeConfiguration() {
	  System.out.println("some 35 line of code for browserdeConfiguration");
  }
  @BeforeSuite
  public void ConnectiveDatabase() {
	  System.out.println("some 40 line of code for ConnectiveDatabase");
  }
  @AfterSuite
  public void DisconnectDatabase() {
	  System.out.println("some 45 line of code for DisconnectDatabase");
  }
}
