/* CS245 Practice Assignment 1 iterative - loops
victoria nerecina
this program:
implements Practice01Math interface (given)
contains public int fib (int n) - used geeksfor geeks
		 public int fact (int n)

*/



public class Practice01MathIterative implements Practice01Math
{


	public int fact(int n) throws Exception
	{
		///factorials
		int fact = 1;
		if(n < 0)
			throw new Exception();
		for (int i = 1; i <= n; i++)
			fact = fact * i;
		return fact;
		//System.out.println()
	}

	//from geeksforgeeks
	public int fib(int n) throws Exception
	{
		////fibonacci
		int f[] = new int[n+2]; //array to hold fibonacci numbers
		int i;
		//for the 0th and 1st numbers
		f[0] = 0;
		f[1] = 1;
		for(i = 2; i <=n ; i++)
			f[i] = f[i-1] + f[i-2];
		return f[n];


	}










}