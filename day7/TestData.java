package week3.day7;

public class TestData {
	//Requirements: - Create a superclass as TestData. Implement 2 methods: enterCredentials(), navigateToHomePage() in the TestData class. - Create subclasses and create 2 methods in each LoginTestData - enterUsername() - enterPassword() - Demonstrate the concept by creating objects for both classes and calling their methods
	public static void main(String[] args) {
	TestData test = new TestData();
	test.enterCredentials();
	test.navigateToHomePage();
	}
	public void enterCredentials()
	{
		System.out.println("Enter the credentials");
	}
	public void navigateToHomePage()
	{
		System.out.println("Navigated back to home page");
	}
}
