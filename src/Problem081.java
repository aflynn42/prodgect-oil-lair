import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Problem081 implements Problem
{
	private Object value;
	public Problem081()
	{
	}
	
	@Override
	public Object result() throws IOException 
	{
		BufferedReader reader = new BufferedReader(new FileReader((String) value));
		String line = "";
		ArrayList <Integer> currLine = new ArrayList<Integer>();
		ArrayList <Integer> currSum = new ArrayList<Integer>();

		line = reader.readLine();
		currLine = UtilityFunctions.parseIntegerLine(line);

		currSum.add(currLine.get(0));

		for (int i = 1; i < currLine.size(); i++)
		{
			currSum.add(currLine.get(i) + currSum.get(i-1));
		}
		while ((line = reader.readLine()) != null)
		{
			currLine = UtilityFunctions.parseIntegerLine(line);
			currSum.set(0, currSum.get(0) + currLine.get(0));
			for (int i = 1; i < currLine.size(); i++)
			{
				currSum.set(i, currLine.get(i) + Math.min(currSum.get(i), currSum.get(i-1)));
			}
		}

		reader.close();
		return currSum.get(currSum.size()-1);
	}

	@Override
	public void setValue(Object input) 
	{
		value = input;		
	}
	
}
