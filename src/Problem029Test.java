import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Problem029Test {

	Problem myProblem;
	
	@BeforeEach
	public void initialize()
	{
		myProblem = new Problem029();
	}
	
	@Test
	void Test1() throws Exception
	{
		myProblem.setValue(5);
		assertEquals(15, myProblem.result());
	}



	
}	