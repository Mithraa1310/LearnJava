package week3.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Deletelead {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		
		
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		
		driver.findElementByXPath("(//span[@class='x-tab-strip-inner']/span)[2]").click();
		
		driver.findElementByXPath("//input[@name='phoneNumber']").clear();
		
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("333");
		
		driver.findElementByXPath("(//button[@class='x-btn-text'])[7]").click();
		
	   Thread.sleep(5000);
		
		String leadId=driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").getText();
		System.out.println(leadId);
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"))).click();
		
		driver.findElementByXPath("//a[@class='subMenuButtonDangerous']").click();
		
		Thread.sleep(5000);
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//input[@name='id']").sendKeys(leadId);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		if(driver.findElementByXPath("//div[text()='No records to display']").isDisplayed());
		{
			System.out.println("records deleted succesfully");
		}
		driver.close();
		}
		
		

		
		
	}


