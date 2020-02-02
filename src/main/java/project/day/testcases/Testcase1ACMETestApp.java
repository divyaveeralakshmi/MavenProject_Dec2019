package project.day.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Testcase1ACMETestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
  /*1) Launch URL: https://acme-test.uipath.com/account/login
	2) Enter UserName (kumar.testleaf@gmail.com) and TAB
	3) Enter Password (leaf@12)
	4) Click Login
	5) Mouse Over on Vendors
	6) Click Search Vendor
	7) Enter Vendor Name (Blue Lagoon)
	8) Click Search
	9) Find the Country Name based on the Vendor
	10) Click Log Out
	11) Close browser*/

        //Lauch the chrome Browser -> call Chromedriver
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//Load the url -> ACMTestAPP
		driver.get("https://acme-test.uipath.com/account/login");
		
		//To maximize the browser window
		driver.manage().window().maximize();
		
		//Timeout
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Enter the valid username to login
		driver.findElementById("email").sendKeys("kumar.testleaf@gmail.com");
		
		//Enter the valid password to login
		driver.findElementById("password").sendKeys("leaf@12");
		
		//Click on login button
		driver.findElementById("buttonLogin").click();
		
		WebElement vendors = driver.findElementByXPath("//button[text()=' Vendors']");
		Actions builder = new Actions(driver);
		builder.moveToElement(vendors).pause(200).click(driver.findElementByXPath("//a[text()='Search for Vendor']")).perform();
		
		driver.findElementById("vendorName").sendKeys("Blue Lagoon");
		driver.findElementById("buttonSearch").click();
		String countryName = driver.findElementByXPath("//table[@class='table']//td[5]").getText();
		System.out.println("Find the Country Name based on the Vendor : "+countryName);
		driver.findElementByLinkText("Log Out").click();
		driver.close();
}
}
