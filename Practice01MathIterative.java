/* CS245 Practice Assignment 1 iterative - loops
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
public interface Practice01Math 
{
    int fact(int n) throws Exception;
    int fib(int n) throws Exception;
}


class Practice01MathIterative implements Practice01Math
{

	public void factorials()
	{
		///factorials
		int factorial = 1;
		for (int i = 1; i <= n; i++)
			factorial = factorial * i;
		return factorial;
		System.out.println("ITERATIVE factorial: " , factorial);
	}

	public void fibonacciSeq()
	{
		////fibonacci
		int startNumber = 0;
		int nextNumber = 1;
		int fibonacci;
		for(int i = 0; i <= n; i++) //
			fibonacci = startNumber + i;
			startNumber = nextNumber;
			nextNumber = fibonacci;
		System.out.println("ITERATIVE fibonacci sequence: starting from 0: " , nextNumber);
	}


}