package week2.day2;

import java.util.List;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.leafground.com/pages/table.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
		WebElement table=driver.findElementById("table_id");
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		List<WebElement> cols=driver.findElementsByXPath("//table[@id='table_id]//tr[1]/th");
		System.out.println("No. of rows in the table:" + rows.size());
		System.out.println("No. of cols in the table:" + cols.size());
		for(int i=2;i<=rows.size();i++)
		{
		WebElement rc=driver.findElementByXPath("//table[@id='table_id]//tr["+i+"]//td[1]");
		if(rc.getText().contains("Elements"))
		{
		WebElement progress=driver.findElementByXPath("//table[@id='table_id]//tr["+i+"]//td[2]");	
		System.out.println("Learn to interact with elements progress is:"+ progress.getText());
		}
		} 
	}

}
