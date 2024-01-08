package week3.day7;

public class Chrome extends Browser {
	String browserName = "Chrome";
	public static void main(String[] args) {
		Chrome chrome = new Chrome();
		chrome.openIncognito();
		chrome.openURL();
		chrome.clearCache();
	}
	public void openIncognito()
	{
		System.out.println("Browser opened incognito"+browserName);
	}
	public void clearCache()
	{
		System.out.println("Cache cleared in "+browserName+" browser");
	}

}
