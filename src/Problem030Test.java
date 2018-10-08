import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Problem030Test {

	Problem myProblem;
	
	@BeforeEach
	public void initialize()
	{
		myProblem = new Problem030();
	}
	
	@Test
	void Test1() throws Exception
	{
		myProblem.setValue(4);
		assertEquals(19316, myProblem.result());
	}


	@Test
	void problem30SummationTest()
	{
		int [] digitVals = new int [10];
		for (int i = 0; i < 10; i++)
		{
			digitVals[i] = (int) Math.pow(i,4);
			System.out.println(digitVals[i]);
		}
		
		assertTrue(Problem030.canBeWrittenAsSum(1634, digitVals));
	}
	
}	