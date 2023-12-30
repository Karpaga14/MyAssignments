package week2.day4;

public class CharacterCountInString {
	//Your task is to count the occurrences of character ‘e’ in the given String input="TestLeaf".
	public static void main(String[] args) {
		int count =0;
		String input = "TestLeaf";
		char[] inputArray = input.toCharArray();
		for(int i=0;i<inputArray.length-1;i++)
		{
			if(inputArray[i]=='e')
			{
				count++;
			}
			
		}
		System.out.println("Count of given String "+input+" is "+count);
	}

}
