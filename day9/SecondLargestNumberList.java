package week4.day9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//Assignment Details: Find the second largest number from the given array Assignment Requirements: - Declare an array {3, 2, 11, 4, 6, 7}. - Pick the 2nd element from the last and print it.
public class SecondLargestNumberList {

	public static void main(String[] args) {
		Integer[] a = {3,2,11,4,6,7};
		List<Integer> number = new ArrayList<Integer>();
		number.addAll(Arrays.asList(a));
		Collections.sort(number);
		int secondLargest=number.size()-2;
		System.out.println("Sorted Numbers are : "+number);
		System.out.println("Second Largest Number is : "+number.get(secondLargest));
	}

}
