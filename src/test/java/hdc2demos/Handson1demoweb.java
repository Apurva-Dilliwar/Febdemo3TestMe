package hdc2demos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Handson1demoweb {
  @Test
  public void keyboardactions() throws InterruptedException {
	  WebDriver driver;
	  driver=Driverhdc2.getDriver("CRM");
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  driver.get("http://demowebshop.tricentis.com/");
	  driver.manage().window().maximize();
	  WebElement search =driver.findElement(By.name("q"));
	  Actions act=new Actions(driver);
	  act.keyDown(search,Keys.ALT).sendKeys("computer").keyUp(Keys.ALT).build().perform();
	  Thread.sleep(3000);
	  act.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).build().perform();
	  act.sendKeys(Keys.ENTER).build().perform();
	  driver.close();
  }
}
