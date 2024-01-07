package week2.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {
	/*
	 * http://leaftaps.com/opentaps/control/main
	 * 
	 * 1 Launch the browser 2 Enter the username 3 Enter the password 4 Click Login
	 * 5 Click crm/sfa link 6 Click Leads link 7 Click Find leads 8 Enter first name
	 * 9 Click Find leads button 10 Click on first resulting lead 11 Verify title of
	 * the page 12 Click Edit 13 Change the company name 14 Click Update 15 Confirm
	 * the changed name appears 16 Close the browser (Do not log out)
	 */
	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Find Leads")).click();
	driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Karpaga");
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']/tbody/tr/td[1]/div/a)[1]")).click();
	  String pageTitle = driver.getTitle(); 
	  System.out.println(pageTitle);
	  driver.findElement(By.linkText("Edit")).click();
	  WebElement companyNaame = driver.findElement(By.id("updateLeadForm_companyName"));
	  companyNaame.clear();
	  companyNaame.sendKeys("TestLeafs"); 
	  String companyName = "TestLeafs";
	  System.out.println(companyName);
	  driver.findElement(By.name("submitButton")).click(); 
	  String updatedName =  driver.findElement(By.id("viewLead_companyName_sp")).getText();
	  String updatedNames = updatedName.replaceAll("[0-9]", " ");
	  String updateN=updatedNames.replace("(","");
	  String updateNa=updateN.replace(")","");
	  String updateNn=updateNa.replace(" ","");
	  System.out.println(updateNn);
	  if(companyName.equals(updateNn)) 
	  {
	  System.out.println("Company name is updated successfully"); 
	  } 
	  else 
	  {
	  System.out.println("Failed to update company name");
	  }
	  
	  //driver.close();
	 
	}

}
