package week2.day4;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class selectables {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementByXPath("//img[@alt='selectable']").click();
		List<WebElement> listele = driver.findElementsByXPath("//ol[@id='selectable']/li");
		int size1=listele.size();
		System.out.println(size1);
		Actions action1=new Actions(driver);
		/*action1.keyDown(Keys.CONTROL)
		.click(listele.get(0))
		.click(listele.get(1))
		.click(listele.get(2)).build().perform();
		action1.release();
		driver.close();*/
		
		
		action1.clickAndHold(listele.get(0));
		action1.clickAndHold(listele.get(1));
		action1.clickAndHold(listele.get(2));
		action1.build().perform();
		

	}

}
