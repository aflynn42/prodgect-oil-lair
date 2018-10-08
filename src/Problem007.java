import java.io.IOException;

public class Problem007 implements Problem {

	private int value;
	public Problem007()
	{
	}
	
	@Override
	public Object result() throws IOException 
	{
		if (value == 1)
			return 2;
		int result = 3;
		int i = 2;
		int j = 3;
		while (i <= value)
		{
			if (UtilityFunctions.isPrime(j))
			{
				result = j;
				i++;
			}
			j++;

		}

		return result;
	}

	@Override
	public void setValue(Object input) 
	{
		value = (int) input;

	}

}
