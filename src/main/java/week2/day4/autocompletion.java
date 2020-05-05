package week2.day4;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autocompletion { //o/p verified

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementByXPath("//img[@alt='Auto Complete']").click();
		driver.findElementById("tags").sendKeys("W");
	List<WebElement> elements=driver.findElementsByXPath("//*[@id='ui-id-1']/li");
	
	for (WebElement options : elements) {
		
		if(options.getText().equals("Web Services"))
			options.click();
		break;
	}
	}

}
