import java.io.IOException;

public class Problem028 implements Problem {

	private int value;
	public Problem028()
	{
	}

	@Override
	public Object result() throws IOException 
	{
		int sum = 0, n = 1, sideLength = 2, sideCount = 0;
		int sq = value * value;
		while (n <= sq)
		{
			sum += n;
			n += sideLength;
			sideCount++;
			if (sideCount == 4)
			{
				sideCount = 0;
				sideLength += 2;
			}
		}

		return sum;
	}
	
	@Override
	public void setValue(Object input) 
	{
		value = (int) input;

	}
}
