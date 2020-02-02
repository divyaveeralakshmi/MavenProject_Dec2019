package week4.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class ParameterizationProjectSpecificMethods {
	public ChromeDriver driver;
	
	@Parameters({"url","uName","password"})
	  @BeforeMethod
	  public void login(String url,String userName,String pass) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	  		driver = new ChromeDriver();
	  		driver.manage().window().maximize();
	  		driver.get(url);
	  		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  		driver.findElementById("username").sendKeys(userName);
	  		driver.findElementById("password").sendKeys(pass);
	  		driver.findElementByClassName("decorativeSubmit").click();
	  		driver.findElementByLinkText("CRM/SFA").click();
	  		driver.findElementByLinkText("Leads").click();
	  		System.out.println("BeforeMethod");
	  }

	@DataProvider
	public String[][] sendData()
	{
		String[][] data = new String[3][3];
		
		data[0][0] = "TestLeaf";
		data[0][1] = "Sam";
		data[0][2] = "L";
		
		data[1][0] = "Kekaran Mekaran";
		data[1][1] = "Naveen";
		data[1][2] = "Elumalai";
		
		data[2][0] = "CGI";
		data[2][1] = "Divya";
		data[2][2] = "M";
		
		return data;
	}
	
	  @AfterMethod
	  public void closeBrowser() {
		  driver.close();
		  System.out.println("AfterMethod");
	  }
	  
	  

	  @BeforeClass
	  public void beforeClass() {
		  System.out.println("BeforeClass");
	  }

	  @AfterClass
	  public void afterClass() {
		  System.out.println("AfterClass");
	  }

	  @BeforeTest
	  public void beforeTest() {
		  System.out.println("BeforeTest");
	  }

	  @AfterTest
	  public void afterTest() {
		  System.out.println("AfterTest");
	  }

	  @BeforeSuite
	  public void beforeSuite() {
		  System.out.println("BeforeSuite");
	  }

	  @AfterSuite
	  public void afterSuite() {
		  System.out.println("AfterSuite");
	  }

}
