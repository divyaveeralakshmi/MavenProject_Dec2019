package week4.day2;

import org.testng.annotations.Test;

public class CreateLead extends ParameterizationProjectSpecificMethods{
	  @Test(dataProvider="sendData")
	  	public void runCreateLead(String cName, String fName, String lName)
	  	{
	  		driver.findElementByLinkText("Create Lead").click();
	  		driver.findElementById("createLeadForm_companyName").sendKeys(cName);
	  		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
	  		driver.findElementById("createLeadForm_lastName").sendKeys(lName);
	  		driver.findElementByName("submitButton").click();
	  		
	  }
	  }
