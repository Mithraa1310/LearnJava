package week4.wed;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hyperlink {

	public static void main(String[] args) throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		List<WebElement> attribute = driver.findElementsByTagName("a");
		//attribute.addAll(driver.findElementsByTagName("img"));
		
		System.out.println("no. of links in site" + attribute.size());
		
		List<WebElement> activelinks= new ArrayList<WebElement>();
		for(int i=0;i<attribute.size();i++)
		{
			System.out.println(attribute.get(i).getAttribute("href"));
		if((attribute.get(i).getAttribute("href")!=null)&&(!attribute.get(i).getAttribute("href").contains("javascript")))
		{
			activelinks.add(attribute.get(i));
		}

		}	
		System.out.println(activelinks.size());
	
		
	for(int j=0;j<activelinks.size();j++)
		{   //getting error in this line
			HttpURLConnection connection=(HttpURLConnection) new URL(activelinks.get(j).getAttribute("href")).openConnection();
			connection.connect();
			String response=connection.getResponseMessage();
			connection.disconnect();
			System.out.println(activelinks.get(j).getAttribute("href")+"....."+ response);
		}
	

	}

}
