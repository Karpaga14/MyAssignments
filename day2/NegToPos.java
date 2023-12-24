package week1.day2;

public class NegToPos {

	public static void main(String[] args) {
		/*Assignment:3
	Problem statement: Convert a negative number to positive number
		-----------------------------------------------Pseudocode: 
		1. Initialize an integer with a negative number like, int number = -40;
		2. Check if the number is a negative number Hint : any number that is lesser than zero is a negative number
		3. If so, convert the number to a positive number
		4. Print as below "The number -40 is converted to 40"*/

		int number = -90;
		if (number <0)
		{
			int no = -number;
			System.out.println("The number "+number+" is converted to "+no);
		}
	}

}
