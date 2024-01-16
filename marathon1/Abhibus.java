package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Abhibus {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.abhibus.com/");
		driver.findElement(By.xpath("//input[@placeholder='From Station']")).sendKeys("Chennai");
		driver.findElement(By.xpath("//div[text()='Chennai']")).click();
		driver.findElement(By.xpath("//input[@placeholder='To Station']")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//div[text()='Bangalore']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Onward Journey Date']")).click();
		driver.findElement(By.xpath("//span[text()='13']")).click();
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		String firstBus = driver.findElement(By.xpath("(//h5[@class='title'])[1]")).getText();
		System.out.println("First resulting bus : "+firstBus);
		driver.findElement(By.xpath("//span[text()='Sleeper']")).click();
		String busCount = driver.findElement(By.xpath("//span[@class='buses-availability']")).getText();
		System.out.println("Available Sleeper Buses : "+busCount);
		driver.findElement(By.xpath("(//button[text()='Show Seats'])[1]")).click();
		driver.findElement(By.xpath("//span[text()='DU1']")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		String seatSelected = driver.findElement(By.xpath("(//span[@class='text-primary'])[1]")).getText();
		System.out.println("Selected Seat : "+seatSelected);
		String busFare = driver.findElement(By.xpath("(//span[@class='text-primary'])[2]")).getText();
		System.out.println("Bus Fare : "+busFare);
		String pageTitle = driver.getTitle();
		System.out.println("Title of the page: "+pageTitle);
		
		
}
}