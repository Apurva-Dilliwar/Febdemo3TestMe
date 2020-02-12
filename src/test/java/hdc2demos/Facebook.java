package hdc2demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 WebDriver Apurva;
         System.setProperty("webdriver.chrome.driver","C:\\Users\\Training1\\Downloads\\Selenium\\BrowserDrivers\\chromedriver.exe");
         Apurva =new ChromeDriver();
         Apurva.get("https://www.facebook.com/");
         WebElement fn= Apurva.findElement(By.name("firstname"));
         WebElement ln= Apurva.findElement(By.name("lastname"));
         WebElement rm= Apurva.findElement(By.name("reg_email__"));
         WebElement pass= Apurva.findElement(By.name("reg_passwd__"));
         WebElement day= Apurva.findElement(By.name("birthday_day"));
         WebElement month= Apurva.findElement(By.name("birthday_month"));
         WebElement year= Apurva.findElement(By.name("birthday_year"));
         fn.sendKeys("Apurva");
         ln.sendKeys("Dilliwar");
         rm.sendKeys("8982777394");
         pass.sendKeys("9424130994");
         day.sendKeys("8");
         month.sendKeys("feb");
         year.sendKeys("1995");
         Apurva.findElement(By.xpath("//label[text()='Female']")).click();
         Apurva.findElement(By.name("websubmit")).click();
        // Thread.sleep(500);
         Apurva.close();
	}

}
