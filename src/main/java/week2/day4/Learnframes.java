package week2.day4;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learnframes {  //output verified

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/frame.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//first frame
		driver.switchTo().frame(0);
		driver.findElementByXPath("//button[@id='Click']").click();
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		
		
		//second frame
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		
		driver.findElementByXPath("//button[text()='Click Me']").click();
		
		//no.of frames
	 List<WebElement> frames = driver.findElementsByTagName("iframe");
	 System.out.println(frames.size());
		
}
}