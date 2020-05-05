package week2.day4;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sortables {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
		driver.findElementByXPath("//img[@alt='sortable']").click();
		List<WebElement> listele = driver.findElementsByXPath("//ul[@id='sortable']/li");
		int size1=listele.size();
		System.out.println(size1);
		WebElement from=listele.get(6);
		WebElement to=listele.get(1);
		Actions act=new Actions(driver);
		act.clickAndHold(from).moveToElement(to);
		act.release(to);
		act.build().perform();
		WebElement from1=listele.get(5);
		WebElement to1=listele.get(3);
		act.clickAndHold(from1).moveToElement(to1);
		act.release(to1);
		act.build().perform();
		
		/*for(WebElement each:listele)
		{
			String elements=each.getText();
			System.out.println(elements);
		}*/
		
	
	
		//Collections.sort(string);
		

	}

}
;