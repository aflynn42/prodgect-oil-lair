import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Problem014Test {

	Problem014 myProblem;
	
	@BeforeEach
	public void initialize()
	{
		myProblem = new Problem014();
	}
	
	@Test
	void collatzCountTest() throws Exception
	{
		//myProblem.setValue(3);
		assertEquals(10, Problem014.collatzCount(13));
	}

}	