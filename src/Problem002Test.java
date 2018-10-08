import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Problem002Test {
	Problem myProblem;
	
	@BeforeEach
	public void initialize()
	{
		myProblem = new Problem002();
	}
	
	@Test
	void Problem1Test() throws IOException 
	{
		myProblem.setValue(100);
		assertEquals(44, myProblem.result());
	}

}
