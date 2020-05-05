package week2.day4;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Advancedwebtable {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_83.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.leafground.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementByXPath("//img[@alt='sort']").click();
		List<String> obj = new ArrayList<String>();
		
		//get the names from table and sort it
		WebElement table = driver.findElementById("table_id");
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		for (int i = 1; i < rows.size(); i++) {
			String name = driver.findElementByXPath("//table[@id='table_id']//tr["+i+"]//td[2]").getText();
			System.out.println(name);
			obj.add(name);
		}
		
		Collections.sort(obj);
		System.out.println(obj);
		
		
		//click on name header
		driver.findElementByXPath("//th[@class='sorting_desc']").click();
		
		//again get the values of names
		
		List<String> obj1 = new ArrayList<String>();
		for (int i = 1; i < rows.size(); i++) {
			String name1 = driver.findElementByXPath("//table[@id='table_id']//tr["+i+"]//td[2]").getText();
			obj1.add(name1);
		}
		Collections.sort(obj1);
		System.out.println(obj1);
		
		//comparison
		if(obj1.equals(obj))
		{
			System.out.println("elements are equal");
		}
		else
		{
			System.out.println("not equal");
		}

	}


}
