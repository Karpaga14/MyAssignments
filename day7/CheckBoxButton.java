package week3.day7;

public class CheckBoxButton extends Button {

	public static void main(String[] args) {
		CheckBoxButton check = new CheckBoxButton();
		check.checkButton();
		check.click();
		check.setText("CheckBoxButton");
		check.submit();

	}
	public void checkButton()
	{
		System.out.println("Button check");
	}
}
