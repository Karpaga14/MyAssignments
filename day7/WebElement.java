package week3.day7;

public class WebElement {
	//Assignment Requirements: Base Class: WebElement - Create a base class named WebElement with common methods such as click() and setText(String text). Subclasses: Button and TextField - Implement two subclasses, Button and TextField, both inheriting from the WebElement base class. - In the Button subclass, include a submit() method. - In the TextField subclass, include a getText() method. Additional Subclass: CheckBoxButton - Develop a new class named CheckBoxButton that inherits from the Button subclass. - In the CheckBoxButton class, introduce a method named clickCheckButton(). Another Subclass: RadioButton - Create another subclass named RadioButton, also inheriting from the Button subclass. - In the RadioButton class, add a method called selectRadioButton(). Execution Class: Elements - Create execution class named , also inheriting from the Button subclass.
	public static void main(String[] args) {
		WebElement webelement = new WebElement();
		webelement.click();
		webelement.setText("Test");

	}
	public void click()
	{
		System.out.println("Click");
	}
	public String setText(String text)
	{
		System.out.println("Set text: "+text);
		return text;
	}

}
