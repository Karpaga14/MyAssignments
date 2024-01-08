package week3.day7;

public class TextField extends WebElement {

	public static void main(String[] args) {
		TextField text = new TextField();
		text.click();
		text.getText();
		text.setText("TextField");
		

	}
	public void getText()
	{
		System.out.println("Text");
	}

}
