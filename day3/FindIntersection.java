package week2.day3;

import java.util.Iterator;

public class FindIntersection {
/*Assignment Details:
The assignment requires comparing two arrays and printing matching elements.
int a[]={3,2,11,4,6,7};
int b[]=for {1,2,8,4,9,7};*/
	public static void main(String[] args) {
		int a[]= {3,2,11,4,6,7};
		int b[]= {1,2,8,4,9,7};
		System.out.println("Matching numbers are");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if(a[i]==b[j])
				{
					System.out.println(a[i]);
				}
			}
		}

	}

}
