package week1.day1;


	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class WebtableSowmya {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_83.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://www.leafground.com/pages/sorttable.html");
			driver.manage().window().maximize();
			
			WebElement tableElement = driver.findElementById("table_id");
			List<WebElement> rows = tableElement.findElements(By.tagName("tr"));
			
			System.out.println("Row sze is" + rows.size());
			
			List<String> nameList1 = new ArrayList<String>();
			
			for (int i=1; i< rows.size(); i++)
			{
				String name = (driver.findElementByXPath("//table[@id='table_id']//tr["+i+"]/td[2]")).getText();
				System.out.println(name);
				nameList1.add(name);
				
			}
			
			driver.findElementByXPath("//tr[@role='row']/th[2]").click();
			List<String> sortedList = new ArrayList<String>();
			
			for (int i=1; i< rows.size(); i++)
			{
				String sortedName = (driver.findElementByXPath("//table[@id='table_id']//tr["+i+"]/td[2]")).getText();
				System.out.println(sortedName);
				sortedList.add(sortedName);
				
			}
			
			if(nameList1.equals(sortedList))
			{
				System.out.println("Lists are same");
			}else {
				
				System.out.println("Lists are not same");
			}
			
			driver.close();
		}
		
	}

