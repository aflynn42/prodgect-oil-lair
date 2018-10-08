import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Problem012Test {

	Problem myProblem;
	
	@BeforeEach
	public void initialize()
	{
		myProblem = new Problem012();
	}
	
	@Test
	void Test1() throws Exception
	{
		myProblem.setValue(5);
		assertEquals(28, myProblem.result());
	}
	@Test
	void Test2() throws Exception
	{
		myProblem.setValue(3);
		assertEquals(6, myProblem.result());
	}

}