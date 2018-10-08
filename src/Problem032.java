import java.io.IOException;
import java.util.HashMap;

public class Problem032 implements Problem {

	private int value;
	public Problem032()
	{
	}

	@Override
	public Object result() throws IOException 
	{
		int product, sum = 0;
		String identity = "";
		HashMap<Integer, Boolean> products = new HashMap <Integer, Boolean>();
		for (int i = 0; i < 10000; i++)
		{
			for (int j = 0; j < 10000; j++)
			{
				product = i * j;
				identity = String.valueOf(product)+String.valueOf(i) + String.valueOf(j);
				if (isPandigital(identity, value))
				{
					products.put(product, true);
				}
			}
		}

		Object[] myProducts = products.keySet().toArray();
		for (int i = 0; i < myProducts.length; i++)
		{
			sum += (int) myProducts[i];
		}
		System.out.println("done");
		return sum;
	}
	
	public static boolean isPandigital(String input, int maxDigit)
	{
		if (input.length() != (maxDigit))
		{
			return false;
		}
		boolean encountered[] = new boolean[maxDigit+1];
		for (int i = 0; i < input.length(); i++)
		{
			int current = Character.getNumericValue(input.charAt(i));
			if (current > maxDigit)
				return false;
			else if (current == 0)
				return false;
			else if (encountered[current])
				return false;
			else
				encountered[current] = true;
		}

		return true;
	}
	
	@Override
	public void setValue(Object input) 
	{
		value = (int) input;

	}
}
