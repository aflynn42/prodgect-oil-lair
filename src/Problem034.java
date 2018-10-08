import java.io.IOException;
import java.math.BigInteger;

public class Problem034 implements Problem {

	@SuppressWarnings("unused")
	private int value;
	public Problem034()
	{
	}

	@Override
	public Object result() throws IOException 
	{
		BigInteger sum = BigInteger.ZERO;
		for (int i = 3; i < 2540160; i++)
		{
			if (isSumOfDigitsFactorial(i))
			{
				sum = sum.add(BigInteger.valueOf(i));
			}
		}
		return sum.toString();
	}
	
	static boolean isSumOfDigitsFactorial(int input) 
	{
		int sum = 0;
		int n = input;
		
		while((sum <= input) && (n > 0))
		{
			sum += UtilityFunctions.factorial(n%10);
			n = n/10;
			//System.out.println(sum);
		}

		return (sum == input);
	}

	
	@Override
	public void setValue(Object input) 
	{
		value = (int) input;

	}
}
