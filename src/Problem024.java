import java.io.IOException;
import java.util.ArrayList;

public class Problem024 implements Problem {

	@SuppressWarnings("unused")
	private Object value;
	private int target;
	private int digits;
	public Problem024()
	{
	}

	@Override
	public Object result() throws IOException 
	{
		String result = "";

		target = target - 1;

		ArrayList<Integer> availableDigits = new ArrayList <Integer>();
		ArrayList<Integer> resultDigits = new ArrayList <Integer>();

		for (int i = 0; i < digits; i++)
		{
			availableDigits.add(i);
		}

		for (int j = digits; j > 0; j--)
		{
			int divisor = UtilityFunctions.factorial(j-1);
			resultDigits.add(availableDigits.remove(target/divisor));
			target = target % divisor;
		}

		for (int k = 0; k < resultDigits.size(); k++)
		{
			result = result + String.valueOf(resultDigits.get(k));
		}
		return result;
	}
	
	public void setValue(int inTarget, int inDigits) 
	{
		this.target = inTarget;
		this.digits = inDigits;

	}

	@Override
	public void setValue(Object input) 
	{
		value = input;

	}
}
