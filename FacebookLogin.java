package week1.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElementById("email").sendKeys("vinayagam.ponmalar@gmail.com");
		driver.findElementById("pass").sendKeys("gloryflower");
		driver.findElementById("loginbutton").click();
		Thread.sleep(10000);
		driver.close();
		
		}

}
