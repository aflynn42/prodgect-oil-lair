import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Problem018Test {

	Problem myProblem;
	
	@BeforeEach
	public void initialize()
	{
		myProblem = new Problem018();
	}
	

	@Test
	void Test1() throws Exception
	{
		myProblem.setValue("problem18A.txt");
		assertEquals(23, myProblem.result());
	}

}	