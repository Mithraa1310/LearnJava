package week2.day4;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Downloadfile {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementByXPath("//img[@alt='Download']").click();
		driver.findElementByXPath("//a[text()='Download Excel']").click();
		File file=new File("C:\\Users\\Acer\\Downloads");
		File[] filelocation=file.listFiles();
		for(File file1:filelocation)
		{
			if(file1.getName().contains("testleaf"))
			{
				System.out.println("file downloaded");
				break;
			}
		}

	}

}
