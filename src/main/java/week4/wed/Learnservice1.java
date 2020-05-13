package week4.wed;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Learnservice1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://dev76455.service-now.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.switchTo().frame(0);
		driver.findElementByXPath("//input[@class='form-control']").sendKeys("admin");
		driver.findElementByXPath("(//input[@class='form-control'])[2]").sendKeys("Pleasesaveus#3 or Confusingservice1 ");
		//jokesapart$ is the password for postman
		//Aiyyokadavule jira password
		
		driver.findElementById("sysverb_login").click();
		
		//testcase1
		//driver.findElementByXPath("//input[@name='filter']").sendKeys("Incidents");
		
		
	}//https://developer.servicenow.com/blog.do?p=/post/inbound-oauth-auth-code-grant-flow-part-1/

}
