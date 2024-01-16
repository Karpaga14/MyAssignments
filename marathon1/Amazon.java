package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("Bags for boys");
		driver.findElement(By.xpath("//div[@aria-label='bags for boys 5 years']")).click();
		String resultsCount = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']/span")).getText();
		String resultsCount1 = driver.findElement(By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small']/span)[3]")).getText();
		System.out.println("Number of bags for boys : "+resultsCount+" "+resultsCount1);
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[3]")).click();
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[3]")).click();
		driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).click();
		driver.findElement(By.linkText("Newest Arrivals")).click();
		String bagName = driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[3]")).getText();
		String price = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[3]")).getText();
		System.out.println("Name of the bag : "+bagName);
		System.out.println("Price of the bag after discount : "+price);
		String pageTitle = driver.getTitle();
		System.out.println("Page Title : "+pageTitle);
		driver.close();
	}

}
