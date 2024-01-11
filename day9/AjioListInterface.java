package week4.day9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v115.browser.Browser;

public class AjioListInterface {
	//Assignment Requirements: - Launch the URL https://www.ajio.com/ - In the search box, type as "bags" and press enter - To the left of the screen under "Gender" click on "Men" - Under "Category" click "Fashion Bags" - Print the count of the items found. - Get the list of brand of the products displayed in the page and print the list. - Get the list of names of the bags and print it
	public static void main(String[] args) throws InterruptedException {
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.ajio.com/");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//input[@placeholder='Search AJIO']")).sendKeys("Bags" + Keys.ENTER);
			driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-l1l3nestedcategory facet-linkname-Men - Fashion Bags']")).click();
			List<WebElement> brandWE = driver.findElements(By.xpath("//div[@class='brand']"));
			List<WebElement> bagWE = driver.findElements(By.xpath("//div[@class='nameCls']"));
			int bagCount = brandWE.size();
			System.out.println("Number of bags populated : "+bagCount);
			System.out.println("Brand Names:");
			System.out.println("====================================================");
			for(int i=0;i<bagCount;i++)
			{
				WebElement webElement = brandWE.get(i);
				String brandName = webElement.getText();
				System.out.println(brandName);
			}
			System.out.println("Bag Names : ");
			System.out.println("=====================================================");
			for(int i=0;i<bagCount;i++)
			{
				WebElement webElement = bagWE.get(i);
				String bagName = webElement.getText();
				System.out.println(bagName);
			}
			driver.close();
	}

}
