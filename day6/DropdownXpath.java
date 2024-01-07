package week3.day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownXpath {
	/*
	 * Precondition: - Initialize the WebDriver (ChromeDriver). - Load the URL
	 * http://leaftaps.com/opentaps/. - Maximize the browser window. Requirements: -
	 * Enter the username as ‘demosalesmanager’ - Enter the password as 'crmsfa' -
	 * Click on the Login button. - Click on the CRM/SFA link - Click on the Leads
	 * tab. - Click on the Create Lead link from shortcuts. - Enter the mandatory
	 * fields on the web page. - Select Employee in the source dropdown (using
	 * index) - Select Automobile in the Marketing Campaign (using visibleText) -
	 * Select Corporation in Ownership (using value) - Click on the Create Lead
	 * button. - Verify the title of the current web page. - Close the browser
	 * window.
	 */
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TestLeaf");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Tony");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Stark");
		WebElement sourceWE = driver.findElement(By.xpath("//select[@id='createLeadForm_dataSourceId']"));
		Select sourceDD = new Select(sourceWE);
		sourceDD.selectByIndex(4);
		WebElement marketingWE = driver.findElement(By.xpath("//select[@id='createLeadForm_marketingCampaignId']"));
		Select marketingDD = new Select(marketingWE);
		marketingDD.selectByVisibleText("Automobile");
		WebElement ownerWE = driver.findElement(By.xpath("//select[@id='createLeadForm_ownershipEnumId']"));
		Select ownerDD = new Select(ownerWE);
		ownerDD.selectByValue("OWN_CCORP");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		Thread.sleep(1000);
		driver.close();
	}

}
