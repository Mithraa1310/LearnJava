package week2.day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Tooltip { //not working

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElementByXPath("//img[@alt='tooltip']").click();
		
		/*(WebElement tb = driver.findElementById("age");

		String attribute = tb.getAttribute("title");
		System.out.println("Tooltip is:" +attribute);) lakshmi's code*/
		
		//Actions action=new Actions(driver);
		//action.moveToElement(driver.findElementById("age")).build().perform();// not working with action class
		
		WebElement text=driver.findElementById("age");
		String tooltip=text.getAttribute("title");
		System.out.println(tooltip);
		
		
			
	}

}
