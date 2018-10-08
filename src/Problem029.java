import java.io.IOException;
import java.util.ArrayList;

public class Problem029 implements Problem {

	private int value;
	public Problem029()
	{
	}

	@Override
	public Object result() throws IOException 
	{
		ArrayList <Double> numbers = new ArrayList <Double>();
		for (int a = 2; a <= value; a++)
		{
			for (int b = 2; b <= value; b++)
			{

				Double thisNum = Math.pow(a, b);
				System.out.println(thisNum);
				if (!numbers.contains(thisNum))
				{
					System.out.println(a + " " + b);
					numbers.add(thisNum);
				}
			}
		}
		return numbers.size();
	}
	
	@Override
	public void setValue(Object input) 
	{
		value = (int) input;

	}
}
