package hdc2demos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import hdc2demos.Driverhdc2;

public class Handson2testmeapp {
  @Test
  public void printaddress() throws InterruptedException {
	  WebDriver driver;
	  driver=Driverhdc2.getDriver("CRM");
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  driver.get("http://172.31.36.202:443/TestMeApp/fetchcat.htm");
	  driver.manage().window().maximize();
	  WebElement Ele =driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[3]/a/span"));
	  Actions act1 =new Actions(driver);
	  act1.moveToElement(Ele).build().perform();
//	  Thread.sleep(3000);
	  WebElement Ele1= driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[3]/ul/li/a/span"));
	 // Actions act2 =new Actions(driver);
	  act1.moveToElement(Ele1).build().perform();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[3]/ul/li/ul/li[2]/a/span")).click();
//	 
  }
}
