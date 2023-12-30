package week2.day4;

public class ChangeOddIndexToUppercase {
	//Change the odd index of a given String to uppercase with the input : String test = “changeme”;
	
	public static void main(String[] args) {
		String test = "changeme";
		char[] testArray = test.toCharArray();
		String word = "";
		for(int i = 0;i<=test.length()-1;i++)
		{
			//System.out.println(testArray[i]);
			if((i%2)==1)
			{
				char name = testArray[i];
				char upper = Character.toUpperCase(name);
				System.out.print(upper);
			}
			
			 else 
			 { 
				 char name = testArray[i];
					char lower = Character.toLowerCase(name);
					System.out.print(lower);
			 
		}
		
	}
	}
}
