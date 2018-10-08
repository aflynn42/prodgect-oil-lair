import java.io.IOException;

public class Problem033 implements Problem {

	@SuppressWarnings("unused")
	private int value;
	public Problem033()
	{
	}

	@Override
	public Object result() throws IOException 
	{
		int numProduct = 1, denomProduct = 1;
		for (int i = 10; i < 99; i++)
		{
			for (int j = i+1; j < 100; j++)
			{
				if (isCurious(i,j))
				{
					numProduct = i * numProduct;
					denomProduct = j * denomProduct;
					System.out.println(i + " " + j);
				}
			}
		}
		return denomProduct / UtilityFunctions.gcd(numProduct, denomProduct);
	}
	
	public static boolean isCurious(int numerator, int denominator)
	{
		int a = numerator/10;
		int b = numerator%10;
		int c = denominator/10;
		int d = denominator%10;

		if (a == c)
		{
			return UtilityFunctions.isEquivalentFraction(numerator,denominator,b,d);
		}
		else if (a == d)
		{
			return UtilityFunctions.isEquivalentFraction(numerator,denominator,b,c);
		}
		else if (b == c)
		{
			return UtilityFunctions.isEquivalentFraction(numerator,denominator,a,d);
		}
		else if ((b == d) && (b!=0))
		{
			return UtilityFunctions.isEquivalentFraction(numerator,denominator,a,c);
		}

		else
			return false;
	}
	
	@Override
	public void setValue(Object input) 
	{
		value = (int) input;

	}
}
