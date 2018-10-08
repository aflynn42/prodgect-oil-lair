import java.io.IOException;
import java.util.ArrayList;

public class Problem025 implements Problem {

	private int value;
	public Problem025()
	{
	}

	@Override
	public Object result() throws IOException 
	{
		int index = 2;

		ArrayList <Integer> fn = new ArrayList <Integer> ();
		ArrayList <Integer> fnMinus1 = new ArrayList <Integer> ();
		ArrayList <Integer> fnMinus2 = new ArrayList <Integer> ();

		fnMinus1.add(1);
		fnMinus2.add(1);

		while (fnMinus1.size() < value)
		{
			fn = addNumbers (fnMinus1, fnMinus2);
			fnMinus2 = fnMinus1;
			fnMinus1 = fn;
			index++;
		}

		return index;
	}
	
	public static ArrayList<Integer> addNumbers(ArrayList<Integer> A, ArrayList<Integer> B) 
	{
		int carry = 0;
		int sum = 0;
		ArrayList <Integer> result = new ArrayList <Integer> ();
		for (int i = 0; i < B.size(); i++)
		{
			sum = A.get(i) + B.get(i) + carry;
			result.add(sum % 10);
			if (sum >= 10)
				carry = 1;
			else
				carry = 0;
		}
		for (int i = B.size(); i < A.size(); i++)
		{
			sum = A.get(i) + carry;
			result.add(sum % 10);
			if (sum >= 10)
				carry = 1;
			else
				carry = 0;
		}

		if (carry != 0)
		{
			result.add(carry);
		}

		return result;
	}

	@Override
	public void setValue(Object input) 
	{
		value = (int) input;

	}
}
