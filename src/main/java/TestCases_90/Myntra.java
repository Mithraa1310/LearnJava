package TestCases_90;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Myntra {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_83.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver= new ChromeDriver(options);
		driver.get(" https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElementByPartialLinkText("Women"));
		driver.findElementByLinkText("Jackets & Coats").click();
		String count=driver.findElementByClassName("title-count").getText();
		String extractnum=count.replaceAll("\\D", "");
		
		
		driver.findElementByXPath("(//label[@class='common-customCheckbox vertical-filters-label']/input)[2]").click();
		driver.findElementByXPath("//div[@class='brand-more']").click();
		driver.findElementByXPath("(//label[@class='vertical-filters-label common-customCheckbox'])[5]").click();
		List<WebElement> mangoproducts = driver.findElementsByXPath("//picture[@class='img-responsive']//img");
		for(WebElement each:mangoproducts)
		{
			if(each.getText().contains("MANGO"))
			{
				System.out.println("Coats are verified");
				System.out.println(each.getText());
			}
		}
		driver.findElementByXPath("//span[@class='myntraweb-sprite sort-downArrow sprites-downArrow']").click();
		driver.findElementByXPath("//input[@value='discount']").click();
		String text=driver.findElementByXPath("(//span[@class='product-discountedPrice'])[1]").getText();
		//integer conversion to be done
		Actions action1=new Actions(driver);
		action1.moveToElement(driver.findElementByXPath("(//span[@class='product-sizeInventoryPresent'])[1]"));
		driver.findElementByXPath("//span[text()='wishlist now']").click();
		driver.close();
		
	}

}
