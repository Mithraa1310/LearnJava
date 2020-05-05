package TestCases_90;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Makemytrip {

	public static void main(String[] args) {
		//LocalDate startMonth = LocalDate.now().plusMonths(1);
		//LocalDate endMonth = LocalDate.now().plusMonths(1);
		String pattern = "E MMM dd yyyy";
		LocalDate enddate = LocalDate.now().plusDays(25);
		LocalDate startdate = LocalDate.now().plusDays(20);
		System.out.println(startdate);
		System.out.println(enddate);
		String dfEnd = enddate.format(DateTimeFormatter.ofPattern(pattern));
		String dfstart = startdate.format(DateTimeFormatter.ofPattern(pattern));
		
		  String xpathStartDate = "//div[@aria-label='"+dfstart+"']";
		  System.out.println(xpathStartDate);
		  String xpathEndDate = "//div[@aria-label='"+dfEnd+"']";
		  System.out.println(xpathEndDate);
		  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver_83.exe");
		  ChromeDriver driver= new ChromeDriver();
		  driver.get("https://www.makemytrip.com/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  driver.findElementByXPath("(//span[@class='chNavText darkGreyText'])[2]").click();
		  driver.findElementByXPath("//span[text()='City / Hotel / Area / Building']").click(); 
		  driver.findElementByXPath("//input[@placeholder='Enter city/ Hotel/ Area/ Building']").sendKeys("Goa");
		  driver.findElementByXPath("//p[text()='Goa, India']").click();
		  
		 driver.findElementByXPath(xpathStartDate).click();
		 driver.findElementByXPath(xpathEndDate).click();
		 // driver.findElementByXPath(xpathStartDate).click();
		 // driver.findElementByXPath(xpathEndDate).click();
		  //String date1=driver.findElementByXPath("//div[@aria-label='Fri May 15 2020']").getText();
		   //System.out.println(date1); 
		   //convert string to integer
		  //int startdate=Integer.parseInt(date1); System.out.println(startdate);
		  
		/*
		 * SimpleDateFormat sdf = new SimpleDateFormat("dd"); Calendar c
		 * =Calendar.getInstance(); c.setTime(new Date()); // Now use today date.
		 * c.add(Calendar.DATE, 5); // Adding 5 days String output =
		 * sdf.format(c.getTime()); System.out.println(output);
		 */
		  
		  driver.findElementById("guest").click();
		  driver.findElementByXPath("//li[@data-cy='children-1']").click();
		  driver.findElementByClassName("ageSelectBox").click();
		  WebElement age=driver.findElementByClassName("ageSelectBox"); 
		  Select ageofChild=new Select(age); 
		  ageofChild.selectByVisibleText("12");
		  driver.findElementByXPath("//button[@data-cy='submitGuest']").click();
		  driver.findElementById("hsw_search_button").click(); driver.
		  findElementByXPath("//input[@placeholder='Enter location or property name']").sendKeys("Baga");
		  
		  
		 

	}

}
