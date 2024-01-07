package week2.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*Instantiate the Browser driver
- Load the url https://www.facebook.com/
	- Enter the email id as testleaf.2023@gmail.com
	- Enter the password as Tuna@321 
	- Click on the Login button.
	- Click on the ‘Find your account and log in.’ link 
	- Verify the title of the current web page.*/

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement username = driver.findElement(By.id("email"));
	username.sendKeys("testleaf.2023@gmail.com");
	WebElement password = driver.findElement(By.name("pass"));
	password.sendKeys("Tuna@321");
	WebElement loginBtn = driver.findElement(By.name("login"));
	loginBtn.click();
	driver.findElement(By.linkText("Find your account and log in.")).click();
	String verificationPage = driver.getTitle();
	{
		if (verificationPage.contains("Forgotten"))
{
	System.out.println("Page verified successfully");
}
		else
		{
			System.out.println("Page not verified");
		}
		Thread.sleep(2000);
		driver.close();
	}
	}

}
