/* CS245 Practice Assignment 1 recursive - calls itself
victoria nerecina

this program:
implements Practice01Math interface (given)
contains public int fib (int n) - used geeksforgeeks
		 public int fact (int n)

*/


public class Practice01MathRecursive implements Practice01Math //correct
{

	public int fact(int n) throws Exception
	{
		///factorials
		if(n < 0)
			throw new Exception();
		if(n == 1) // 0 = 0, 1 = 1
			return 1;
		else;
			return n * fact(n - 1); 
		
	}


	//from GeeksForGeeks and in class
	public int fib(int n) throws Exception
	{
		////fibonacci
		if(n <= 1) // 0, 1
			return n;
		return fib(n-1) + fib(n-2);
	}








	// //checkkkkkking ???? :(
	// public static void main(String[] args)
	// {
	//	int n = 5;
	// 	System.out.println(fact(5)); // should be 120
	// 	System.out.println(fib(5)); // first 5 numbers are 0 1 1 2 3 

	// }

}

