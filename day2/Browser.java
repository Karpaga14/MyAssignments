package week1.day2;

public class Browser {

	public static void main(String[] args) {
		
		Browser brow = new Browser();
		brow.launchBrowser("Edge");
		brow.loadUrl();
	}
	public String launchBrowser(String browserName) {
		System.out.println("Browser launched successfully");
		return (browserName);
		
	}
	public void loadUrl()
	{
		System.out.println("Application URL loaded successfully");
	}
	}


