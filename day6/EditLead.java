package week3.day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {
	/*
	 * Precondition: - Initialize the WebDriver (ChromeDriver). - Load the URL
	 * http://leaftaps.com/opentaps/. - Maximize the browser window. Requirements: -
	 * Enter the Username as "DemoSalesManager" and the Password as "crmsfa". -
	 * Click on the Login Button. - Click on the CRM/SFA Link. - Click on the Leads
	 * Button. - Click on Create Lead. - Enter the CompanyName Field Using Xpath. -
	 * Enter the FirstName Field Using Xpath. - Enter the LastName Field Using
	 * Xpath. - Enter the FirstName (Local) Field Using Xpath. - Enter the
	 * Department Field Using any Locator of Your Choice. - Enter the Description
	 * Field Using any Locator of your choice. - Enter your email in the E-mail
	 * address Field using the locator of your choice. - Select State/Province as
	 * NewYork Using Visible Text. - Click on the Create Button. - Click on the edit
	 * button. - Clear the Description Field. - Fill the Important Note Field with
	 * Any text. - Click on the update button. - Get the Title of the Resulting
	 * Page. - Close the browser window.
	 */
	public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
	driver.findElement(By.xpath("//a[text()='Leads']")).click();
	driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
	driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TestLeaf");
	driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Tony");
	driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Stark");
	driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("tony");
	driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Research");
	driver.findElement(By.id("createLeadForm_description")).sendKeys("For testing purpose");
	driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("tony@gmail.com");
	WebElement stateWE = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	Select stateDD=new Select(stateWE);
	stateDD.selectByVisibleText("New York");
	driver.findElement(By.name("submitButton")).click();
	driver.findElement(By.xpath("//a[text()='Edit']")).click();
	driver.findElement(By.id("updateLeadForm_description")).clear();
	driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Adding for testing");
	driver.findElement(By.xpath("//input[@value='Update']")).click();
	driver.getTitle();
	driver.close();

	}

}
