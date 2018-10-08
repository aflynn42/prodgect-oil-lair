import java.io.IOException;

public class Problem004 implements Problem {

	private int value;
	public Problem004()
	{
	}
	@Override
	public Object result() throws IOException 
	{
		int result = 0;
		int min = (int)Math.pow(10, value-1);
		int max = (int)Math.pow(10, value) - 1;
		int product = 0;

		for (int i = min; i <= max; i++)
			for (int j = min; j <= max; j++)
			{
				product = i*j;
				if (UtilityFunctions.isPalindrome(product))
					result = Math.max(result, product);
			}

		return result;
	}

	@Override
	public void setValue(Object input) 
	{
		value = (int) input;

	}

}
