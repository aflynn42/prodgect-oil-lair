import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Problem004Test {

	Problem myProblem;
	
	@BeforeEach
	public void initialize()
	{
		myProblem = new Problem004();
	}
	
	@Test
	void Problem4Test1() throws Exception
	{
		myProblem.setValue(2);
		assertEquals(9009, myProblem.result());
	}


}
