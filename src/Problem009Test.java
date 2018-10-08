import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Problem009Test {

	Problem myProblem;
	
	@BeforeEach
	public void initialize()
	{
		myProblem = new Problem009();
	}
	
	@Test
	void Test1() throws Exception
	{
		myProblem.setValue(12);
		assertEquals(3*4*5, myProblem.result());
	}

}