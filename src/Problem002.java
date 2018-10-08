
public class Problem002 implements Problem
{
	private Object value;
	public Problem002 ()
	{
		
	}
	
	public void setValue(Object input)
	{
		value = input;
	}
	
	@Override
	public Object result() 
	{
		int result = 0;

		int a = 1;
		int b = 2;
		int c = 0;
		while (a < (int) value)
		{
			if (a%2 == 0)
				result += a;
			c = a + b;
			a = b;
			b = c;
		}

		return result;
	}
	
}
