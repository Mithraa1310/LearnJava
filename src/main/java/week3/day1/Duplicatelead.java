package week3.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Duplicatelead {

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
		driver.findElementByPartialLinkText("Find Leads").click();
		driver.findElementByXPath("(//span[@class='x-tab-strip-inner']/span)[3]").click();
		driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("babu@testleaf.com");
		driver.findElementByXPath("(//button[@class='x-btn-text'])[7]").click();
		Thread.sleep(5000);
		
		String leadfirstname=driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]").getText();
		System.out.println(leadfirstname);
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
		//driver.findElementByXPath("(//div[@class='frameSectionExtra']/a)[1]").click();
		
		//driver.findElementByXPath("(//input[@name='submitButton']").click();
		driver.findElementByLinkText("Duplicate Lead").click();
		driver.findElementByName("submitButton").click();
		
		
		
	}

}
