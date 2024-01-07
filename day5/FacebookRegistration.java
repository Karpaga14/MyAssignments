package week2.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*Precondition: 
	- Initialize ChromeDriver
	- Load the URL https://en-gb.facebook.com/ 
		- Maximize the browser window 
		- Add an implicit wait to ensure the web page elements are fully loaded Requirements: 
			- Click on the Create new account button.
			- Enter the First name. 
			- Enter the Surname.
			- Enter the Mobile number or email address.
			- Enter the New password.
			- Handle all three dropdowns in Date of birth 
			- Select the radio button in Gender.*/

public class FacebookRegistration {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("Karpaga");
		driver.findElement(By.name("lastname")).sendKeys("Rathina");
		  driver.findElement(By.name("reg_email__")).sendKeys("karpaga14@gmail.com");
		  driver.findElement(By.id("password_step_input")).sendKeys("Password@123");
		  WebElement dayWE = driver.findElement(By.name("birthday_day")); Select dayDD
		  = new Select(dayWE); dayDD.selectByIndex(14); WebElement monthWE =
		  driver.findElement(By.id("month")); Select monthDD = new Select(monthWE);
		  monthDD.selectByValue("9"); WebElement yearWE =
		  driver.findElement(By.id("year")); Select yearDD = new Select(yearWE);
		  yearDD.selectByVisibleText("1988");
		 driver.findElement(By.xpath("//label[text()='Female']")).click();
		 

	}

}
