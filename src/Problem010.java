import java.io.IOException;

public class Problem010 implements Problem {

	private int value;
	public Problem010()
	{
	}
	
	@Override
	public Object result() throws IOException 
	{
		long result = 0;
		for (int i = 2; i < value; i++)
			if (UtilityFunctions.isPrime(i))
				result += i;
		return result;
	}

	@Override
	public void setValue(Object input) 
	{
		value = (int) input;

	}

}
