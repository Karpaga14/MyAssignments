package week4.day12;

import java.time.Duration;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableValuesWebTable {
	/*
	 * Print values in the table Assignment ===================================== 1.
	 * Launch the URL https://html.com/tags/table/ 2. You have to print the
	 * respective values based on given Library (hint: if the library was absolute
	 * usage, then print all its value)
	 */
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://html.com/tags/table/");
		List<WebElement> tableRow = driver.findElements(By.xpath("//div[@class='render']/table/tbody/tr"));
		int noOfRows = tableRow.size();
		System.out.println("Number of Rows in the table : "+noOfRows);
		
		List<WebElement> tableColumn = driver.findElements(By.xpath("//div[@class='render']/table/tbody/tr[1]/td"));
		int noOfcolumns = tableColumn.size();
		System.out.println("Number of columns in the table : "+noOfcolumns);
		
		Set<String> listOfValues = new LinkedHashSet<String>();
		for(int i=1;i<=noOfRows;i++)
		{
			 driver.findElement(By.xpath("//div[@class='render']/table/tbody/tr["+i+"]"));
				for(int j=1;j<=noOfcolumns;j++)
				{
			
			 String value =	driver.findElement(By.xpath("//div[@class='render']/table/tbody/tr["+i+"]/td["+j+"]")).getText();
			System.out.println(value);
			listOfValues.add(value);
		}

	
		}}
}
