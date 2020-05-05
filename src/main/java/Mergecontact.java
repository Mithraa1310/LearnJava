import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mergecontact {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByXPath("//a[text()='Contacts']").click();
		driver.findElementByXPath("//a[text()='Merge Contacts']").click();
		driver.findElementByXPath("(//img[@alt='Lookup'])[1]").click();
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();
		driver.findElementByXPath("//a[text()='DemoContact1']").click();
		driver.findElementByXPath("//button[text()='Merge']").click();
		
		//alert
		Alert alrt = driver.switchTo().alert();
		alrt.accept();
		
	}

}
