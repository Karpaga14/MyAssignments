package week3.day7;

public class LoginPage extends BasePage {

	public static void main(String[] args) {
	LoginPage login = new LoginPage();
	login.performCommonTasks();
	login.clickElement();
	login.entertext();
	login.findElement();
	}
	public void performCommonTasks()
	{
		System.out.println("Common tasks performed in Login Page");
	}

}
