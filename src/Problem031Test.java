import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Problem031Test {

	Problem myProblem;
	
	@BeforeEach
	public void initialize()
	{
		myProblem = new Problem031();
	}
	
	@Test
	void Test1() throws Exception
	{
		myProblem.setValue(200);
		assertEquals(73682, myProblem.result());
	}



	
}	