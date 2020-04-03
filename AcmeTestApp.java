package week1.day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AcmeTestApp {


		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
			
			ChromeDriver driver = new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);	
			
			//1. Launch the URL
			
			driver.get("https://acme-test.uipath.com/account/login");
			
			//2. Enter the  Username and TAB
			
			driver.findElementById("email").sendKeys("kumar.testleaf@gmail.com");
			
			driver.findElementById("email").sendKeys(Keys.TAB);
			
			//3.Enter Password
		
			driver.findElementById("password").sendKeys("leaf@12");
			
			//4.Click Login
			
			driver.findElementById("buttonLogin").click();	
			
			//5.Mouse over on Vendors

			WebElement ele = driver.findElementByXPath("//button[text()[normalize-space()='Vendors']]");
	
			Actions builder = new Actions(driver);

			builder.moveToElement(ele).perform();
			
			//6.Click on Search Vendor
			
			driver.findElementByLinkText("Search for Vendor").click();
			
			//7.Enter Vendor Name(Blue Lagoon)
				
			driver.findElementById("vendorName").sendKeys("Blue Lagoon");
			
			//8.Click Search
			
			driver.findElementById("buttonSearch").click();
			
			//9.Find the Country name based on the Vendor
			
			String eleCountry = driver.findElementByXPath("//td[text()='France']").getText();
			
			System.out.println(eleCountry);
			
			//10.Click Log out
			
			driver.findElementByLinkText("Log Out").click();
			
			// 11. Close the Browser
			
			driver.close();
			
		
	}

}
