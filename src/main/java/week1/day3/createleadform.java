package week1.day3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class createleadform {
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
		driver.findElementById("createLeadForm_personalTitle").sendKeys("Mrs.");
		
		WebElement source=driver.findElementById("createLeadForm_dataSourceId");
		Select dropDown=new Select(source);
		dropDown.selectByValue("LEAD_DIRECTMAIL");
		
		driver.findElementById("createLeadForm_lastName").sendKeys("Sundar");
		driver.findElementById("createLeadForm_sicCode").sendKeys("3344");
		
		WebElement Market=driver.findElementById("createLeadForm_marketingCampaignId");
		Select dropDown4=new Select(Market);
		//dropDown4.selectByValue("Automobile");
		dropDown4.selectByVisibleText("Automobile");
		
		driver.findElementById("createLeadForm_annualRevenue").sendKeys("400000");
		
		WebElement Industry=driver.findElementById("createLeadForm_industryEnumId");
		Select dropDown2=new Select(Industry);
		dropDown2.selectByValue("IND_FINANCE");
		
		WebElement Owner=driver.findElementById("createLeadForm_ownershipEnumId");
		Select dropDown3=new Select(Owner);
		dropDown3.selectByVisibleText("Partnership");
		
		driver.findElementByName("lastNameLocal").sendKeys("M");
		driver.findElementByName("departmentName").sendKeys("Technical");
		
		WebElement Cur=driver.findElementById("createLeadForm_currencyUomId");
		Select dropDown5=new Select(Cur);
		dropDown5.selectByValue("LKR");
		

		driver.findElementById("createLeadForm_numberEmployees").sendKeys("10000");
		driver.findElementById("createLeadForm_tickerSymbol").sendKeys("TLSL");
		driver.findElementById("createLeadForm_description").sendKeys("TestLeaf is a leading company");
		driver.findElementById("createLeadForm_importantNote").sendKeys("leads");
		driver.findElementById("createLeadForm_firstNameLocal").sendKeys("Radhi");
		driver.findElementById("createLeadForm_generalProfTitle").sendKeys("job");
		driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("91");
		driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("044");
		driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("22");
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("4325678");
		driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("radhika");
		driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("leaftaps.com");
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("radhikass@gmail.com");
		driver.findElementById("createLeadForm_generalToName").sendKeys("Techie");
		driver.findElementById("createLeadForm_generalAttnName").sendKeys("Person1");
		driver.findElementById("createLeadForm_generalAddress1").sendKeys("22,college road");
		driver.findElementById("createLeadForm_generalAddress2").sendKeys("nanganallur");
		driver.findElementById("createLeadForm_generalCity").sendKeys("chennai");
		driver.findElementById("createLeadForm_generalPostalCode").sendKeys("600061");
		driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("1234");
		driver.findElementById("createLeadForm_generalStateProvinceGeoId").sendKeys("Tamilnadu");
		driver.findElementByName("submitButton").click();
		
		

	}

}
