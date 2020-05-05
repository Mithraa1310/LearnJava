package week2.day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitfortextchange {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/TextChange.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementById("btn").click();
		driver.switchTo().alert().accept();
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.textToBePresentInElement(driver.findElementById("btn"), "Click ME!"));
		
		String text=driver.findElementById("btn").getText();
		if(text.contains("Click ME!"))
		{
			System.out.println("Changed");
		}
		else
		{
			System.out.println("No change");
		}
		
		
	}
}
