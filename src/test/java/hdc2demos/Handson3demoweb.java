package hdc2demos;

import org.testng.annotations.Test;

import hdc2demos.Driverhdc2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;

public class Handson3demoweb {
	 @Test(dataProvider = "credentials")
	  public void register(String g,String f, String l, String E, String p, String cp) throws Exception {
		  WebDriver driver;
		  driver=Driverhdc2.getDriver("CRM");
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  driver.get("http://demowebshop.tricentis.com/");
		  driver.manage().window().maximize();
		  driver.findElement(By.xpath("//a[text()='Register']")).click();
		  driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div[1]/div[2]/label")).click();
		  driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys(f);
		  driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys(l);
		  driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(E);
		  driver.findElement(By.xpath("//input[@name='Password']")).sendKeys(p);
		  driver.findElement(By.xpath("//input[@name='ConfirmPassword']")).sendKeys(cp);
		  driver.findElement(By.xpath("//input[@name='register-button']")).click();
	  }

	  @DataProvider
	  public Object[][] credentials() {
	    return new Object[][] {
	      new Object[] {"Female", "apurva", "dilliwar", "apurva.dilliwar@gmail.com", "apu1234@", "apu1234@" } 
	    };
	  }
}
