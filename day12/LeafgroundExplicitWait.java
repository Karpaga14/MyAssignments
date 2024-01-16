package week4.day12;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LeafgroundExplicitWait {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/waits.xhtml");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(0));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[text()='Click'])[3]"))).click();
	Boolean textChange = wait.until(ExpectedConditions.invisibilityOfElementWithText(By.xpath("//span[text()='I am going to change!']"), "Did you notice?"));
	System.out.println("Changed text : "+textChange);
	}

}
