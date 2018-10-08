import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Problem033Test {

	Problem myProblem;
	
	@BeforeEach
	public void initialize()
	{
		myProblem = new Problem033();
	}
	
	@Test
	void Test1() throws Exception
	{
		//myProblem.setValue(9);
		assertEquals(100, myProblem.result());
	}

	@Test
	public void isCuriousTest()
	{
		assertTrue(Problem033.isCurious(49, 98));
		assertFalse(Problem033.isCurious(30, 50));
		assertFalse(Problem033.isCurious(50, 98));
	}
	
}	