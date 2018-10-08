import java.io.IOException;

public class Problem014 implements Problem {

	private int value;
	public Problem014()
	{
	}
	
	@Override
	public Object result() throws IOException 
	{
		long max = 0;
		long result = 1;
		long currcount = 1;
		for (long i = 1; i < value; i++)
		{
			currcount = collatzCount(i);
			if (max < currcount)
			{
				max = currcount;
				result = i;
			}
		}
		return result;
	}
	
	public static long collatzCount(long n) 
	{
		long count = 1;
		while (n > 1)
		{
			if (n % 2 == 0)
			{
				n = n/2;
				count++;
			}
			else
			{
				n = (3*n) + 1;
				count++;
			}
		}
		return count;
	}
	
	@Override
	public void setValue(Object input) 
	{
		value = (int) input;

	}

}
