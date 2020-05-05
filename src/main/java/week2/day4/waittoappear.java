
package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waittoappear {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/appear.html");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebDriverWait  wait1=new WebDriverWait(driver,35);
		 wait1.until(ExpectedConditions.visibilityOf(driver.findElementByXPath("//button[@id='btn']/b")));
		 String element =driver.findElementByXPath("//button[@id='btn']/b").getText();
		System.out.println(element);
		
		  System.out.print("Label is now visible");
		
		

	}

}
