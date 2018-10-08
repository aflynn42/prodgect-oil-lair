import java.io.IOException;

public class Problem021 implements Problem {

	private int value;
	public Problem021()
	{
	}

	@Override
	public Object result() throws IOException 
	{
		int sum = 0;

		boolean [] isAmicableArray = new boolean[value];

		for (int i = 0; i < value; i++)
		{
			isAmicableArray[i] = isAmicable(i, value);
		}

		for (int j = 0; j < value; j++)
		{
			if (isAmicableArray[j])
			{
				sum += j;
			}
		}

		return sum;
	}
	
	public static boolean isAmicable(int input, int limit) 
	{
		int currDivisorSum = divisorSum(input);
		for (int j = 1; j < limit; j++)
		{
			if ((currDivisorSum == j) && (input == divisorSum(j)) && (input != j))
			{
				return true;
			}
		}
		return false;
	}
	
	public static int divisorSum (int input)
	{
		int sum = 1;
		int squareRoot = (int) Math.sqrt(input);
		for (int i = 2; i <= squareRoot; i++)
		{
			if ((input % i) == 0)
			{
				sum += i;
				sum += input/i;
				//System.out.println(i);
				//System.out.println(sum);
			}
		}
		if (input % Math.sqrt(input) == 0)
			sum -= squareRoot;
		//System.out.println(sum);
		return sum;
	}

	@Override
	public void setValue(Object input) 
	{
		value = (int) input;

	}
}
