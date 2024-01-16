package week4.day12;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*Count No Of rows and columns Assignment
=============================================
1. Launch the URL https://html.com/tags/table/
2. Get the count of number of rows
3. Get the count of number of columns*/
public class RowsAndColumnsWebTable {

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
	}

}
