package week1.day2;

public class Bike {

	public static void main(String[] args) {
		Car action = new Car();
		action.applyBrake();
		action.soundHorn();
		Bike biker = new Bike();
		biker.bikeModel();
		
}
	
public void bikeModel()
{
	System.out.println("Model of the bike : Ronin");
}
}
