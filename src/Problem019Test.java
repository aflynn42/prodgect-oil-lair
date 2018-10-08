import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Problem019Test {

	Problem myProblem;
	
	@BeforeEach
	public void initialize()
	{
		myProblem = new Problem019();
	}

	
	@Test
	void EOMTestFebruary()
	{
		assertTrue(Problem019.isEOM(29, 2, 2000));
		assertFalse(Problem019.isEOM(28, 2, 2000));
		assertTrue(Problem019.isEOM(28, 2, 2001));
	}
	
	@Test
	void leapYearTest()
	{
		assertTrue(Problem019.isLeapYear(1904));
		assertFalse(Problem019.isLeapYear(1905));
		assertTrue(Problem019.isLeapYear(2000));
		assertFalse(Problem019.isLeapYear(1900));
	}
}	