import java.io.IOException;
import java.util.HashMap;

public class Problem026 implements Problem {

	private int value;
	public Problem026()
	{
	}

	@Override
	public Object result() throws IOException 
	{
		int result = 1;
		int largestRecurringCycle = 0;
		int thisCycle;

		for (int i = 2; i < value; i++)
		{
			thisCycle = findRecurringCycle(i);
			if (thisCycle > largestRecurringCycle)
			{
				largestRecurringCycle = thisCycle;
				result = i;
			}
		}

		return result;
	}
	
	static int findRecurringCycle(int divisor)
	{
		int digits = 1;
		int dividend = 1;
		HashMap <Integer, Integer> remainders = new HashMap <Integer, Integer>();

		int remainder = 0;

		while (true)
		{
			while (dividend < divisor)
			{
				dividend = dividend * 10;
			}
			remainder = dividend % divisor;

			if (remainders.containsKey(remainder))
			{
				return digits - remainders.get(remainder);
			}
			else if (remainder == 0)
			{
				return 0;
			}
			else
			{
				remainders.put(remainder, digits);
			}
			dividend = remainder;
			digits++;
		}

	}


	@Override
	public void setValue(Object input) 
	{
		value = (int) input;

	}
}
