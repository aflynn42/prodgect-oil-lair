import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Problem005Test {

	Problem myProblem;
	
	@BeforeEach
	public void initialize()
	{
		myProblem = new Problem005();
	}
	
	@Test
	void Problem5Test1() throws Exception
	{
		myProblem.setValue(10);
		assertEquals(2520, myProblem.result());
	}

}
