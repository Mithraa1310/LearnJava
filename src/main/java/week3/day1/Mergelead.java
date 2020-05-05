package week3.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Mergelead {

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
		driver.findElementByXPath("//a[text()='Merge Leads']").click();
		driver.findElementByXPath("(//img[@alt='Lookup'])[1]").click();
		Set<String> allWindows = driver.getWindowHandles();
		List<String> allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(1));
	
		driver.findElementByXPath("//input[@name='firstName']").sendKeys("karthika");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(5000);
		String leadid = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").getText();
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
		driver.switchTo().window(allhandles.get(0));
		
		driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();
		Set<String> allWindows1 = driver.getWindowHandles();
		List<String> allhandles1 = new ArrayList<String>(allWindows1);
		driver.switchTo().window(allhandles1.get(1));
		
		driver.findElementByXPath("//input[@name='firstName']").sendKeys("sam");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(5000);
		
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
		driver.switchTo().window(allhandles.get(0));
		
		driver.findElementByXPath("//a[text()='Merge']").click();
		driver.switchTo().alert().accept();
		
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//input[@name='id']").sendKeys(leadid);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		String text = driver.findElementByClassName("x-paging-info").getText();
		if (text.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}
		
		
	
		
		
		
		
		
		

	}

}
