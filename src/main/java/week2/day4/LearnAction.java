package week2.day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnAction { //drag and drop

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://jqueryui.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementByXPath("//a[text()='Droppable']").click();
		Thread.sleep(3000);
		Actions action1=new Actions(driver);
		WebElement from = driver.findElementById("draggable");
		WebElement to = driver.findElementById("droppable");
		action1.dragAndDrop(from, to).build().perform();;
		
		

	}

}
