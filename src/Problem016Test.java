import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Problem016Test {

	Problem myProblem;
	
	@BeforeEach
	public void initialize()
	{
		myProblem = new Problem016();
	}
	
	@Test
	void test1() throws Exception
	{
		myProblem.setValue(15);
		assertEquals(26, myProblem.result());
	}


}	