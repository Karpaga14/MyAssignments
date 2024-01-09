package week2.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	/*
	 * Assignment 4: DropDown in Leaf Ground:
	 * https://www.leafground.com/select.xhtml
	 */	
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		driver.manage().window().maximize();
		WebElement toolWE = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		Select toolDD = new Select (toolWE);
		toolDD.selectByVisibleText("Selenium");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@aria-label='Show Options']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//li [@class='ui-autocomplete-item ui-autocomplete-list-item ui-corner-all'])[4]")).click();
		driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-triangle-1-s ui-c'])[1]")).click();
		driver.findElement(By.xpath("//li[@data-label='Germany']")).click();
		driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-triangle-1-s ui-c'])[3]")).click();
		driver.findElement(By.xpath("//li[@data-label='English']")).click();
		driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-triangle-1-s ui-c'])[2]")).click();
		driver.findElement(By.xpath("//li[@data-label='Berlin']")).click();
		driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-triangle-1-s ui-c'])[4]")).click();
		driver.findElement(By.xpath("//li[@data-label='Two']")).click();
	}

}
