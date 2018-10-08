import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Problem006Test {

	Problem myProblem;
	
	@BeforeEach
	public void initialize()
	{
		myProblem = new Problem006();
	}
	
	@Test
	void Test1() throws Exception
	{
		myProblem.setValue(10);
		assertEquals(2640, myProblem.result());
	}
}
