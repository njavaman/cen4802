package Assignment2.java;

/**
 * The class for stating nth fibonacci sequence
 * <p>
 * Recursively return nth term in fibonacci sequence
 * @author miles Newsom
 * @version 1.0
 */

public class Assignment2 
{
	public static void main(String[] args) 
	{
	
		System.out.println("The nth term of the Fibonacci sequence is: " + fib(10));

	}
	
	/**
	* Recursively determines fibonacci sequence by using int in main
	*
	* @param n value defined in main method
	*		  values 0 or 1 return that value
	* @return int next number found by adding 
	*		  two numbers before
	*/
	
	private static int fib(int n)
	{
		if ((n == 0) || (n == 1))
			return n;
		else
		return fib(n-1) + fib(n-2);
		}

	}
