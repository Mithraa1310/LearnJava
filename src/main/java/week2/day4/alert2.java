package week2.day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;
//output verified
public class alert2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementByXPath("//img[@alt='Alert']").click();
		
		driver.findElementByXPath("//button[text()='Alert Box']").click();
		driver.switchTo().alert().accept();
		
		driver.findElementByXPath("//button[text()='Confirm Box']").click();
		TargetLocator switch1 = driver.switchTo();
		switch1.alert().dismiss();
		
		driver.findElementByXPath("//button[text()='Line Breaks?']").click();
		TargetLocator switch3 = driver.switchTo();
		switch3.alert().accept();
		
		driver.findElementByXPath("//button[text()='Sweet Alert']").click();
		TargetLocator switch4 = driver.switchTo();
		switch4.alert().accept();
		
		
		
		
		
		
		driver.findElementByXPath("//button[text()='Prompt Box']").click();
		TargetLocator switch2 = driver.switchTo();
		switch2.alert().sendKeys("Mithraa");
		switch2.alert().accept();


}
}