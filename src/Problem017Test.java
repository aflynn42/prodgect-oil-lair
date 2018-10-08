import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Problem017Test {

	Problem myProblem;
	
	@BeforeEach
	public void initialize()
	{
		myProblem = new Problem017();
	}
	
	@Test
	void problem17Test() throws Exception
	{
		assertEquals(23, Problem017.getLetterCount(342));
	}

	@Test
	void problem17Test2() throws Exception
	{
		assertEquals(20, Problem017.getLetterCount(115));
	}
	
	@Test
	void problem17Test3() throws Exception
	{
		myProblem.setValue(1000);
		assertEquals(21124, myProblem.result());
	}
		
	@Test
	void countCharTest()
	{
		assertEquals(23, Problem017.countChar("three hundred and forty-two"));
	}

	@Test
	void countCharTest2()
	{
		assertEquals(20, Problem017.countChar("one hundred and fifteen"));
	}

}	