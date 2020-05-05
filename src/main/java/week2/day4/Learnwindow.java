package week2.day4;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Learnwindow { //output verified

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_83.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/Window.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//open home page 
		driver.findElementById("home").click();
		String ss=driver.getWindowHandle();
		System.out.println(ss);
		
		//open multiple windows
		driver.findElementByXPath("//button[text()='Open Multiple Windows']").click();
		Set<String> ss2=driver.getWindowHandles();
		List<String> ls=new ArrayList<String>(ss2);
		driver.switchTo().window(ls.get(1));
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(ls.get(2));
		System.out.println(driver.getTitle());
		driver.close();
		
		//dont close me button
		driver.findElementByXPath("//button[@id='color']").click();
		Set<String> ss3=driver.getWindowHandles();
		List<String> ls1=new ArrayList<String>(ss3);
		driver.switchTo().window(ls1.get(1));
		driver.close();
		driver.switchTo().window(ls1.get(2));
		driver.close();
		
		//wait button
		
		/*driver.findElementByXPath("//button[text()='Wait for 5 seconds']").click();
		Thread.sleep(5000);
		Set<String> ss4=driver.getWindowHandles();
		List<String> ls2=new ArrayList<String>(ss4);
		driver.switchTo().window(ls2.get(1));
		driver.switchTo().window(ls2.get(2));*/
		
		
		
		
		

	}

}
