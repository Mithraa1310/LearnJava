package week4.wed;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RedbusCalendar {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_83.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver= new ChromeDriver(options);
		driver.get("http://redbus.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		String monthweneed="Oct 2020";
		String dateweneed="13";
		
		Date date = new Date();
		DateFormat sdf = new SimpleDateFormat("dd");
		String today = sdf.format(date);
		System.out.println(today);

		//sam code to select a date from current month

		/*driver.findElementById("src").sendKeys("Chennai");
		Thread.sleep(2000);
		driver.findElementById("src").sendKeys(Keys.TAB);
		driver.findElementById("dest").sendKeys("Bangalore");
		Thread.sleep(2000);
		driver.findElementById("dest").sendKeys(Keys.TAB);
		WebElement table = driver.findElementByXPath("(//table[@class='rb-monthTable first last'])[2]");
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		List<WebElement> rowFiveCells = rows.get(4).findElements(By.tagName("td"));
		rowFiveCells.get(3).click();*/

		driver.findElementById("src").sendKeys("Chennai");
		Thread.sleep(2000);
		driver.findElementById("src").sendKeys(Keys.TAB);
		driver.findElementById("dest").sendKeys("Bangalore");
		Thread.sleep(2000);
		driver.findElementById("dest").sendKeys(Keys.TAB);

		WebElement table =
				driver.findElementByXPath("(//table[@class='rb-monthTable first last'])[2]");
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		System.out.println(rows.size()); List<WebElement> cols=driver.
				findElementsByXPath("(//table[@class='rb-monthTable first last'])[2]//tr//th"); 
		System.out.println(cols.size());

		//go to following months by clicking next button

		String month =driver.findElementByXPath("(//td[@class='monthTitle'])[2]").getText();
		System.out.println(month);
		do {

			driver.findElementByXPath("(//td[@class='next']/button)[2]").click(); //click
			//the next button until oct 2020 comes 
			month = driver.findElementByXPath("(//td[@class='monthTitle'])[2]").getText();
			System.out.println("InsideDoWhile--->"+month);
			if(month.equalsIgnoreCase(monthweneed)) 
			{
				break; 
			}

		} while(!month.equalsIgnoreCase(monthweneed));
		
		driver.findElementByXPath("(//td[contains(text(),'"+dateweneed+"')])[2]").click();

	/*	for(int i=2;i<rows.size();i++) 
		{
			for(int j=1;j<cols.size();j++) 
			{
				WebElement cell=driver.findElementByXPath("(//table[@class='rb-monthTable first last'])[2]//tr["+i+"]//td["+j+"]");
				if(cell.getText().contains("13"))
					cell.click();
				break;
			} 
		}	*/

		/*
		 * WebElement calendarwidget =
		 * driver.findElementByXPath("//div[@id='rb-calendar_onward_cal']");
		 * List<WebElement> columns = calendarwidget.findElements(By.tagName("td")); for
		 * (WebElement cell: columns){
		 * System.out.println("cell.getText()"+cell.getText()); //Select 13th Date if
		 * (cell.getText().equals("13")){ cell.click(); break; }
		 * 
		 * }
		 */


	}
}


