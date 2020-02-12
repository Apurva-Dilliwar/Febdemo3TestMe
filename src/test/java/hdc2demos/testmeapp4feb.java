package hdc2demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class testmeapp4feb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver Apurva;
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Training1\\Downloads\\Selenium\\BrowserDrivers\\chromedriver.exe");
        Apurva =new ChromeDriver();
        Apurva.manage().window().maximize();
        Apurva.get("http://172.31.36.202:443/TestMeApp/fetchcat.htm");
        Apurva.findElement(By.linkText("SignUp")).click();
        WebElement que= Apurva.findElement(By.xpath("//select[@name='securityQuestion']"));
        Select sel =new Select(que);
        sel.selectByValue("411010");
        
        		
	}

}
