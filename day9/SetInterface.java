package week4.day9;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {

	public static void main(String[] args) {
		//Assignment Requirements: - You are provided with a string variable: companyName = "google" - Create a Set to store unique characters. - Iterate through each character in the companyName string. - Add each character into the Set. - Print the unique characters from the string
		String companyName="google";
		 char[] co = companyName.toCharArray();
		Set<Character> coNa=new LinkedHashSet<Character>();
		for(int i=0;i<co.length;i++)
		{
			coNa.add(co[i]);
			
		}
		System.out.println(coNa);
	}

}
