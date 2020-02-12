package hdc2demos;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

//import java.awt.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchGoogle {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
            WebDriver Apurva;
            System.setProperty("webdriver.chrome.driver","C:\\Users\\Training1\\Downloads\\Selenium\\BrowserDrivers\\chromedriver.exe");
            Apurva =new ChromeDriver();
            Apurva.get("http://www.google.com");
            //or Apurva.navigate().to("http://172.31.36.202:443/TestMeApp/fetchcat.htm");
            Apurva.manage().window().maximize();
            Dimension d= new Dimension(300,600);
            Apurva.manage().window().setSize(d);
            Thread.sleep(3000);
            Point p =new Point (700,300);
            Apurva.manage().window().setPosition(p);
            Thread.sleep(3000);
            String E_title = "Google";
            String A_title =Apurva.getTitle();
            if(A_title.contentEquals(E_title))
            {
            	System.out.println("page opened");
            }
            else
            {
            	System.out.println("page not opened");
            }
            Apurva.close();
            Apurva.quit();
	}

}
