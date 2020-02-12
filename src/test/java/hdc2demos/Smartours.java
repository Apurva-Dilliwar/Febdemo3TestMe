package hdc2demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Smartours {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           WebDriver Apurva;
           System.setProperty("webdriver.chrome.driver","C:\\Users\\Training1\\Downloads\\Selenium\\BrowserDrivers\\chromedriver.exe");
           Apurva =new ChromeDriver();
           Apurva.manage().window().maximize();
           Apurva.get("https://smartours.com/new-tours/");
           WebElement Src=Apurva.findElement(By.xpath("//span[text()='destination']"));
           //Select sel= 
           WebElement dat =Apurva.findElement(By.xpath("//span[text()='select date']"));
           WebElement  price =Apurva.findElement(By.xpath("//span[text()='price']"));
           
           Apurva.findElement(By.name("search")).click();
	}

}
