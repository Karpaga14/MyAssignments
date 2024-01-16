package marathon1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PVRCinemas {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.pvrcinemas.com/");
		WebElement cityWE = driver.findElement(By.xpath("//input[@placeholder='Search your city']"));
		driver.executeScript("arguments[0].click();",cityWE);
		//driver.findElement(By.xpath("//input[@placeholder='Search your city']")).click();
		driver.findElement(By.xpath("//img[@alt='Chennai']")).click();
		driver.findElement(By.xpath("//div[@class='nav-icon']")).click();
		driver.findElement(By.xpath("//a[text()='Movie Library']")).click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@name='genre']")));
		
		  WebElement genreWE = driver.findElement(By.xpath("//select[@name='genre']"));
		  Select genreDD = new Select(genreWE);
		  genreDD.selectByVisibleText("ANIMATION");
		 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@name='lang']")));
		
		  WebElement langWE = driver.findElement(By.xpath("//select[@name='lang']"));
		  Select langDD = new Select(langWE); langDD.selectByVisibleText("ENGLISH");
		 WebElement applyWE = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Apply']")));
		 driver.executeScript("arguments[0].click();",applyWE);
		 Thread.sleep(1000);
		 WebElement ele =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='movie-list']/div/div[2][contains(text(),'ANIMATION')])[1]"))); 
		 driver.executeScript("arguments[0].click();",ele);
		 WebElement proceedWE = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Proceed To Book']")));
		 proceedWE.click();
		 WebElement cinemaWE = driver.findElement(By.xpath("//select[@name='cinemaName']"));
			Select cinemaDD = new Select(cinemaWE);
			cinemaDD.selectByVisibleText("PVR Heritage RSL ECR Chennai");
			
			driver.findElement(By.xpath("//div[@class='datepicker-container datepicker-default']/input")).click();
			
			  driver.findElement(By.xpath("//span[@class='day-unit ng-star-inserted']")).click();
			  
			  WebElement timeWE =
			  driver.findElement(By.xpath("//select[@name='timings']")); Select timeDD =
			  new Select(timeWE); timeDD.selectByIndex(1);
			  
			  driver.findElement(By.xpath("//input[@name='noOfTickets']")).sendKeys("4");
			  driver.findElement(By.name("name")).sendKeys("Karpaga");
			  driver.findElement(By.name("email")).sendKeys("karpaga14@gmail.com");
			  driver.findElement(By.name("mobile")).sendKeys("9600878229");
			  
			  WebElement foodWE = driver.findElement(By.xpath("//select[@name='food']"));
			  Select foodDD = new Select(foodWE); foodDD.selectByValue("Yes");
			  
			  driver.findElement(By.name("comment")).sendKeys("NIL");
			 
			  driver.findElement(By.xpath("//label[@class='custom-control custom-radio']")).click();
			  driver.findElement(By.xpath("//button[text()='SEND REQUEST']")).click();
			  driver.findElement(By.xpath("(//button[text()='CANCEL'])[2]")).click();
			  driver.findElement(By.xpath("//button[@aria-label='Close this dialog']")).click();
			  String pageTitle = driver.getTitle();
			  System.out.println("Title of the page : "+pageTitle);
				
	}

}
