package week2.day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousemovement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Actions action1=new Actions(driver);
		action1.moveToElement(driver.findElementByXPath("//a[@id='highlight-addons']")).build().perform();
		Thread.sleep(3000);
		driver.findElementByXPath("//a[text()='SpiceMax ']").click();
		

	}

}



