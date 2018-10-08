import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Problem032Test {

	Problem myProblem;
	
	@BeforeEach
	public void initialize()
	{
		myProblem = new Problem032();
	}
	
	@Test
	void Test1() throws Exception
	{
		myProblem.setValue(9);
		assertEquals(45228, myProblem.result());
	}

	@Test
	public void isPandigitalTest()
	{
		assertTrue(Problem032.isPandigital("15243", 5));
		assertFalse(Problem032.isPandigital("16243", 5));
		assertFalse(Problem032.isPandigital("1543", 5));
		assertFalse(Problem032.isPandigital("15223", 5));
		assertTrue(Problem032.isPandigital("14253", 5));
	}

	
}	