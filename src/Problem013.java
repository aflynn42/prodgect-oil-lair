import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;

public class Problem013 implements Problem {

	@SuppressWarnings("unused")
	private int value;
	public Problem013()
	{
	}
	
	@Override
	public Object result() throws IOException 
	{
		String result = "";
		BigInteger sum = BigInteger.ZERO;
		try (BufferedReader br = new BufferedReader (new FileReader("problem13.txt")))
		{
			String line = "";
			//System.out.println(line);
			while ((line = br.readLine()) != null)
			{
				//System.out.println(line);
				sum = sum.add(new BigInteger(line));
				//System.out.println(sum);
			}
			result = sum.toString();
			return result.substring(0, 10);
		}
	}
	
	@Override
	public void setValue(Object input) 
	{
		value = (int) input;

	}

}
