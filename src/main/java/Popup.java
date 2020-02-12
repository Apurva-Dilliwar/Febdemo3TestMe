import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import hdc2demos.Driverhdc2;

public class Popup {
	  @Test(enabled=false)
	  public void Popupbox() throws Exception {
		  WebDriver driver;
		  driver=Driverhdc2.getDriver("CRM");
		  driver.get("https://www.tsrtconline.in/oprs-web/");
		  // Thread.sleep(2000);
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  driver.findElement(By.xpath("//input[@name='searchBtn']")).click();
		  if(ExpectedConditions.alertIsPresent()!=null)
		  {
			  System.out.println();
		  Alert alt= driver.switchTo().alert();
		  String A_text=alt.getText();
	//	  alt.getText();
		  System.out.println(alt.getText());
		  alt.accept();//for yes
	//	  alt.dismiss();//for no
		  }
		  else
		  {
			  System.out.println("no alert prsnt for launched applctn");
		  }
  }
	  @Test//(enabled=false)
	  public void Actionmousedragndrop() throws Exception {
		  WebDriver driver;
		  driver=Driverhdc2.getDriver("CRM");
		  driver.get("https://www.w3schools.com/Js/tryit.asp?filename=tryjs_alert");
		  // Thread.sleep(2000);
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  driver.switchTo().frame(driver.findElement(By.name("iframeResult")));
		  driver.findElement(By.xpath("//button[text()='Try it']")).click();
		  //driver.switchTo().defaultContent();//to come out of the frame
	  }
}

