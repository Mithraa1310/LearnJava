import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Erailsample {
	
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://erail.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
	driver.findElementByXPath("//input[@id='chkSelectDateOnly']").click();
	WebElement from = driver.findElementById("txtStationFrom");
	from.clear();
	from.sendKeys("Faridabad",Keys.TAB);
	WebElement to = driver.findElementById("txtStationTo");
	to.clear();
	to.sendKeys("Dhaulpur", Keys.TAB);
}
}
