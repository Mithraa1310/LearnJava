package week2.day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waitforalert {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/alertappear.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElementByXPath("//button[@id='alert']").click();
		
		//driver.switchTo().alert();
		
		WebDriverWait  wait11=new WebDriverWait(driver,35);
		wait11.until(ExpectedConditions.alertIsPresent());
		
		String text=driver.switchTo().alert().getText();
		System.out.println(text);
		if(text.contains("Hurray"))
		{
			System.out.println("Alert displayed");
		}
		else
		{
			System.out.println("No Alert");
		}
	}

}
