package week3.day7;

public class Safari extends Browser {
	String browserName = "Safari";
	public static void main(String[] args) {
		Safari safari = new Safari();
		safari.readerMode();
		safari.fullScreenMode();
		safari.openURL();
		safari.closeBrowser();
		safari.navigateBack();

	}
	public void readerMode()
	{
		System.out.println("Reader mode opened in "+browserName+"browser");
	}
	public void fullScreenMode()
	{
		System.out.println(browserName+" browser opened in full screen mode");
	}

}
