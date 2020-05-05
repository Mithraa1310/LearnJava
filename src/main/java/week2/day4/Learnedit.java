package week2.day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learnedit { //check default value

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementById("email").sendKeys("mithraajain@gmail.com");
		driver.findElementByXPath("(//div[@class='large-6 small-12 columns']/input)[2]").sendKeys("Message",Keys.TAB);
		
		
		//dont know the function to set the default value//use getAttribute
		//driver.findElementByXPath("(//div[@class='large-6 small-12 columns']/input)[3]").click();
		
		driver.findElementByXPath("(//div[@class='large-6 small-12 columns']/input)[4]").clear();
		
		boolean enabled = driver.findElementByXPath("(//div[@class='large-6 small-12 columns']/input)[5]").isEnabled();
		System.out.println(enabled);
		
		
		
		
	}

}
