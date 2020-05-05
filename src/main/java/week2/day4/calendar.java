package week2.day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calendar {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementByXPath("//img[@alt='Calendar']").click();
		
		//1st method.. hard coded using sendkeys
		/*WebElement calen = driver.findElementById("datepicker");
		
		 calen.sendKeys("10/05/2020",Keys.ENTER);
		 */
		
		//2nd method
		/*WebElement calen = driver.findElementById("datepicker");
		calen.click();
		WebElement clicknext = driver.findElementByXPath("//a[@title='Next']");
		clicknext.click();
		WebElement givendate = driver.findElementByXPath("//a[contains(text(),'10')]");
		
		givendate.click();*/
		
		
		//3rd method
		
		WebElement calen = driver.findElementById("datepicker");
		calen.click();
		
		WebElement month = driver.findElementByXPath("//span[contains(text(),'January')]");
		WebElement year = driver.findElementByXPath("//span[contains(text(),'2020')]");
		if(month.toString().equalsIgnoreCase("January")&&(year.toString().equals("2020")))
		{
			WebElement givendate = driver.findElementByXPath("//a[contains(text(),'10')]");
			
			givendate.click();
		}
		
		

	}

}
