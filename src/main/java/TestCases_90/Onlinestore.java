package TestCases_90;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Onlinestore {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_83.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://store.hp.com/in-en/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


		Actions action=new Actions(driver);
		action.moveToElement(driver.findElementByXPath("//span[text()='Laptops']"));
		driver.findElementByXPath("(//span[text()='Pavilion'])[1]").click();
		driver.findElementByXPath("(//dt[@class='filter-options-title allow'])[5]").click();
		driver.findElementByXPath("(//input[@class='product-filter-checkbox'])[2]").click();
		Thread.sleep(3000);
		//hard drive(//input[@class='product-filter-checkbox'])[22]
		driver.findElementByXPath("//span[text()='More than 1 TB']").click();
		Thread.sleep(3000);
		WebElement sortBy=driver.findElementById("sorter");
		Select dropdownsort=new Select(sortBy);
		dropdownsort.selectByVisibleText(" Price : Low to High ");
		
		
		
		
	}

}
