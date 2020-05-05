package testNGsample;

import org.testng.annotations.Test;

import testNGbase.ProjectSpecificMethods;

public class CreateLead extends ProjectSpecificMethods {

	@Test
	public  void Create()  {
		
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
		driver.findElementById("createLeadForm_firstName").sendKeys("Gopi");
		driver.findElementById("createLeadForm_lastName").sendKeys("J");
		driver.findElementByName("submitButton").click();
		
}


}



