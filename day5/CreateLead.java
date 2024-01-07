package week2.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {
	/*
	 * Assignment 1:Create Lead 1. Launch URL
	 * "http://leaftaps.com/opentaps/control/login"
	 * 
	 * 2. Enter UserName and Password Using Id Locator
	 * 
	 * 3. Click on Login Button using Class Locator
	 * 
	 * 4. Click on CRM/SFA Link
	 * 
	 * 5. Click on Leads Button
	 * 
	 * 6. Click on create Lead Button
	 * 
	 * 7. Enter CompanyName using id Locator
	 * 
	 * 8. Enter FirstName using id Locator
	 * 
	 * 9. Enter LastName using id Locator
	 * 
	 * 10. Select value as Employee in Source Using SelectbyVisible text
	 * 
	 * 11. Select value as Pay Per Click Advertising in MarketingCampaignId Using
	 * SelectbyValue
	 * 
	 * 
	 * 13. Select value as Corporation in OwnerShip field Using SelectbyIndex
	 * 
	 * 14. Select value as India in Country Field Using SelectbyVisibletext
	 * 
	 * 15. Click on create Lead Button Using name Locator
	 * 
	 * 16. Get the Title of the resulting Page
	 */

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Karpaga");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Lakshmi");
		WebElement sourceWE = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sourceDD = new Select(sourceWE);
		sourceDD.selectByVisibleText("Employee");
		WebElement marketingWE = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select marketingDD = new Select(marketingWE);
		marketingDD.selectByValue("9001");
		WebElement ownershipWE = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select ownershipDD = new Select(ownershipWE);
		ownershipDD.selectByIndex(5);
		WebElement countryWE = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select countryDD = new Select(countryWE);
		countryDD.selectByVisibleText("India");
		driver.findElement(By.name("submitButton")).click();
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
	}

}
