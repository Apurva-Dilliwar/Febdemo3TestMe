package hdc2demos;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class DemoDriver {
  @Test
  public void f() {
	  WebDriver driver;
	  driver=Driverhdc2.getDriver("CRM");
  }
}
