import static org.junit.jupiter.api.Assertions.*;

import java.math.BigInteger;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Problem015Test {

	Problem myProblem;
	
	@BeforeEach
	public void initialize()
	{
		myProblem = new Problem015();
	}
	
	@Test
	void test1() throws Exception
	{
		BigInteger expected = BigInteger.valueOf(6);
		myProblem.setValue(2);
		assertEquals(expected, myProblem.result());
	}
	@Test
	void factorialTest() throws Exception
	{
		BigInteger expected = BigInteger.valueOf(24);
		assertEquals(expected, Problem015.factorial(4));
	}
	

	

}