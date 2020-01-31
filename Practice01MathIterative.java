import java.util.ArrayList;

public class Practice01MathIterative implements Practice01Math
{
	
	// public static void main(String[] args)
	// {
	// 	System.out.println(fact(4));
	// 	System.out.println(fib(10));
	//checks out!
	// }

	public int fact(int n)
	{
		if(n < 0){
			throw new IllegalArgumentException("Enter value greater than 0.");
		}
		if(n == 0)
			return 0;
		if(n == 1)
			return 1;
		for(int i = n-1; i > 0; --i)
			n *= i;
		return n;
	}

	public int fib(int n)
	{
		int sum = 0;
		ArrayList<Integer> fibArray = new ArrayList<Integer>();
		fibArray.add(0); fibArray.add(1); 
		if(n < 0) {
			throw new IllegalArgumentException("Enter value greater than 0.");
		}
		if(n == 0)
			return fibArray.get(0);
		if(n == 1)
			return fibArray.get(1);
		for(int i = 2; i <= n; i++) {
			sum = fibArray.get(i - 1) + fibArray.get(i - 2);
			fibArray.add(sum);
		}
		return fibArray.get(n);
	}

}