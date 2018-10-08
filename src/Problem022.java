import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;

public class Problem022 implements Problem {

	private String value;
	public Problem022()
	{
	}

	@Override
	public Object result() throws IOException 
	{
		BufferedReader reader = new BufferedReader(new FileReader(value));
		String line = reader.readLine();
		reader.close();
		ArrayList <String> namesArray = parseNames21(line);

		namesArray = sort22(namesArray);
		BigInteger result = BigInteger.ZERO;
		BigInteger val = BigInteger.ZERO;
		for (int i = 0; i < namesArray.size(); i++)
		{
			System.out.print(namesArray.get(i) + " ");
			val = BigInteger.valueOf((nameValue(namesArray.get(i)) * (i+1)));
			result = result.add(val);
		}
		return (result);
	}
	
	public static int nameValue(String string) 
	{
		int result = 0;
		char c;
		for (int i = 0; i < string.length(); i++)
		{
			c = string.charAt(i);
			result += (Character.getNumericValue(c) - Character.getNumericValue('A') + 1);
		}
		return result;
	}

	private static ArrayList<String> sort22(ArrayList<String> namesArray) 
	{
		//Collections.sort(namesArray);
		namesArray = sort22Radix(namesArray);
		return namesArray;
	}


	private static ArrayList<String> sort22Radix(ArrayList<String> namesArray) 
	{


		String currString = "";
		char c;
		int maxLength = 0;
		ArrayList<ArrayList <String>> alphabetBuckets = new ArrayList< ArrayList <String>>(26);

		for (int i = 0; i < 27; i++)
			alphabetBuckets.add(new ArrayList<String>());


		for (int i = 0; i < namesArray.size(); i++)
		{
			currString = namesArray.get(i);
			if (currString.length() > maxLength)
				maxLength = currString.length();
		}

		for (int currentDigit = maxLength; currentDigit > 0; currentDigit--)
		{
			System.out.println(currentDigit);

			for (int i = 0; i < namesArray.size(); i++)
			{
				currString = namesArray.get(i);
				if (currString.length() < currentDigit)
				{
					alphabetBuckets.get(0).add(currString);
				}
				else
				{

					c = currString.charAt(currentDigit - 1);
					alphabetBuckets.get((Character.getNumericValue(c) - Character.getNumericValue('A') + 1)).add(currString);
				}
			}	
			namesArray = collapseAlphabetBuckets(alphabetBuckets);
			for (int i = 0; i < 27; i++)
				alphabetBuckets.get(i).clear();
		}
		return namesArray;
	}

	public static ArrayList<String> collapseAlphabetBuckets(ArrayList<ArrayList<String>> alphabetBuckets) {
		ArrayList<String> result = new ArrayList<String>();
		//int sum = 0;
		for (int i = 0; i < alphabetBuckets.size(); i++)
		{
			//sum += alphabetBuckets.get(i).size();
			result.addAll(alphabetBuckets.get(i));
		} 
		return result;
	}

	private static ArrayList<String> parseNames21(String line) 
	{
		String substring = "";
		char c;
		ArrayList <String> array = new ArrayList<String>();
		for (int i = 1; i < line.length(); i++)
		{
			c = line.charAt(i);
			if (Character.isLetter(c))
				substring = substring + c;
			else
				if (!substring.equals(""))
				{
					array.add(substring);
					substring = "";
				}

		}
		return array;
	}


	@Override
	public void setValue(Object input) 
	{
		value = (String) input;

	}
}
