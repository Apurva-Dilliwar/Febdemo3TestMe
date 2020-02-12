package hdc2demos;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

//import java.awt.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testmeapp{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
            WebDriver Apurva;
            System.setProperty("webdriver.chrome.driver","C:\\Users\\Training1\\Downloads\\Selenium\\BrowserDrivers\\chromedriver.exe");
            Apurva =new ChromeDriver();
            Apurva.get("http://172.31.36.202:443/TestMeApp/fetchcat.htm");
            Apurva.findElement(By.linkText("SignIn")).click();
            WebElement un= Apurva.findElement(By.name("userName"));
            WebElement pa= Apurva.findElement(By.name("password"));
            //WebElement ps=Apurva.findElement(By.id("pass"));
            un.sendKeys("Lalitha");
            pa.sendKeys("Password123");
            Apurva.findElement(By.name("Login")).click();
	}
}