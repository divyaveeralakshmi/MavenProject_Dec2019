package project.day.testcases;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase3ZoomCar {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
/*1. Launch URL: https://www.zoomcar.com/chennai
2. Click on the Start your wonderful journey link
3. In the Search page, Click on any pick up point under POPULAR PICK-UP
4. Click on the Next button
5. Specify the Start Date as tomorrow Date
6. Click on the Next Button
7. Confirm the Start Date and Click on the Done button
8. In the result page, capture the number of results displayed.
9. Find the highest priced car ride.
10. Click on the Book Now button for it.
11. Close the Browser.
*/
		int HighestCarPrice=0;
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zoomcar.com/chennai/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementByLinkText("Start your wonderful journey").click();
		driver.findElementByXPath("//div[contains(text(),'Kodambakkam')]").click();
		driver.findElementByClassName("proceed").click();
		driver.findElementByXPath("//div[text()='Mon']").click();
		Thread.sleep(3000);
		driver.findElementByClassName("proceed").click();
		Thread.sleep(3000);
		String startdate = driver.findElementByXPath("//div[contains(@class,'day picked')]").getText();
		if(startdate.contains("TUE"))
		{
			System.out.println("Confirm the Start Date "+startdate);
		}
		driver.findElementByClassName("proceed").click();
		Thread.sleep(3000);
		List<WebElement> highestcarname = driver.findElementsByXPath("//div[@class='details']/h3");
		
		
		List<WebElement> highestCarPrice = driver.findElementsByXPath("//div[@class='price']");
		System.out.println("capture the number of results displayed : "+highestCarPrice.size());
		List<Integer> sortPrice = new LinkedList<>();
		Map<String,Integer> map=new LinkedHashMap<>();
		for(int i=0; i<highestCarPrice.size(); i++)
		{
			String carPrice = highestCarPrice.get(i).getText();
			String highPrice = carPrice.replaceAll("[^0-9]+", "");
			//System.out.println(highPrice);
			int parseInt = Integer.parseInt(highPrice);
			
			String carname = highestcarname.get(i).getText();
			//System.out.println(carname);
			sortPrice.add(parseInt);
			Collections.sort(sortPrice,Collections.reverseOrder());
			HighestCarPrice = sortPrice.get(0);
			
			map.put(carname,parseInt);
			
		}
		System.out.println(sortPrice);
		System.out.println(map);
		System.out.println("Highest car Price:"+HighestCarPrice);
		for (Entry<String,Integer> mapvalue: map.entrySet()) {
			Integer icarName = mapvalue.getValue();
			if(icarName==HighestCarPrice) {
				String iHighestcarName = mapvalue.getKey();
				System.out.println("Highest car Name:"+iHighestcarName);
				driver.findElementByXPath("//h3[text()='"+iHighestcarName+"']/following::button[1]").click();
				break;
			}
			
		}
		
	}

}
