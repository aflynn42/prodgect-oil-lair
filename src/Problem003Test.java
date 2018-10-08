import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Problem003Test {

	Problem myProblem;
	
	@BeforeEach
	public void initialize()
	{
		myProblem = new Problem003();
	}
	
	@Test
	void Problem3Test1() throws Exception
	{
		myProblem.setValue(13195);
		assertEquals(29, myProblem.result());
	}
	
	@Test
	void Problem3Test2() throws Exception
	{
		myProblem.setValue(10);
		assertEquals(5, myProblem.result());
	}

}
