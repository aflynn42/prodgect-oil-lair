import java.io.IOException;

public class Problem006 implements Problem {

	private int value;
	public Problem006()
	{
	}
	
	@Override
	public Object result() throws IOException 
	{
		double sumSquares = 0;
		double squareSum = 0;
		for (int i = 1; i <= value; i++)
			sumSquares += Math.pow(i, 2);
		for (int j = 1; j <= value; j++)
			squareSum += j;
		squareSum = Math.pow(squareSum, 2);
		return (int) (squareSum - sumSquares);
	}

	@Override
	public void setValue(Object input) 
	{
		value = (int) input;

	}

}
