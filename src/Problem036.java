import java.io.IOException;
import java.util.ArrayList;

public class Problem036 implements Problem {

	private int value;
	public Problem036()
	{
	}

	@Override
	public Object result() throws IOException 
	{
		int sum = 0;
		for (int i = 1; i < value; i++)
		{
			if (UtilityFunctions.isPalindrome(i))
			{
				if (UtilityFunctions.isPalindrome(UtilityFunctions.toBinary(i)))
					sum += i;
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
