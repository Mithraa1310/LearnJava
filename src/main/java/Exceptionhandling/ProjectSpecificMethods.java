package Exceptionhandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;



public class ProjectSpecificMethods {
	

		public static ChromeDriver driver;
		
		@BeforeMethod
			public void startApp()/*throws InterruptedException*/ {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();
				driver.get("http://leaftaps.com/opentaps/control/main");
				driver.manage().window().maximize();
				try
				{
				Thread.sleep(2000);
				}
				catch(InterruptedException e)
				{
					System.out.println("Handle it");
					e.printStackTrace();
				}
				finally
				{
					System.out.println("my job is over");
				}
				
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				
			}	
			
			@AfterMethod
			public void closeApp() {

				driver.close();
		}

}
