import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Problem028Test {

	Problem myProblem;
	
	@BeforeEach
	public void initialize()
	{
		myProblem = new Problem028();
	}
	
	@Test
	void Test1() throws Exception
	{
		myProblem.setValue(5);
		assertEquals(101, myProblem.result());
	}



	
}	