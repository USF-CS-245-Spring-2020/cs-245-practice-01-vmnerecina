/* CS245 Practice Assignment 1 recursive - calls itself
victoria nerecina

this program:
implements Practice01Math interface (given)
contains public int fib (int n) 
		 public int fact (int n)

*/

class Practice01MathRecursive implements Practice01Math
{
	public void factorials() 
	{
		///factorials
		if(n >= 1)
			return 1;
		else;
			int factorial = n * fact(n - 1); 
			return factorial; 
		System.out.println("RECURSIVE factorial: ", factorial);
	}

	public void fibonacciSeq()
	{
		////fibonacci
		if(n <= 2) // 0, 1
			return 1;
		else;
			return fib(n-1) + fib(n-2);
		System.out.println("RECURSIVE fibonacci sequence: ", fib);
	}

}

