package week4.day9;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListInterface {
	String mobileName;
	//Assignment Details: Find the lowest mobile phone price from amazon using list interface Assignment Requirements: - Navigate to amazon.in - Search phones in the search field - Find the lowest price from the list of phones
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("inputValEnter")).sendKeys("Mobiles"+Keys.ENTER);
		Thread.sleep(2000);
	List<WebElement> mobilePriceWE=	driver.findElements(By.xpath("//span[@class='lfloat product-price']"));
	List<Integer> allPrice= new LinkedList<Integer>();
	int mobileCount = mobilePriceWE.size();
	System.out.println("Number of mobiles: "+mobileCount);
	for(int i=0; i<mobileCount;i++)
	{
		 String mobileName= mobilePriceWE.get(i).getText();
		 int price = Integer.parseInt(mobileName.replaceAll("[^0-9]", ""));
		 allPrice.add(price);
	}
	Collections.sort(allPrice);
	System.out.println("Mobile prices are : "+allPrice);
	
	

	}

}
