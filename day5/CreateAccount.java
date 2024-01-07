package week2.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*Initialize the WebDriver (ChromeDriver).
- Load the URL http://leaftaps.com/opentaps/. 
	- Maximize the browser window.
	Requirements: - 
	Enter a username and password. - 
	Click the "Login" button. 
	- Click on the "CRM/SFA" link. 
	- Click on the "Accounts" tab. 
	- Click on the "Create Account" button. 
	- Enter an account name.
	- Enter a description as "Selenium Automation Tester." 
	- Select "ComputerSoftware" as the industry.
	- Select "S-Corporation" as ownership using SelectByVisibleText.
	- Select "Employee" as the source using SelectByValue. 
	- Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex. 
	- Select "Texas" as the state/province using SelectByValue. 
	- Click the "Create Account" button.
	- Verify that the account name is displayed correctly. 
	- Close the browser window.*/
public class CreateAccount {

	public static void main(String[] args) {
		
ChromeDriver driver = new ChromeDriver();
driver.get("http://leaftaps.com/opentaps/");
driver.manage().window().maximize();
driver.findElement(By.id("username")).sendKeys("demosalesmanager");
driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.linkText("CRM/SFA")).click();
driver.findElement(By.linkText("Accounts")).click();
driver.findElement(By.linkText("Create Account")).click();
WebElement accountName = driver.findElement(By.id("accountName"));
String accName = "Karpagal1";
accountName.sendKeys(accName);
//System.out.println(accountName);
driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
WebElement industryWE = driver.findElement(By.name("industryEnumId"));
Select industryDD = new Select(industryWE);
industryDD.selectByIndex(3);
WebElement ownerWE = driver.findElement(By.name("ownershipEnumId"));
Select ownerDD = new Select(ownerWE);
ownerDD.selectByVisibleText("S-Corporation");
WebElement sourceWE = driver.findElement(By.id("dataSourceId"));
Select sourceDD = new Select(sourceWE);
sourceDD.selectByValue("LEAD_EMPLOYEE");
WebElement martketingWE = driver.findElement(By.id("marketingCampaignId"));
Select marketingDD = new Select(martketingWE);
marketingDD.selectByIndex(6);
WebElement stateWE = driver.findElement(By.id("generalStateProvinceGeoId"));
Select stateDD = new Select(stateWE);
stateDD.selectByValue("TX");
driver.findElement(By.className("smallSubmit")).click();
	}

}
