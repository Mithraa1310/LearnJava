package week2.day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {  //output verified

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_state_switch4");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//button[text()='Try it']").click();
		Alert al = driver.switchTo().alert();
		al.sendKeys("Cosmopolitan");
		Thread.sleep(5);
		al.accept();
		WebElement ss = driver.findElementByXPath("//p[@id='demo']");
		System.out.println(ss.getText());
		Alert al1 = driver.switchTo().alert();
		al1.dismiss();
		
		
		
	}

}
