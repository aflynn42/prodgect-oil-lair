import java.io.IOException;
import java.util.ArrayList;

public class Problem016 implements Problem {

	private int value;
	public Problem016()
	{
	}

	@Override
	public Object result() throws IOException 
	{
		ArrayList<Integer> digits = new ArrayList<Integer>(value);
		digits.add(2);
		for (int i = 1; i < value; i++)
		{
			digits = arrayTimesTwo(digits);
		}
		return sumArray(digits);
	}


	public static ArrayList<Integer> arrayTimesTwo (ArrayList<Integer> digits)
	{

		ArrayList<Integer> newDigits = new ArrayList<Integer>(digits.size());
		int currVal = 0;
		int doubleVal = 0;
		int carry = 0;
		for (int i = 0; i < digits.size(); i++)
		{
			currVal = digits.get(i);
			doubleVal = currVal * 2;
			newDigits.add((doubleVal % 10) + carry);
			if (doubleVal >= 10)
				carry = 1;
			else
				carry = 0;
		}
		if (carry == 1)
			newDigits.add(1);
		return newDigits;
	}

	public static int sumArray(ArrayList<Integer> digits) 
	{
		int result = 0;
		for (int j = 0; j < digits.size(); j++)
			result += digits.get(j);
		return result;
	}

	@Override
	public void setValue(Object input) 
	{
		value = (int) input;

	}

}
