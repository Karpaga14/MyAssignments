package week2.day4;

public class ReverseString {

	public static void main(String[] args) {
		/*Your task is to reverse a given String with the Input : String companyName= TestLeaf
Requirements:
- Convert the given String to a character array.
- Implement a loop to iterate through each character of the String (from end to start).
- Print the characters to display the reversed String.*/
		String companyName = "TestLeaf";
		char[] charArray = companyName.toCharArray();
		for(int i=charArray.length-1;i>=0;i--)
		{
			System.out.print(charArray[i]);
		}

	}

}
