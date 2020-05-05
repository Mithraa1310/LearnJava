package week2.day4;


	import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Guru99upload {

		public static void main(String[] args) throws AWTException {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.navigate().to("http://demo.guru99.com/test/upload/");
			
			/*WebElement id = driver.findElementById("uploadfile_0");
	id.sendKeys("C:\\Users\\Acer\\Desktop\\my gmail.txt");

	WebElement cb = driver.findElementById("terms");
	if(!cb.isSelected()) 
	{
	cb.click();	
	}
		driver.findElementById("submitbutton").click();
		
		}

	}*/
			
			//not working with robot class
			driver.findElementByXPath("//input[@id='uploadfile_0']").click();

	Robot robo=new Robot();
	
	//copy filepath into clipboard
	StringSelection str=new StringSelection("C:\\Users\\Acer\\Downloads\\XPath.txt");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null); 
	
	//pressing control+v
	robo.keyPress(KeyEvent.VK_CONTROL);
	robo.keyPress(KeyEvent.VK_V);
	
	//releasing control+v
	robo.keyRelease(KeyEvent.VK_CONTROL);
	robo.keyRelease(KeyEvent.VK_V);
	
	//Enter
	robo.keyPress(KeyEvent.VK_ENTER);
	robo.keyRelease(KeyEvent.VK_ENTER);
		}
	}


