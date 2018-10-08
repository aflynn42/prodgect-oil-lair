import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Problem026Test {

	Problem myProblem;
	
	@BeforeEach
	public void initialize()
	{
		myProblem = new Problem026();
	}
	
	@Test
	void Test1() throws Exception
	{
		myProblem.setValue(10);
		assertEquals(7, myProblem.result());
	}


	@Test
	void findRecurringCycleTest6()
	{
		assertEquals(1, Problem026.findRecurringCycle(6));
	}
	
	@Test
	void findRecurringCycleTest()
	{
		assertEquals(6, Problem026.findRecurringCycle(7));
		assertEquals(1, Problem026.findRecurringCycle(3));
		assertEquals(0, Problem026.findRecurringCycle(2));
		
	}
	
}	