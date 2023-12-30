package week2.day4;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	/*
	 * Add the Selenium dependencies in pom.xml. - Import the required libraries at
	 * the beginning of your Java class. (import
	 * org.openqa.selenium.chrome.ChromeDriver) - Instantiate the browser driver -
	 * Load the url: https://www.facebook.com/ - Maximize the browser window. -
	 * Close the browser window.
	 */
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.close();

	}

}
