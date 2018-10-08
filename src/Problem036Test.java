import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Problem036Test {

	Problem myProblem;
	
	@BeforeEach
	public void initialize()
	{
		myProblem = new Problem035();
	}
	
	@Test
	void Test1() throws Exception
	{
		myProblem.setValue(100);
		assertEquals(13, myProblem.result());
	}


	
}	