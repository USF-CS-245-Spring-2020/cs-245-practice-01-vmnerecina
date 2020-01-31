/* CS245 Practice Assignment 1 recursive - calls itself
victoria nerecina

this program:
implements Practice01Math interface (given)
contains public int fib (int n) 
		 public int fact (int n)

*/


/**
 * Practice 01 Math
 * CS 245 - Part of the first practice assignment
 * This is the interface for the classes you must implement.
 * @author dbrizan
 *
 */
interface Practice01Math 
{
    int fact(int n) throws Exception;
    int fib(int n) throws Exception;
}


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

