package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead_Using_Xpath {

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
		driver.findElementByXPath("//input[@id='username']").sendKeys("Demosalesmanager");
		//driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		//Enter the valid password to login
		driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
		//driver.findElementByName("PASSWORD").sendKeys("crmsfa");
		
		//Now, click on the login button
		driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
		//driver.findElementByClassName("decorativeSubmit").click();
		
		//Click on CRM/SFA link
		driver.findElementByXPath("//a[contains(text(),'CRM/SFA')]").click();
		//driver.findElementByLinkText("CRM/SFA").click();
		
		//Click on Leads tab
		driver.findElementByXPath("//a[text()='Leads']").click();
		//driver.findElementByLinkText("Leads").click();
		
		//Click on create lead menu
		driver.findElementByXPath("//a[text()='Create Lead']").click();
		//driver.findElementByLinkText("Create Lead").click();
		
		//Fill 3 mandatory field
		driver.findElementByXPath("//input[@id='createLeadForm_firstName']/preceding::input[2]").sendKeys("CGI");
		//driver.findElementById("createLeadForm_companyName").sendKeys("CGI");
		
		driver.findElementByXPath("//input[@id='createLeadForm_firstName']").sendKeys("Divya");
		//driver.findElementById("createLeadForm_firstName").sendKeys("Divya");
		
		//input[@id='createLeadForm_firstName']/following::input[3]
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

