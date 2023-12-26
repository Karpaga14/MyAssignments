package week2.day3;

import java.util.Iterator;

public class IsPrime {
/*Create a class by name: IsPrime -
 *  Create a main method using shortcut - 
 *  Write a logic to find if the given number is prime or not - Print if it is prime or not*/
	public static void main(String[] args) {
		int n=87;
		for(int i=2;i<=n/2;i++)
		{
			if((n%i)==0)
			{
			System.out.println("Given number is non Prime Number - "+n);
			break;
			}
			else 
			{
				System.out.println("Given number is Prime Number"+n);
				break;
			}
		}

	}

}
