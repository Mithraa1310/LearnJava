package week2.day4;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Uploadfile {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementByXPath("//img[@alt='contextClick']").click();
		driver.findElementByName("filename").sendKeys("C:\\Users\\Acer\\Downloads\\XPath.txt");
		Thread.sleep(5000);
		
		
		/*Robot robo=new Robot();
		
		//copy filepath into clipboard
		StringSelection str=new StringSelection("C:\\Users\\Acer\\Downloads\\XPath.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null); 
		
		//pressing control+v
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_V);
		
		//releasing control+v
		robo.keyRelease(KeyEvent.VK_CONTROL);
		robo.keyRelease(KeyEvent.VK_V);
		
		//Enter
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);*/
		
		

	}

}
