import java.io.IOException;
import java.util.ArrayList;

public class Problem030 implements Problem {

	private int value;
	public Problem030()
	{
	}

	@Override
	public Object result() throws IOException 
	{
		int sum = -1;
		int [] digitVals = new int [10];
		ArrayList <Integer> numbers = new ArrayList<Integer>();
		
		for (int i = 0; i < 10; i++)
		{
			digitVals[i] = (int) Math.pow(i,value);
		}
		
		int maxSumOfDigits = digitVals[9];
		int maxNumber = 9;
		
		while (maxNumber < maxSumOfDigits)
		{
			maxSumOfDigits += digitVals[9];
			maxNumber = maxNumber * 10;
			maxNumber += 9;
		}
		
		for (int i = 0; i < maxNumber; i++)
		{
			if (canBeWrittenAsSum(i, digitVals))
			{
				numbers.add(i);
			}
		}
		
		
		for (int i = 0; i < numbers.size(); i++)
		{
			sum += numbers.get(i);
		}
		
		return sum;
	}
	
	static boolean canBeWrittenAsSum(int input, int[] digitVals) 
	{
		int sum = 0;
		String inputString = String.valueOf(input);
		for (int i = 0; i < inputString.length(); i++)
		{
			sum += digitVals[(inputString.charAt(i)- '0')];
		}
		return (sum == input);
	}
	
	@Override
	public void setValue(Object input) 
	{
		value = (int) input;

	}
}
