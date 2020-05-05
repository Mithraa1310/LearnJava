package week4.wed;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Evarsity {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_83.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://113.193.159.106/evarsityteamtrust/usermanager/loginManager/youLogin.jsp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementById("login").sendKeys("mnm081");
		driver.findElementById("passwd").sendKeys("01051985");
		driver.findElementById("_save").click();
		WebElement table = driver.findElementById("tabProfile");
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		System.out.println(rows);
		String ProfileName=driver.findElementByXPath("(//table[@id='tabProfile']//tr[2]/td)[2]").getText();
		System.out.println(ProfileName);
		if(ProfileName.contains("SARAVANAN"))
		{
			System.out.println("Login Success");
		}
		else
		{
			System.out.println("not success");
		}
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElementByLinkText("Menu").click();
		driver.findElementByXPath("//div[@id='tabMenu']/h3[2]").click();
		driver.findElementByLinkText("Internal Mark Entry").click();
		driver.findElementByXPath("//img[@class='ui-datepicker-trigger']").click();
		do
		{
		WebElement month = driver.findElementByXPath("ui-datepicker-month");
		if(month.getText().equalsIgnoreCase("October"))
		{
			WebElement table1 = driver.findElementByXPath("//table[@class='ui-datepicker-calendar']");
			List<WebElement> rows1 = table1.findElements(By.tagName("tr"));	
			System.out.println(rows1);
		}
		else
		{
			driver.findElementByXPath("//span[text()='Next']").click();
		}
		}while(true);
		

	}

}
