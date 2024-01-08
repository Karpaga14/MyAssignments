package week3.day7;

public class LoginTestData extends TestData {

	public static void main(String[] args) {
		LoginTestData data = new LoginTestData();
		data.enterCredentials();
		data.navigateToHomePage();
		data.enterUserName();
		data.enterPassword();
	}
	public void enterUserName()
	{
		System.out.println("User Name : Tony");
	}
	public void enterPassword()
	{
		System.out.println("Password : password");
	}
}
