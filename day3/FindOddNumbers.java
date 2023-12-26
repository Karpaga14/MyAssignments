package week2.day3;

public class FindOddNumbers {
	/*Create a java class named FindOddNumbers
- Declare a with integer variable as maxRange with value 10
- Use for loop to iterate
- Divide the value and check the reminder is equal to 1 using if condition*/

	public static void main(String[] args) {
		FindOddNumbers oddNo = new FindOddNumbers();
		oddNo.printOddNumbers(1,10);
		
	}
	
	
	public void printOddNumbers(int intialization,int maxRange)
	{
		System.out.println("Odd Numbers from "+intialization + "to "+maxRange);
		for (int i=intialization;i<=maxRange;i++)
		{
			if((i%2)==1)
			{
				System.out.println(i);
		}
	}

}
}