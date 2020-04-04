package week1.day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);	
		
		//1. Launch the URL
		
		driver.get("https://www.redbus.in/");
		
		//2.Enter from place as Chennai
		
		driver.findElementByClassName("db").sendKeys("Chennai");
		
		Thread.sleep(5000);
		
		driver.findElementByClassName("db").sendKeys(Keys.TAB);
		
		//3.Enter to place as Bangalore
		
		driver.findElementById("dest").sendKeys("Bangalore");
		
		Thread.sleep(5000);
					
		driver.findElementByXPath("(//label[contains(@class,'db text-trans-uc')])[1]").click();
		
		//4.Pick onward date as 30th April
		driver.findElementByXPath("(//td[text()='29'])[2]").click();
		
		//5.Click on search button 
		
		driver.findElementById("search_btn").click();
		
		//6.Check after 6PM departure time
		
		driver.findElementByXPath("(//label[@class='cbox-label'])[4]").click();
		
		//7. Check sleeper under bus type
		
		driver.findElementByXPath("(//label[@for='bt_SLEEPER'])[2]").click();
		
		//8.Click on seats available
		
		driver.findElementByXPath("(//div[contains(@class,'button view-seats')])[1]").click();
		
		
		
		
		

		
		}

}
