import java.io.IOException;
import java.util.ArrayList;

public class Problem035 implements Problem {

	private int value;
	public Problem035()
	{
	}

	@Override
	public Object result() throws IOException 
	{
		int count = 0;
		ArrayList <Integer> primes = UtilityFunctions.generatePrimes(value);
		for (int i = 0; i < primes.size(); i++)
		{
			if (isCircular(primes.get(i), primes))
			{
				count++;
				System.out.println(primes.get(i));
				System.out.println(count);
			}
		}	
		return count;
	}
	
	private boolean isCircular(Integer input, ArrayList<Integer> primes)
	{
		String inputString = input.toString();
		String lastString = input.toString();
		String nextString = inputString.substring(1) + inputString.charAt(0);
		while (!nextString.equals(inputString))
		{
			int current = Integer.valueOf(nextString);
			if(!UtilityFunctions.isPrime(current))
				return false;
			lastString = nextString;
			nextString = lastString.substring(1) + lastString.charAt(0);
		} 
		return true;
	}

	@Override
	public void setValue(Object input) 
	{
		value = (int) input;

	}
}
