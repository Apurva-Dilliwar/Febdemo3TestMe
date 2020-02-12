import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import hdc2demos.Driverhdc2;

public class Windows {
  @Test
  public void windows() throws InterruptedException {
		  WebDriver driver;
		  driver=Driverhdc2.getDriver("CRM");
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  driver.get("https://retail.onlinesbi.com/retail/login.htm");
		  driver.manage().window().maximize();
		 
		  String P_ID= driver.getWindowHandle();
		  System.out.println("Parent window id is : " + P_ID);
		  driver.findElement(By.xpath("//*[@id=\"homeLoanButton\"]/a/img")).click();
		  Thread.sleep(2000);
	//	  driver.findElement(By.xpath("//*[@id=\"mainMenu\"]/ul/li[8]/a"));
		  String C1_ID= driver.getWindowHandle();
		  System.out.println("child window id is : " + C1_ID);
		  //driver.switchTo().window
		  //driver.close();
		 // driver.quit();
		  Set<String> T_Windows =driver.getWindowHandles();
		  
		  for(String S: T_Windows)
		  {
			  driver.switchTo().window(S);
			  String Itr_id= driver.getWindowHandle();
			  System.out.println("The window this time is : " + Itr_id); 
		  }
		  driver.findElement(By.xpath("//*[@id=\"mainMenu\"]/ul/li[8]/a")).click();//child window
		  driver.switchTo().window(P_ID); 
  }
}
