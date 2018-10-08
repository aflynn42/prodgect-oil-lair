import java.io.IOException;
import java.math.BigInteger;

public class Problem015 implements Problem {

	private int value;
	public Problem015()
	{
	}

	@Override
	public Object result() throws IOException 
	{

		return (factorial(2*value).divide(
				(factorial(value).multiply(factorial(value))))
				);

	}


	public static BigInteger factorial(int n)
	{
		if ( n < 1)
			return BigInteger.ZERO;
		BigInteger result = BigInteger.ONE;
		for (long i = 1; i <= n; i++)
			result = result.multiply(BigInteger.valueOf(i));
		//System.out.println(n + " " + result);
		return result;

	}

	@Override
	public void setValue(Object input) 
	{
		value = (int) input;

	}

}
