import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Problem008Test {

	Problem myProblem;
	
	@BeforeEach
	public void initialize()
	{
		myProblem = new Problem008();
	}
	
	@Test
	void Test1() throws Exception
	{
		myProblem.setValue(4);
		assertEquals(5832, myProblem.result());
	}

}