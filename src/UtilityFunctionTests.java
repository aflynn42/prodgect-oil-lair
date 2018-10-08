import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

class UtilityFunctionTests 
{
	UtilityFunctions myFunctions;

	@Test
	void parseIntegerLineTest()
	{
		ArrayList<Integer> test = new ArrayList <Integer>(Arrays.asList(131,673,234,103,18));
		assertEquals(test, UtilityFunctions.parseIntegerLine("131,673,234,103,18"));
	}

	@Test
	void gcdTest()
	{
		assertEquals(49, UtilityFunctions.gcd(49, 98));
	}

	@Test
	void equivalentFractionTest()
	{
		assertTrue(UtilityFunctions.isEquivalentFraction(49, 98, 4, 8));
		assertFalse(UtilityFunctions.isEquivalentFraction(50, 98, 4, 8));
	}

	@Test
	void factorialTest4()
	{
		assertEquals(24, UtilityFunctions.factorial(4));		
	}

	@Test
	void factorialTest10()
	{
		assertEquals(3628800, UtilityFunctions.factorial(10));
	}

	@Test
	void PalindromeTest1()
	{
		assertFalse(UtilityFunctions.isPalindrome(233));
	}

	@Test
	void PalindromeTest2()
	{
		assertFalse(UtilityFunctions.isPalindrome(4389));
	}

	@Test
	void PalindromeTest3()
	{
		assertTrue(UtilityFunctions.isPalindrome(9009));
	}

	@Test
	void PalindromeTest4()
	{
		assertTrue(UtilityFunctions.isPalindrome(909));
	}
	
	@Test
	void PalindromeTest5()
	{
		assertFalse(UtilityFunctions.isPalindrome("233"));
	}

	@Test
	void PalindromeTest6()
	{
		assertFalse(UtilityFunctions.isPalindrome("4389"));
	}

	@Test
	void PalindromeTest7()
	{
		assertTrue(UtilityFunctions.isPalindrome("9009"));
	}

	@Test
	void PalindromeTest8()
	{
		assertTrue(UtilityFunctions.isPalindrome("909"));
	}
	
	@Test
	void divisorSumTest() 
	{
		assertEquals(284, UtilityFunctions.divisorSum(220));
		assertEquals(220, UtilityFunctions.divisorSum(284));
	}
	
	@Test
	void toBinaryTest1()
	{
		assertEquals("1", UtilityFunctions.toBinary(1));
	}
	@Test
	void toBinaryTest2()
	{
		assertEquals("10", UtilityFunctions.toBinary(2));
	}
	@Test
	void toBinaryTest3()
	{
		assertEquals("1111", UtilityFunctions.toBinary(15));
	}
	@Test
	void toBinaryTest4()
	{
		assertEquals("1001001001", UtilityFunctions.toBinary(585));
	}
}
