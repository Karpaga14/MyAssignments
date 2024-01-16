package week4.day12;

import java.time.Duration;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//Assignment Requirements: - Launch the erail URL. - Enter "MAS" as the "From" station. - Enter "MDU" as the "To" station. - Uncheck the "Sort on Date" checkbox. - Retrieve the train names from the web table. - Verify if there are any duplicate train names in the web table.
public class ErailWebTable {

	public static void main(String[] args) {
	
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://erail.in/");
		WebElement fromStation = driver.findElement(By.id("txtStationFrom"));
		fromStation.clear();
		fromStation.sendKeys("MAS"+Keys.ENTER);
		WebElement toStation = driver.findElement(By.id("txtStationTo"));
		toStation.clear();
		toStation.sendKeys("MDU"+Keys.ENTER);
		driver.findElement(By.id("chkSelectDateOnly")).click();
		List<WebElement> tableRow = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr"));
		int noOfRows = tableRow.size();
		System.out.println(noOfRows);
		Set<String> listOfTrainNames= new LinkedHashSet<String>();
		for(int i=2;i<=noOfRows;i++)
		{
			String trainNames = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr["+i+"]/td[2]")).getText();
			System.out.println(trainNames);
			listOfTrainNames.add(trainNames);
					}
		if (noOfRows-1==listOfTrainNames.size())
		{
			System.out.println("There are no duplicate trains");
		}
		else
		{
			System.out.println("No duplicate trains");
		}
	}

}
