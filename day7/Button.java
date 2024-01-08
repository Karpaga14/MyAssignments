package week3.day7;

public class Button extends WebElement{

	public static void main(String[] args) {
		Button button = new Button();
		button.click();
		button.setText("Button");
		button.submit();
	}
	public void submit()
	{
		System.out.println("Submit");
	}
}
