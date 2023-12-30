package week2.day4;

public class RemoveDuplicateWords {
	/*
	 * Remove the duplicate words from a String with the input: String text = “We
	 * learn Java basics as part of java sessions in java week1”; Expected output:
	 * “We learn Java basics as part of sessions in week1”
	 */
	public static void main(String[] args) {
		int count=0;
		String text = "We learn Java basics as part of java sessions in java week1"; 
		String[] split = text.split(" ");
		//System.out.println(split[1]);
		for(int i=0;i<split.length-1;i++)
		{
			for(int j=i+1;j<=split.length-1;j++)
			{
				if((split[i]).equalsIgnoreCase(split[j]))
				{
			split[j]=" ";
			count++;
				}
			}
			
		}
		if(count>0)
		{for(int k=0;k<split.length;k++)
		{
			System.out.print(" "+split[k]+" ");
		}
		}
	}

}
