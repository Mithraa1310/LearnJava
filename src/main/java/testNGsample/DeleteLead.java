package testNGsample;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import testNGbase.ProjectSpecificMethods;

public class DeleteLead extends ProjectSpecificMethods{

	@Test
	public void Delete() throws InterruptedException {
		
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//span[text()='Phone']").click();
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("123");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(5000);
		WebElement leadID = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)");
		String text2 = leadID.getText();
		leadID.click();
		//driver.findElementByXPath("(//td[contains(@class,'x-grid3-col x-grid3-cell')]//div)[1]").click();
		Thread.sleep(3000);
		driver.findElementByLinkText("Delete").click();
//		driver.findElementByXPath("(//div[@class='frameSectionExtra']//a)[4]").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//input[@name='id']").sendKeys(text2);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		String text = driver.findElementByClassName("x-paging-info").getText();
		if (text.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}
		
}
}






