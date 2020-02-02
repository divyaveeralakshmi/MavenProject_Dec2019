package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Lauch the chrome Browser -> call Chromedriver
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//Load the url -> Leaftaps
		driver.get("http://leaftaps.com/opentaps");
		
		//To maximize the browser window
		driver.manage().window().maximize();
		
		//Enter the valid username to login
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		//Enter the valid password to login
		driver.findElementByName("PASSWORD").sendKeys("crmsfa");
		
		//Now, click on the lgin button
		driver.findElementByClassName("decorativeSubmit").click();
		
		//Click on CRM/SFA link
		driver.findElementByLinkText("CRM/SFA").click();
		
		//Click on Leads tab
		driver.findElementByLinkText("Leads").click();
		
		//Click on creeate lead menu
		driver.findElementByLinkText("Create Lead").click();
		
		//Fill 3 mandatory field
		driver.findElementById("createLeadForm_companyName").sendKeys("CGI");
		driver.findElementById("createLeadForm_firstName").sendKeys("Divya");
		driver.findElementById("createLeadForm_lastName").sendKeys("M");
		
		//Click submit button
		driver.findElementByClassName("smallSubmit").click();
		
		//Get the title of the page
		String title = driver.getTitle();
		
		//close the browser
		driver.close();
		
		
		
		System.out.println("Title of the Page : "+title);
		
	}

}
