package Assignment2.java;
public class Assignment2 
{

	public static void main(String[] args) 
	{
	
		System.out.println("The 10th iteration is: " + fib(10));

	}
	
	private static long fib(long n)
	{
		if ((n == 0) || (n == 1))
			return n;
		else
		return fib(n-1) + fib(n-2);
	}

}
