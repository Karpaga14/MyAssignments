package week4.day9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingElementList {
	//Assignment Requirements: - Declare an array {1, 2, 3, 4, 10, 6, 8}. - Do a comparison check if there is a gap in the sequence of numbers. - Print the numbers that are missing. Hints to Solve: - Arrange the collection in ascending order - Inside the loop, check the current element + 1 is not equal to the next element. This comparison checks if there is a gap in the sequence of numbers - Use the get() method to get an element from the list - Print the number if a gap is detected.
	public static void main(String[] args) {
		Integer[] a = {1,2,3,4,10,6,8};
		List<Integer> number = new ArrayList <Integer>();
		number.addAll(Arrays.asList(a));
		Collections.sort(number);
		System.out.println(number);
		System.out.println("Missing Numbers are : ");
		for(int i=0;i<number.size()-1;i++)
		{
			
			if (number.get(i) + 1 != number.get(i + 1))
			{
	         System.out.println (number.get(i) + 1);
			}
		}

	}

}
		
