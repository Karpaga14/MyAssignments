package week4.day9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class FindIntersectionList {
	//Assignment Requirements: - Declare an array for {3, 2, 11, 4, 6, 7} - Declare another array for {1, 2, 8, 4, 9, 7} - Compare both the arrays - Print the values if they are equal
	public static void main(String[] args) {
		Integer[] a = {3,2,11,4,6,7};
		Integer[] b = {1,2,8,4,9,7};
	List<Integer> array1 = new ArrayList<Integer>();
	array1.addAll(Arrays.asList(a));
	//System.out.println(array1);
	List<Integer> array2 = new ArrayList<Integer>();
	array2.addAll(Arrays.asList(b));
	//System.out.println(array2);
	System.out.println("Matching numbers are : ");
	for(int i=0;i<array1.size()-1;i++)
	{
		
			if(array1.get(i)==array2.get(i))
					{
				System.out.println(array1.get(i));
					}
		
	}

	}
}
