package week3.day7;

public class RadioButton extends Button{

	public static void main(String[] args) {
		RadioButton radio = new RadioButton();
		radio.click();
		radio.selectRadioButton();
		radio.setText("radio");
		radio.submit();

	}
	public void selectRadioButton()
	{
		System.out.println("Radio button selected");
	}

}
