package week2.day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learnbutton {//output verified

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementByXPath("//button[@id='home']").click();
		driver.findElementByXPath("//img[@alt='Buttons']").click();
		Point location = driver.findElementByXPath("//button[@id='position']").getLocation();
		System.out.println(location);
		String cssValue = driver.findElementByXPath("//button[@id='color']").getCssValue("color");
		System.out.println(cssValue);
		Thread.sleep(3000);
		Dimension size = driver.findElementByXPath("//button[@id='size']").getSize();
		 System.out.println(size);
		
	}

}
