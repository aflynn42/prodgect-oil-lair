import java.io.IOException;

public class Problem009 implements Problem {

	private int value;
	public Problem009()
	{
	}
	
	@Override
	public Object result() throws IOException 
	{
		double c2 = 0;
		double c = 0;
		for (int a = 1; a < value; a++)
			for (int b = 1; b <= a; b++)
			{
				c2 = (Math.pow(a, 2) + Math.pow(b, 2));
				c = Math.sqrt(c2);
				if ((c % 1 == 0) && (a + b + c == value))
				{
					System.out.println(a + " " + b + " " + c);

					return (int) (a * b * c);
				}
			}

		return -1;
	}

	@Override
	public void setValue(Object input) 
	{
		value = (int) input;

	}

}
