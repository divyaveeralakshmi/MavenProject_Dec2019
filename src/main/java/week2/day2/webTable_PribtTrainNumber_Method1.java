package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webTable_PribtTrainNumber_Method1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
ChromeDriver driver = new ChromeDriver();
driver.get("https://erail.in/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

WebElement eleSource = driver.findElementById("txtStationFrom");
eleSource.clear();
eleSource.sendKeys("MAS",Keys.TAB);

WebElement eledestination = driver.findElementById("txtStationTo");
eledestination.clear();
eledestination.sendKeys("MMCT",Keys.TAB);

driver.findElementById("chkSelectDateOnly").click();

//Find multiple elements

	}
	
}
