package hdc2demos;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class Parametarazationdemo1 {
  @Test(dataProvider = "credentials")
  public void login(String name, String password) {
	  WebDriver driver;
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Training1\\Downloads\\Selenium\\BrowserDrivers\\chromedriver.exe");
      driver =new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("http://172.31.36.202:443/TestMeApp/fetchcat.htm");
	  System.out.println("The username this time is : "+name);
	  System.out.println("The Password this time is : "+password);
	  driver.findElement(By.linkText("SignIn")).click();
	  driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(name);
	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	  driver.findElement(By.xpath("//input[@name='Login']")).click();
	  String e_title="Home";
	  String a_title=driver.getTitle();
	  Assert.assertEquals(a_title, e_title);
  }

  @DataProvider
  public Object[][] credentials() {
    return new Object[][] {
      new Object[] { "Lalitha", "Password123" },
      new Object[] { "Apurva", "Password1234" },
    };
  }
}
