package TestCases_90;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Honda {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_83.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver= new ChromeDriver(options);
		driver.get("https://www.honda2wheelersindia.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementByXPath("//button[@class='close']").click();
		
		driver.findElementByPartialLinkText("Scooter").click();
		WebDriverWait wait=new WebDriverWait(driver,30);
		 wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByXPath("(//div[@class='item'])[4]//img")));
		driver.findElementByXPath("(//div[@class='item'])[4]//img").click();
		driver.findElementByLinkText("Specifications").click();
		WebDriverWait wait1=new WebDriverWait(driver,30);
		 wait1.until(ExpectedConditions.elementToBeClickable(driver.findElementByLinkText("ENGINE")));
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElementByLinkText("ENGINE"));
		String displacement1=driver.findElementByXPath("(//ul[@class='tab_content'])[2]//li[3]/span[2]").getText();
		System.out.println(displacement1);
		driver.findElementByPartialLinkText("Scooter").click();
		driver.findElementByXPath("(//div[@class='item'])[6]//img").click();
		driver.findElementByLinkText("Specifications").click();
		Actions action1=new Actions(driver);
		action1.moveToElement(driver.findElementByLinkText("ENGINE"));
		String displacement2=driver.findElementByXPath("(//ul[@class='tab_content'])[2]//li[3]/span[2]").getText();
		System.out.println(displacement2);
		//comparison yet to do
		

		
		driver.findElementByLinkText("FAQ").click();
		driver.findElementByLinkText("Activa 125 BS-VI").click();

	}

}
