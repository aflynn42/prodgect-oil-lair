import java.io.IOException;

public class Problem017 implements Problem {

	@SuppressWarnings("unused")
	private int value;
	public Problem017()
	{
	}

	@Override
	public Object result() throws IOException 
	{
		int count = 0;
		for (int i = 0; i < value; i++)
		{
			count += getLetterCount(i);
		}
		count += countChar("one thousand");

		return count;
	}


	public static int getLetterCount(int input) 
	{
		String result = "";

		if ((input / 100) > 0)
		{
			result = result + hundredsString[input/100];
			input = input % 100;
			if (input != 0)
				result = result + " and ";
		}

		if ((input < 20) && (input >= 10))
			result = result + teenString[input % 10];
		else
		{
			result = result + tensString[input/10];
			result = result + onesString[input % 10];
		}

		//System.out.println(result);

		return countChar(result);
	}

	public static int countChar (String input)
	{
		int count = 0;
		char c;
		for (int i = 0; i < input.length(); i++)
		{
			c = input.charAt(i);
			if (Character.isLetterOrDigit(c))
				count++;
		}
		return count;
	}


	@Override
	public void setValue(Object input) 
	{
		value = (int) input;

	}

	private static String [] hundredsString =
		{ "", 
				"one hundred",
				"two hundred",
				"three hundred",
				"four hundred",
				"five hundred",
				"six hundred",
				"seven hundred",
				"eight hundred",
				"nine hundred",
		};
	private static String [] tensString =
		{
				"",
				"",
				"twenty-",
				"thirty-",
				"forty-",
				"fifty-",
				"sixty-",
				"seventy-",
				"eighty-",
				"ninety-"
		};
	private static String [] onesString =
		{
				"",
				"one",
				"two",
				"three",
				"four",
				"five",
				"six",
				"seven",
				"eight",
				"nine"
		};
	private static String [] teenString =
		{
				"ten",
				"eleven",
				"twelve",
				"thirteen",
				"fourteen",
				"fifteen",
				"sixteen",
				"seventeen",
				"eighteen",
				"nineteen"
		};
	
}
