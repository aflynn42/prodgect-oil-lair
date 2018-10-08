import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Problem234Test {


	Problem234 myProblem;

	@BeforeEach
	public void initialize()
	{
		myProblem = new Problem234();
	}

	@Test
	void p243Test() throws Exception
	{
		myProblem.setValue(4,10);
		assertEquals(12, myProblem.result());
	}

}
