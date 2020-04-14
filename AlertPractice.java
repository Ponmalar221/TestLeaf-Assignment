package week3.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;



public class AlertPractice {

	public static void main(String[] args) throws InterruptedException {
		
				// add system property -> webdriver.chrome.driver
		
				System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");

				ChromeDriver driver = new ChromeDriver();
				
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

				// Load the URL :: get ->
				driver.get("http://leafground.com/pages/Alert.html");
				
				driver.findElementByXPath("//button[text()='Alert Box']").click();
				
				//switch the control from Driver to alert
				
				Alert alert = driver.switchTo().alert();
				
				//Click "OK" button in Alert box  
				
				alert.accept();
				
				driver.findElementByXPath("//button[text()='Confirm Box']").click();
				
				//switch the control from Driver to alert
				
				Alert alert1 = driver.switchTo().alert();		
				
				//Press Cancel button
				
				alert1.dismiss();
				
				Thread.sleep(3000);
				
				driver.findElementByXPath("//button[text()='Prompt Box']").click();
				
				//switch the control from Driver to alert
				
				Alert alertPrompt = driver.switchTo().alert();
				
				//Type Company name and close the Prompt alert window
				
				alertPrompt.sendKeys("HEALTH360");
				
				alertPrompt.accept();
				
				//Click on the Sweet Alert button
				
				driver.findElementByXPath("//button[text()='Sweet Alert']").click();
				
				//switch the control from Driver to alert
				
				//Alert alertSweet = driver.switchTo().alert();
				
				//Click "OK" button in sweet alert window
				
				//alertSweet.accept();
				
				driver.findElementByXPath("//button[text() ='OK']");
									
				
	}

}
