package week2.day3;

import java.util.Arrays;
import java.util.Iterator;

public class PrintDuplicates {
	/*a) Create a class by name: FindDups (with main method) in same package
b) Create a int[] array with duplicate data
c) Write a logic to find the duplicate values
d) Run and confirm the duplicate values are printed in console*/

	public static void main(String[] args) {
	int[] num = {2,5,7,7,5,9,2,3};
	
	Arrays.sort(num);
	int length = num.length;
for (int i = 0; i < length-1; i++) {
	//reason for lenth-1 is because we can't compare num[7]==num[8]
	if(num[i]==num[i+1])
	{
		System.out.println("Duplicate numbers are : "+num[i]);	
	}
	
}
	}

}
