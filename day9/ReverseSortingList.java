package week4.day9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseSortingList {
	//Assignment Requirements: Declare a String array and add the values as {HCL, Wipro, Aspire Systems, CTS} Add the collection to a list Iterate the values in the list Print the required output as Wipro, HCL, CTS, Aspire Systems Hints to Solve: - Arrange the collection in ascending order - Use reverse loop to iterate the collection
	public static void main(String[] args) {
	String[] array = {"HCL","Wipro","Aspire Systems","CTS"};
	List<String> list = new ArrayList<String>();
	list.addAll(Arrays.asList(array));
	Collections.sort(list);
	System.out.println(list);
	System.out.println("Reverse Sorted values are : ");
	for(int i =list.size()-1;i>=0;i--)
	{
		System.out.println(list.get(i));
	}
	}

}
