package week2.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tableLearn_printAllTrainNumber_Method2 {

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

//Webtable handling
WebElement eletable=driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']");

//for gettimg all the rows from the table[Webelement]
List<WebElement> allRows = eletable.findElements(By.tagName("tr"));

//Iterating over the rows to get eacg row
for(int i=0; i<allRows.size(); i++)
{
	//Getting all cols from each row
	
	List<WebElement> allCols = allRows.get(i).findElements(By.tagName("td"));
	
	WebElement eachTrain = allCols.get(0);
	String eachTrainName = eachTrain.getText();
	System.out.println("List the train numbers: " +eachTrainName);
}


	}

}
