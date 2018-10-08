import java.io.IOException;

public class Problem003 implements Problem {

	private Object value;
	public Problem003()
	{
	}
	@Override
	public Object result() throws IOException 
	{
		int result = 0;
		int n = (int) value;
		int i = 2;
		while (n > 1)
		{
			while (n%i == 0)
			{
				n = n / i;
				result = i;
			}
			i++;
		}
		return result;
	}

	@Override
	public void setValue(Object input) 
	{
		value = input;

	}

}
