import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Problem010Test {

	Problem myProblem;
	
	@BeforeEach
	public void initialize()
	{
		myProblem = new Problem010();
	}
	
	@Test
	void Test1() throws Exception
	{
		myProblem.setValue(10);
		assertEquals((long)17, myProblem.result());
	}

}