package week1.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		// 1. load the URL - http://leaftaps.com/opentaps/control/main
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//2. Login as user -> DemoSalesManager & password -> crmsfa

		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		
		//3. Click on CRM/SFA
		driver.findElementByLinkText("CRM/SFA").click();
		
		//4. Click on Create Lead
		driver.findElementByLinkText("Create Lead").click();
		
		//5. Enter mandatory fields - Company Name, First Name & Last Name
		driver.findElementById("createLeadForm_companyName").sendKeys("HCL");
		driver.findElementById("createLeadForm_firstName").sendKeys("Ponmalar");
		driver.findElementById("createLeadForm_lastName").sendKeys("Manirathinam");
		
		//6. Click on Submit
		driver.findElementByName("submitButton").click();
		
		//7. Verify lead has been created using title

		String title = driver.getTitle();
		System.out.println(title);
		
		//8. Close browser
		driver.close();
	}	
		
	}
		
		
		
				
			


