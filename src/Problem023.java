import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Problem023 implements Problem {

	@SuppressWarnings("unused")
	private String value;
	public Problem023()
	{
	}

	@Override
	public Object result() throws IOException 
	{
		boolean[] isSumOfTwoAbundants = new boolean[28124];
		Arrays.fill(isSumOfTwoAbundants, false);

		ArrayList <Integer> abundantNums = generateAbundantNums();

		for (int i = 0; i < isSumOfTwoAbundants.length; i++)
		{
			for (int j = 0; j < abundantNums.size(); j++)
			{
				if (isAbundant(i - abundantNums.get(j)))
				{
					isSumOfTwoAbundants[i] = true;
					break;
				}
			}
		}

		int sum = 0;
		for (int i = 0; i < isSumOfTwoAbundants.length; i++)
		{
			if (!isSumOfTwoAbundants[i])
			{
				sum += i;
			}
		}

		return sum;
	}
	
	public static ArrayList<Integer> generateAbundantNums() {
		ArrayList<Integer> abundantNums = new ArrayList <Integer>();
		for (int i = 12; i < (28123 - 12); i++)
		{
			if (isAbundant(i))
				abundantNums.add(i);
		}
		return abundantNums;
	}

	public static boolean isAbundant(int n)
	{
		return ((n > 1) && (UtilityFunctions.divisorSum(n) > n));
	}
	


	@Override
	public void setValue(Object input) 
	{
		value = (String) input;

	}
}
