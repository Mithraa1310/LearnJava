package week1.day3;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class firstsel {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("Demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByPartialLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
		driver.findElementById("createLeadForm_firstName").sendKeys("Radhika");
		driver.findElementById("createLeadForm_lastName").sendKeys("Sundar");
		driver.findElementById("createLeadForm_personalTitle").sendKeys("Mrs.");
		driver.findElementById("createLeadForm_annualRevenue").sendKeys("400000");
		driver.findElementById("createLeadForm_sicCode").sendKeys("3344");
		driver.findElementByName("desciption").sendKeys("TestLeaf is a leading company");
		driver.findElementByName("importantNote").sendKeys("leads");
		driver.findElementByName("lastNameLocal").sendKeys("M");
		driver.findElementByName("departmentName").sendKeys("Technical");
		driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Leader");
		
		WebElement Cur=driver.findElementById("createLeadForm_currencyUomId");
		Select dropDown5=new Select(Cur);
		dropDown5.selectByValue("LKR-Sri Lankan Rupee");
		
		WebElement Market=driver.findElementById("createLeadForm_marketingCampaignId");
		Select dropDown4=new Select(Market);
		//dropDown4.selectByValue("Automobile");
		dropDown4.selectByVisibleText("Automobile");
		
		WebElement source=driver.findElementById("createLeadForm_dataSourceId");
		Select dropDown=new Select(source);
		dropDown.selectByValue("LEAD_DIRECTMAIL");
		
		WebElement Industry=driver.findElementById("createLeadForm_industryEnumId");
		Select dropDown2=new Select(Industry);
		dropDown2.selectByValue("IND_FINANCE");
		
		WebElement Owner=driver.findElementById("createLeadForm_ownershipEnumId");
		Select dropDown3=new Select(Owner);
		dropDown3.selectByVisibleText("Partnership");
		//List<WebElement> options = dropDown2.getOptions();
		//System.out.println("Industry's option size is" + options);
		
		
		
	}

}
