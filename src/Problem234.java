import java.io.IOException;

public class Problem234 implements Problem {

	private int inputResNum;
	private int inputResDenom;
	@Override
	public Object result() throws IOException 
	{
		int gcd = UtilityFunctions.gcd(inputResNum, inputResDenom);
		inputResNum = inputResNum/gcd;
		inputResDenom = inputResDenom/gcd;
		int denom = inputResDenom;
		double resilience = 1.0;
		double inputResilience = (double)inputResNum/inputResDenom;
		while (resilience >= inputResilience)
		{
			denom++;
			int count = 0;
			for (int i = 1; i < denom; i++)
			{
				if (UtilityFunctions.gcd(i,denom) == 1)
				{
					count++;
				}
			}
			resilience = (double)count/(denom-1);
		}
		return denom;
	}

	public void setValue(Object inputNum, Object inputDenom) 
	{
		inputResNum = (int) inputNum;
		inputResDenom = (int) inputDenom;
	}

	@Override
	public void setValue(Object input) {

		
	}

}
