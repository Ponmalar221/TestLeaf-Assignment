package week2.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		//Load the URL
		
		driver.get("http://www.leafground.com/pages/Link.html");
		
		
		List<WebElement> linksPresent = driver.findElementsByTagName("a");
		
		System.out.println(linksPresent.size());
		
		//Click on the first link
		
		linksPresent.get(0).click();
		
		//Print the title
		
		System.out.println(driver.getTitle());
		
		//click on the last Go to home page link
		
		/*List<WebElement> ele = driver.findElementsByLinkText("Go to Home Page");
		System.out.println(eles.size());
		eles.get(eles.size()-1).click();*/
		
		WebElement ele = driver.findElementByXPath("(//a[text()='Go to Home Page'])[last()]/following-sibling::label");
		System.out.println(ele.getText());
	}
		
				
			

}
