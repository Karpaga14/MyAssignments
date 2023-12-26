package week2.day3;

public class FibonacciSeries {

	public static void main(String[] args) {
	int a=0;
	int b=1;
	int n=8;
	System.out.println("Fibonacci Series");
	for(int i=1;i<=n;i++)
	{
		int c=a+b;
		a=b;
		b=c;
		System.out.println(c);
	}

	}

}
