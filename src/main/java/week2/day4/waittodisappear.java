package week2.day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waittodisappear {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/disapper.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebDriverWait  wait1=new WebDriverWait(driver,25);
		Boolean until = wait1.until(ExpectedConditions.invisibilityOf(driver.findElementByXPath("//button[@id='btn']")));
	System.out.println(until);
	String text=driver.findElementByXPath("//strong").getText();
	System.out.println(text);
	if(text.contains("Button is disappeared"))
	{
		System.out.println("got output");
		
	}
	else
	{
		System.out.println("error");
	}
	
	
	
	}

}
