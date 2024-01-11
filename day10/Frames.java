package week4.day10;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//Precondition: - Initialize ChromeDriver - Load the URL (https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt) - Maximize the browser window - Switch to the frame - Add an implicit wait to ensure the webpage elements are fully loaded Requirements: - Click the "Try It" button inside the frame - Click OK/Cancel in the alert that appears - Confirm the action is performed correctly by verifying the text displayed 
public class Frames {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		WebElement tryFrame = driver.findElement(By.xpath("//iframe[@name='iframeResult']"));
		driver.switchTo().frame(tryFrame);
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		Alert alert = driver.switchTo().alert();
		String msg = alert.getText();
		System.out.println(msg);
		alert.accept();
	}

}
