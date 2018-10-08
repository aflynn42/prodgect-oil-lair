import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Problem024Test {

	Problem024 myProblem;
	
	@BeforeEach
	public void initialize()
	{
		myProblem = new Problem024();
	}
	
	@Test
	void Test1() throws Exception
	{
		myProblem.setValue(4,3);
		assertEquals("120", myProblem.result());
	}


}	