package week2.day4;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learnhyperlinks { 

	@SuppressWarnings("null")
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementByXPath("//a[text()='Go to Home Page']").click();
		driver.findElementByXPath("//img[@alt='Link']").click();
		String attribute1 = driver.findElementByLinkText("Find where am supposed to go without clicking me?").getAttribute("href");
		System.out.println(attribute1);
		
		String attribute = driver.findElementByLinkText("Verify am I broken?").getAttribute("href");
		if((attribute==null)&&(attribute.isEmpty()))
				{
			System.out.println("link is broken");
				}
		else 
		{
			System.out.println("link is not broken");
		}
		
		driver.findElementByXPath("//a[text()='Go to Home Page']").click();
		driver.findElementByXPath("//img[@alt='Link']").click();
		driver.findElementByXPath("//a[text()='How many links are available in this page?']").click();
		List<WebElement> links = driver.findElementsByXPath("//div[@class='large-6 small-12 columns']");
		System.out.println(links.size());
		
	}

	
}
