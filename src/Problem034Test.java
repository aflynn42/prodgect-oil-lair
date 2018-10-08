import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Problem034Test {

	Problem myProblem;
	
	@BeforeEach
	public void initialize()
	{
		myProblem = new Problem034();
	}
	
	@Test
	void Test1() throws Exception
	{
		//myProblem.setValue(9);
		assertEquals("40730", myProblem.result());
	}

	@Test
	public void isSumOfDigitsFactorialTest()
	{
		assertTrue(Problem034.isSumOfDigitsFactorial(145));
	}
	
}	