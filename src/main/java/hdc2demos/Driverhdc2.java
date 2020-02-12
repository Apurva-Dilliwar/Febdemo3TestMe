package hdc2demos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Driverhdc2 {
	public static WebDriver getDriver(String br) {
		if(br.contentEquals("CRM"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training1\\Downloads\\Selenium\\BrowserDrivers\\chromedriver.exe");
			return new ChromeDriver();
		}
		else if(br.contentEquals("IEE"))
		{
			System.setProperty("webdriver.ie.driver", "C:\\Users\\Training1\\Downloads\\Selenium\\BrowserDrivers\\IEDriverServer.exe");
			return new InternetExplorerDriver();
		}
		else if(br.contentEquals("FF"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Training1\\Downloads\\Selenium\\BrowserDrivers\\geckodriver.exe");
			return new FirefoxDriver();
		}
		else
		return null;
	}

}
