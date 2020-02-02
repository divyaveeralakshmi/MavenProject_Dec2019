package project.day.testcases;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase2Amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		/*1. Launch URL: https://www.amazon.in/
			2. Type "oneplus 7 pro mobiles" in Search Box and Enter
			3. Print the price of the first resulting mobile
			4. Click on the Mobile (First resulting) image
			5. Switch to the new window
			6. Print the number of customer ratings
			7. Click 'Add to Cart'
			8. Confirm "Added to Cart" text message appeared
			9. Click to Proceed to Buy
			10. Confirm the title is "Amazon Sign In"
			11. Click Continue (without entering mobile number / email)
			12. Verify the error message: Enter your email or mobile phone number
			13. Close both browsers*/
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementById("twotabsearchtextbox").sendKeys("oneplus 7 pro mobiles");
		driver.findElementByXPath("//input[@class='nav-input'][1]").click();
		String mobileprice = driver.findElementByXPath("//span[text()='42,999'][1]").getText();
		System.out.println("Print the price of the first resulting mobile - "
				+ "OnePlus 7 Pro Price :" +mobileprice);
		driver.findElementByXPath("//img[@alt='OnePlus 7 Pro (Almond, 8GB RAM, Fluid AMOLED Display, 256GB Storage, 4000mAH Battery)']").click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> listwindow = new ArrayList<>();
		listwindow.addAll(windowHandles);
		driver.switchTo().window(listwindow.get(1));
		String customerrating = driver.findElementByXPath("//span[@id='acrCustomerReviewText']").getText();
		System.out.println("Print the number of customer ratings : " +customerrating);
		Thread.sleep(3000);
		driver.findElementByXPath("//input[@id='add-to-cart-button']").click();
		String addCart = driver.findElementByXPath("//h1[contains(text(),'Added to Cart')]").getText();
		System.out.println("Confirm \"Added to Cart\" text message appeared : " +addCart);
		driver.findElementByXPath("//a[contains(text(),'Proceed to Buy (1 item)')]").click();
		String title = driver.getTitle();
		if(title.equals("Amazon Sign In"))
		{
			System.out.println("Confirm the title is Amazon Sign In : "+title);
		}
		driver.findElementByXPath("//input[@id='continue']").click();
		String errormsg = driver.findElementByXPath("//div[contains(text(),'Enter your email or mobile phone number')]").getText();
		System.out.println("Verify the error message: "+errormsg);
		driver.close();
		driver.switchTo().window(listwindow.get(0)).close();
	}

}
