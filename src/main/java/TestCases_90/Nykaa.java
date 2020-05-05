package TestCases_90;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Nykaa {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_83.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get(" https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElementByXPath("//li[@class='menu-dropdown-icon']/a"));
		action.moveToElement(driver.findElementByXPath("//a[@class='brandHeadingbox current_active']"));
		//WebDriverWait wait=new WebDriverWait(driver,30);
		//wait.until(ExpectedConditions.visibilityOf(driver.findElementByXPath("(//li[@class='brand-logo menu-links']//img)[5]")));
		driver.findElementByXPath("(//li[@class='brand-logo menu-links']//img)[5]").click();
		Set<String>  Windows=driver.getWindowHandles();
		System.out.println(Windows);
		List<String> win=new ArrayList<String>(Windows);
		driver.switchTo().window(win[1]);
		String title = driver.getTitle();
		if(title.contains("L'Oreal Paris"))
		{
			System.out.println("successfully opened");
		}
		
		
	}

}
