import java.io.IOException;

public class Problem012 implements Problem {

	private int value;
	public Problem012()
	{
	}
	
	@Override
	public Object result() throws IOException 
	{
		int result = 0;
		int i = 1;
		while (numDivisors(result) <= value)
		{
			result += i;
			i++;
		}
		return result;
	}

	public static int numDivisors(int input) 
	{
		int count = 0;
		int sqrt = (int) Math.sqrt(input);

		for (int i = 1; i <= sqrt; i++)
			if (input % i == 0)
				count+=2;	
		if (sqrt * sqrt == input)
			count--;
		return count;
	}
	
	@Override
	public void setValue(Object input) 
	{
		value = (int) input;

	}

}
