import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Problem081Test {

	Problem myProblem;
	
	@BeforeEach
	public void initialize()
	{
		myProblem = new Problem081();
	}
	
	@Test
	void p081Test() throws IOException 
	{
		myProblem.setValue("p081_matrix_test.txt");
		assertEquals(2427, myProblem.result());
	}

}
