package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateLead {
public ChromeDriver driver;
	@Given("Launch the Browser")
	public void launch_the_Browser() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Given("Load the URL")
	public void load_the_URL() {
		driver.get("http://leaftaps.com/opentaps/");
	}

	@Given("Maximise the Browser")
	public void maximise_the_Browser() {
		driver.manage().window().maximize();
	}

	@Given("Set the Timeouts")
	public void set_the_Timeouts() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@Given("Enter Username as Demosalesmanager")
	public void enter_Username_as_Demosalesmanager() {
		driver.findElementById("username").sendKeys("DemoSalesManager");
	}

	@Given("Enter Password as crmsfa")
	public void enter_Password_as_crmsfa() {
		driver.findElementById("password").sendKeys("crmsfa");
	}

	@When("Click on the Login Button")
	public void click_on_the_Login_Button() {
		driver.findElementByClassName("decorativeSubmit").click();
	}

	@Given("Click CRMSFA Link")
	public void click_CRMSFA_Link() {
		driver.findElementByLinkText("CRM/SFA").click();
	}

	@Given("Click on the Leads Tab")
	public void click_on_the_Leads_Tab() {
		driver.findElementByLinkText("Leads").click();
	}

	@Given("Click on the Create Lead Menu")
	public void click_on_the_Create_Lead_Menu() {
		driver.findElementByLinkText("Create Lead").click();
	}

	@Given("Enter the Company Name as Testleaf")
	public void enter_the_Company_Name_as_Testleaf() {
		driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
	}

	@Given("Enter the First Name as Balaji")
	public void enter_the_First_Name_as_Balaji() {
		driver.findElementById("createLeadForm_firstName").sendKeys("Balaji");
	}

	@Given("Enter the Last Name as Chandrasekaran")
	public void enter_the_Last_Name_as_Chandrasekaran() {
		driver.findElementById("createLeadForm_lastName").sendKeys("Chandrasekaran");
	}

	@When("Click on the Create Lead Button")
	public void click_on_the_Create_Lead_Button() {
		driver.findElementByName("submitButton").click();
	}

	@Then("Verify Lead Creation is success")
	public void verify_Lead_Creation_is_success() {
	    String title = driver.getTitle();
	    System.out.println("Verify Lead creation is success: "+title);
	}
	
	@Then("Close Browser")
	public void close_Browser() {
	    driver.quit();
	}
}
