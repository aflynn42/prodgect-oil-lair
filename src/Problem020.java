import java.io.IOException;
import java.math.BigInteger;

public class Problem020 implements Problem {

	private Object value;
	public Problem020()
	{
	}

	@Override
	public Object result() throws IOException 
	{
		int count = 0;
		int n = (int) value;
		BigInteger value = BigInteger.ONE;
		while (n > 1)
		{
			value = value.multiply(BigInteger.valueOf(n));
			n--;
		}
		String valueString = value.toString();
		for (int i = 0; i < valueString.length(); i++)
		{
			count += Character.getNumericValue(valueString.charAt(i));
		}
		return count;
	}
	


	@Override
	public void setValue(Object input) 
	{
		value = input;

	}
}
