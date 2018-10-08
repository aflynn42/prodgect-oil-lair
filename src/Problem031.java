import java.io.IOException;

public class Problem031 implements Problem {

	private int value;
	public Problem031()
	{
	}

	@Override
	public Object result() throws IOException 
	{
		int [] denominations = {1,2,5,10,20,50,100,200};
		int [] possibleWays = new int [value + 1];
		possibleWays[0] = 1;
		for (int i = 0; i < denominations.length; i++)
		{
			for (int j = denominations[i]; j <= value; j++)
			{
				possibleWays[j] += possibleWays[j-denominations[i]];
			}
		}

		return possibleWays[value];
	}
	
	@Override
	public void setValue(Object input) 
	{
		value = (int) input;

	}
}
