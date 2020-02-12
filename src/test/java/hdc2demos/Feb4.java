package hdc2demos;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Feb4 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver Apurva;
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Training1\\Downloads\\Selenium\\BrowserDrivers\\chromedriver.exe");
        Apurva =new ChromeDriver();
        Apurva.get("http://demowebshop.tricentis.com/");
        Apurva.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebDriverWait wait1 = new WebDriverWait(Apurva,60);
//        Waits.Util(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("")));
        Apurva.manage().window().maximize();
        Thread.sleep(3000);
        List<WebElement> t_links= Apurva.findElements(By.tagName("a"));
        int n_links=t_links.size();
        System.out.println(n_links);
        for(int i=0;i<n_links;i++)
        {
        	String l_links = t_links.get(i).getText();
        	System.out.println("The "+i+"th "+"link is: "+l_links);
        }
	}

}
