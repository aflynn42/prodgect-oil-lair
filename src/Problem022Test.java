import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Problem022Test {

	Problem myProblem;
	
	@BeforeEach
	public void initialize()
	{
		myProblem = new Problem022();
	}
	
//	@Test
//	void Test1() throws Exception
//	{
//		myProblem.setValue(10000);
//		assertEquals(31626, myProblem.result());
//	}
	@Test
	void nameValueTest()
	{
		assertEquals(54, Problem022.nameValue("COALIN"));
	}
}	