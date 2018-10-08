import java.io.IOException;

public class Problem005 implements Problem {

	private int value;
	public Problem005()
	{
	}
	@Override
	public Object result() throws IOException 
	{
		int result = 1;
		for (int i = 1; i < value; i++)
			result = (result * i) / UtilityFunctions.gcd(result, i);
		return result;
	}

	@Override
	public void setValue(Object input) 
	{
		value = (int) input;

	}

}
