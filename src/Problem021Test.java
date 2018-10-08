import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Problem021Test {

	Problem myProblem;
	
	@BeforeEach
	public void initialize()
	{
		myProblem = new Problem021();
	}
	
	@Test
	void isAmicableTest()
	{
		assertTrue(Problem021.isAmicable(220, 1000));
		assertFalse(Problem021.isAmicable(119, 1000));
	}
	@Test
	void divisorSumTest() 
	{
		assertEquals(284, Problem021.divisorSum(220));
		assertEquals(220, Problem021.divisorSum(284));
	}
	
	@Test
	void divisorSumTest2() 
	{
		assertEquals(3, Problem021.divisorSum(4));
	}

	@Test
	void Test1() throws Exception
	{
		myProblem.setValue(10000);
		assertEquals(31626, myProblem.result());
	}

}	