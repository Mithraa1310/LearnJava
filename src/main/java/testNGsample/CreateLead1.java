package testNGsample;

import org.testng.annotations.Test;

import testNGbase.Projectspecificdynamic;

public class CreateLead1 extends Projectspecificdynamic{

	@Test(dataProvider="fetchData")
	public  void Create(String cname,String fname,String lname)  {
		
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys(cname);
		driver.findElementById("createLeadForm_firstName").sendKeys(fname);
		driver.findElementById("createLeadForm_lastName").sendKeys(lname);
		driver.findElementByName("submitButton").click();
		
}
}