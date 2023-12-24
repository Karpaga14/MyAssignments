package week1.day2;

public class Mobile {
	/*Assignment 2:

		- Create package name as week1.day1 under src/main/java
		- Create a  new class as "Mobile" under week1.day1
		- Create 2 methods (makeCall() , sendMsg()) with simple print statement
		- In first method create variable  mobileModel (String),mobileWeight (float)
		- In second method create variable  isFullCharged (boolean),mobileCost (int)
		- Create main method
		Create object for class and call  from main method and print them
		- print a statement---->"This is my mobile";
		-run and confirm the output printed in console*/ 
	public static void main(String[] args) {
		Mobile specs = new Mobile();
		specs.makeCall();
		specs.sendMsg();
		System.out.println("This is my mobile");

	}
public void makeCall()
{
	System.out.println("Make call");
	String mobileModel = "Realme 8";
	float mobileWeight = 7.99f;
	System.out.println("Model of the mobile : "+mobileModel);
	System.out.println("Weight of the mobile : "+mobileWeight);
}
public void sendMsg()
{
	System.out.println("Message Sent");
	boolean isFullCharged = true;
	int mobileCost = 15000; 
	System.out.println("Is battery charged : "+isFullCharged);
	System.out.println("Cost of the Mobile : "+mobileCost);
}
}
