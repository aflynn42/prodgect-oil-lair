import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Problem027Test {

	Problem027 myProblem;
	
	@BeforeEach
	public void initialize()
	{
		myProblem = new Problem027();
	}
	
	@Test
	void Test1() throws Exception
	{
		myProblem.setValue(999,999);
		assertEquals(-59231, myProblem.result());
	}



	
}	