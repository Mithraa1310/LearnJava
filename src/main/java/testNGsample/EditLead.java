package testNGsample;

import org.testng.annotations.Test;

import testNGbase.ProjectSpecificMethods;

public class EditLead extends ProjectSpecificMethods{

	@Test
	public void Edit() throws InterruptedException {
		
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//span[text()='Phone']").click();
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("123");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(4000);
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
		driver.findElementByLinkText("Edit").click();
		driver.findElementById("updateLeadForm_companyName").sendKeys("TCS");
		driver.findElementByName("submitButton").click();
	
}
}






