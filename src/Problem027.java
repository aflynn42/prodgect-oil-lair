import java.io.IOException;
import java.util.ArrayList;

public class Problem027 implements Problem {

	@SuppressWarnings("unused")
	private int value;
	int maxA; 
	int maxB;
	public Problem027()
	{
	}

	@Override
	public Object result() throws IOException 
	{
		ArrayList <Integer> primes = UtilityFunctions.generatePrimes(maxB);
		int b = 0, aMax = 0, bMax = 0, nMax = 0;
		for (int a = 0 - maxA; a <= maxA; a += 2)
		{
			for (int i = 0; i < primes.size(); i++)
			{
				int n = 0;
				b = primes.get(i);
				while (UtilityFunctions.isPrime(UtilityFunctions.EulerQuadraticFormula(a,b,n)))
				{

					n++;
				}
				if (n > nMax)
				{
					aMax = a;
					bMax = b;
					nMax = n;
				}
			}
		}

		int product = aMax * bMax;
		return product;
	}
	
	public void setValue(int inmaxA, int inmaxB) 
	{
		maxA = inmaxA;
		maxB = inmaxB;
	}

	@Override
	public void setValue(Object input) 
	{
		value = (int) input;

	}
}
