package week2.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownSelection {

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

				//Select dropdown values by using all 3 methods
				//select the dropdown using select class
				//Step 1 : Find the webelement and store
				
				WebElement eleSource = driver.findElementById("createLeadForm_dataSourceId");
				Select option = new Select(eleSource);
				option.selectByVisibleText("Employee");
				
				WebElement eleIndustry = driver.findElementById("createLeadForm_industryEnumId");
				Select option2 = new Select(eleIndustry);
				option2.selectByValue("IND_SOFTWARE");
				
				WebElement eleCurrency = driver.findElementById("createLeadForm_currencyUomId");
				Select option3 = new Select(eleCurrency);
				//option3.selectByIndex(10);
				
				List<WebElement> allOptions = option3.getOptions();
				int size = allOptions.size();
				option3.selectByIndex(size-1);
				
				//for(WebElement)
				//Click submit button
				driver.findElementByClassName("smallSubmit").click();
				
				//Get the title of the page
				String title = driver.getTitle();
				
		System.out.println("Title of the Page : "+title);
		
		//close the browser
		driver.close();
				
			}

		}

