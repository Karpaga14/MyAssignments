package week3.day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {
	/*
	 * Precondition: - Initialize the WebDriver (ChromeDriver). - Load the URL
	 * http://leaftaps.com/opentaps/. . - Maximize the browser window. Requirements:
	 * - Enter the username. - Enter the password. - Click the Login button. - Click
	 * the "crm/sfa" link. - Click the "Leads" link. - Click "Find leads." - Click
	 * on the "Phone" tab. - Enter the phone number. - Click the "Find leads"
	 * button. - Capture the lead ID of the first resulting lead. - Click the first
	 * resulting lead. - Click the "Delete" button. - Click "Find leads" again. -
	 * Enter the captured lead ID. - Click the "Find leads" button. - Verify the
	 * presence of the message "No records to display" in the Lead List. This
	 * message confirms the successful deletion. - Close the browser.
	 */
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.name("phoneNumber")).sendKeys("1234567890");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']/tbody/tr/td/div/a)[1]")).click();
		String leadIDwithName = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		String leadID = leadIDwithName.replaceAll("[^0-9]", " ");
		String leadId=leadID.replaceAll(" ", "");
		System.out.println(leadID);
		 driver.findElement(By.className("subMenuButtonDangerous")).click();
		  driver.findElement(By.linkText("Find Leads")).click();
		 driver.findElement(By.name("id")).sendKeys(leadID);
		 driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		 Thread.sleep(2000);
		String msg =  driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		String message = "No records to display";
		if(msg.equals(message))
		{
			System.out.println("Record successfully deleted");
		}
		else
		{
			System.out.println("Not able to delete the record");
		}
		driver.close();
	}

}
