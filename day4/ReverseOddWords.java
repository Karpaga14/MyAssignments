package week2.day4;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

public class ReverseOddWords {
	/*
	 * Reverse the odd position words from a String with the input: String test =
	 * "I am a software tester"; Expected output: “I ma a erawtfos tester”
	 */
	public static void main(String[] args) {
		String test = "I am a software tester";
		String[] split = test.split(" ");
		for(int i=0;i<=split.length-1;i++)
		{
		if((i%2)!=0)
				{
			char[] charArray = split[i].toCharArray();
			for(int j=charArray.length-1;j>=0;j--)
			{
				//System.out.println(split.length);
				System.out.print(" "+charArray[j]);
							}
			
		}
		else
		{
			System.out.print(" "+split[i]+" ");
		}
		
		}

	}

}
