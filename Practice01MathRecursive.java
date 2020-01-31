public class Practice01MathRecursive implements Practice01Math
{
	
	// public static void main(String[] args)
	// {
	// 	System.out.println(fact(10));
	// 	System.out.println(fib(4));
	//checks out!
	// }

	public int fib(int n)
	{
		if(n < 0){
			throw new IllegalArgumentException("Enter value greater than 0.");
		}
		if(n == 0)
			return 0;
		if(n == 1)
			return 1;
		return fib(n - 1) + fib(n - 2);
	}

	public int fact(int n)
	{
		if(n < 0){
			throw new IllegalArgumentException("Enter value greater than 0.");
		}
		if(n == 0)
			return 0;
		if(n == 1)
			return 1;
		return n * fact(n -1);
	}
}