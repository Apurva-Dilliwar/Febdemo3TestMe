import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import hdc2demos.Driverhdc2;

public class Actiondemo {
  @Test(enabled=false)
  public void keyboardActions() throws Exception {
	  WebDriver driver;
	  driver= Driverhdc2.getDriver("CRM");
	  driver.get("http://www.google.com");
	  WebElement search =driver.findElement(By.name("q"));
	  driver.manage().window().maximize();
//	  search.sendKeys("accenture");
	  Actions act=new Actions(driver);
//	  search.sendKeys(keysToSend);
//	  act.keyDown(search,Keys.SHIFT).sendKeys("accenture").keyUp(Keys.SHIFT).build().perform();
	  act.keyDown(search,Keys.ALT).sendKeys("accenture").keyUp(Keys.ALT).build().perform();
	  Thread.sleep(3000);
	  act.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).build().perform();
	  act.sendKeys(Keys.ENTER).build().perform();
  }
  @Test//(enabled=false)
  public void Actionmouseclick() throws Exception {
	  WebDriver driver;
	  driver= Driverhdc2.getDriver("CRM");
	  driver.get("https://www.spicejet.com/");
	  driver.manage().window().maximize();
	  WebElement Ele =driver.findElement(By.xpath("//a[@id='highlight-addons']"));
	  Actions act1 =new Actions(driver);
	  act1.moveToElement(Ele).build().perform();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//a[text()='MyFlexiPlan']")).click();
  }
  @Test(enabled=false)
  public void ActionmouseRightclick() throws Exception {
	  WebDriver driver;
	  driver= Driverhdc2.getDriver("CRM");
	  driver.get("https://www.google.com/");
	  driver.manage().window().maximize();
	  Thread.sleep(2000);;
	  WebElement Ele1 =driver.findElement(By.xpath("//a[text()='Gmail']"));
	  Actions act2 =new Actions(driver);
	  act2.contextClick(Ele1).build().perform();
  }
  @Test(enabled=false)
  public void ActionmouseDoubleclick() throws Exception {
	  WebDriver driver;
	  driver= Driverhdc2.getDriver("CRM");
	  driver.get("http://demowebshop.tricentis.com/");
	  driver.manage().window().maximize();
	  Thread.sleep(2000);;
	  WebElement Ele2 =driver.findElement(By.xpath("//span[text()='Sign up for our newsletter:']"));
	  Actions act3 =new Actions(driver);
	  act3.doubleClick(Ele2).build().perform();
  }
	  @Test(enabled=false)
	  public void Actionmousedragndrop() throws Exception {
		  WebDriver driver;
		  driver=Driverhdc2.getDriver("CRM");
		  driver.get("http://demos.telerik.com/aspnet-ajax/treeview/examples/overview/defaultcs.aspx");
		  // Thread.sleep(2000);
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  WebElement src=driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceholder1_RadTreeView1\"]/ul/li/ul/li[3]/ul/li[1]/div/div/span"));
		  WebElement dest=driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceholder1_RadGrid1_ctl00__0\"]/td[1]"));
		  Actions acts=new Actions(driver);
		  acts.dragAndDrop(src,dest).build().perform();
		  //acts.click(src,dest).build().perform();
		  //for verification of dnd
		  Thread.sleep(5000);
		  WebElement s1=driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceholder1_RadGrid1_ctl00__0\"]/td[1]"));
		  Thread.sleep(2000);
		  String A_val=s1.getText();
		  System.out.println(A_val);
		  String E_val="$0";
		  Assert.assertEquals(A_val,E_val);
		  System.out.println("Drag and drop is successful");
		  
		  
}
}
