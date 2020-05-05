package testNGbase;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import utils.ReadExcel;

public class Projectspecificdynamic {

public static ChromeDriver driver;
	
	@Parameters({"url","username","password"})
	@BeforeMethod
	public void startApp(String url,String username,String password) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys(username);
		driver.findElementById("password").sendKeys(password);
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
	}
	
	@AfterMethod
	public void closeApp() {

		driver.close();
}

	@DataProvider(name="fetchData")
	public String[][] sendData() throws IOException
	{
	/*String[][] data=new String[2][3];
	data[0][0]="TestLeaf";
	data[0][1]="sam";
	data[0][2]="Lazarus";
	data[1][0]="TestLeaf";
	data[1][1]="Naveen";
	data[1][2]="Elumalai";
	
	return data;*/
		return ReadExcel.readexcel();
	}
}
