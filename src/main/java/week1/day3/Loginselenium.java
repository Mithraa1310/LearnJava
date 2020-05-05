package week1.day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Loginselenium {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver= new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.findElementById("username").sendKeys("DemoSalesManager");
	driver.findElementById("password").sendKeys("crmsfa");
	driver.findElementByClassName("decorativeSubmit").click();
	driver.findElementByLinkText("CRM/SFA").click();
	driver.findElementByLinkText("Accounts").click();
	driver.findElementByPartialLinkText("Create Account").click();
	
	//create account page
	driver.findElementById("accountName").sendKeys("TestLeafmember");
	driver.findElementById("groupNameLocal").sendKeys("Mithraa");
	driver.findElementById("annualRevenue").sendKeys("4LPA");
	driver.findElementById("officeSiteName").sendKeys("Testleaf");
	driver.findElementById("numberEmployees").sendKeys("1000");
	driver.findElementById("tickerSymbol").sendKeys("a@s");
	driver.findElementById("sicCode").sendKeys("12345");
	driver.findElementByName("description").sendKeys(" Testleaf is a great environment to learn testing");
	driver.findElementByName("importantNote").sendKeys("please follow the rules");
	
	Select ownership=new Select(driver.findElementByName("ownershipEnumId"));
	ownership.selectByVisibleText("Corporation");
	
	Select currency=new Select(driver.findElementByName("currencyUomId"));
	currency.selectByVisibleText("LTL - Lithuanian Lita");
	
	WebElement industry=driver.findElementByName("industryEnumId");
	Select indus=new Select(industry);
	indus.selectByVisibleText("Aerospace");
	
	
	
	
	
	
}
}
