import java.util.ArrayList;

public class UtilityFunctions 
{

	public UtilityFunctions()
	{

	}
	
	public static int gcd (int a, int b)
	{
		if (b == 0)
			return a;
		else
			return gcd(b, a%b);
	}
	
	public static boolean isPrime(int input)
	{
		if ((input == 0) || (input == 1))
			return false;

		for (int i = 2; i <= Math.sqrt(input); i++)
		{
			if ((input % i == 0) && (input != i))
				return false;
		}
		return true;
	}
	public static int factorial (int input)
	{
		int result = 1;
		for (int i = 1; i <= input; i++)
		{
			result = result * i;
		}
		return result;
	}
	public static ArrayList<Integer> generatePrimes (int max)
	{
		ArrayList<Integer> primeList = new ArrayList<Integer>();
		for (int i = 0; i <= max; i++)
		{
			if (isPrime(i))
			{
				primeList.add(i);
			}
		}
		return primeList;
	}

	public static boolean isEquivalentFraction(int numA, int denA, int numB, int denB) 
	{
		int gcdA = gcd(denA,numA);
		int gcdB = gcd(numB,denB);
		return((denA/gcdA == denB/gcdB) && ((numA/gcdA)==(numB/gcdB)));
	}

	static ArrayList<Integer> parseIntegerLine(String line) 
	{
		ArrayList<Integer> myList = new ArrayList<Integer>();
		String num = "";
		char c;
		for (int i = 0; i < line.length(); i++)
		{
			c = line.charAt(i);
			if (c == ',')
			{
				myList.add(Integer.parseInt(num));
				num = "";
			}
			else if (Character.isDigit(c))
				num = num + c;
			else
			{
			}
		}
		myList.add(Integer.parseInt(num));
		return myList;
	}

	public static boolean isPalindrome(int input)
	{
		String inputString = Integer.toString(input);
		int i = 0;
		int j = inputString.length() - 1;
		while (i < j)
		{
			if (inputString.charAt(i) != inputString.charAt(j))
				return false;
			i++;
			j--;		
		}
		return true;
	}
	
	public static boolean isPalindrome(String input)
	{
		int i = 0;
		int j = input.length() - 1;
		while (i < j)
		{
			if (input.charAt(i) != input.charAt(j))
				return false;
			i++;
			j--;		
		}
		return true;
	}
	
	public static String toBinary(int input)
	{
		String binary ="0";
		int i = 0;
		while (Math.pow(2, i) < input)
			i++;
		while (i > -1)
		{
			if (input >= Math.pow(2, i))
			{
				binary = binary + "1";
				input -= Math.pow(2, i);
			}
			else
				binary = binary + "0";
			i--;
		}
		
		while(binary.charAt(0) == '0')
			binary = binary.substring(1);
		return binary;
	}
	
	public static int divisorSum (int input)
	{
		int sum = 1;
		int squareRoot = (int) Math.sqrt(input);
		for (int i = 2; i <= squareRoot; i++)
		{
			if ((input % i) == 0)
			{
				sum += i;
				sum += input/i;
				//System.out.println(i);
				//System.out.println(sum);
			}
		}
		if (input % Math.sqrt(input) == 0)
			sum -= squareRoot;
		//System.out.println(sum);
		return sum;
	}
	
	public static int EulerQuadraticFormula(int a, int b, int n) 
	{
		return (int) (Math.pow(n, 2) + (a * n) + b);
	}

}
