package week2.day3;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		/*Find the missing element in the given array
Input -> {1, 4,3,2,8, 6, 7};
Output -> 5*/
		int a[] ={1,4,3,2,8,6,7};
	Arrays.sort(a);
	
		for (int i = 0; i < a.length; i++) {
			if((i+1)!=a[i])
			{
				System.out.println("Missing number - "+(i+1));
				break;
			}
		}

	}

}
