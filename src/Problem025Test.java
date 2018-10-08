import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Problem025Test {

	Problem myProblem;
	
	@BeforeEach
	public void initialize()
	{
		myProblem = new Problem025();
	}
	
	@Test
	void Test1() throws Exception
	{
		myProblem.setValue(3);
		assertEquals(12, myProblem.result());
	}

	@Test
	void problem25SumTest()
	{

		A = new ArrayList <Integer>();
		B = new ArrayList <Integer>();
		C = new ArrayList <Integer>();
		
		A.add(1);
		A.add(9);
		B.add(3);
		B.add(2);
		C.add(4);
		C.add(1);
		C.add(1);
		assertEquals(C, Problem025.addNumbers(A,B));

	}
	
	ArrayList <Integer> A;
	ArrayList <Integer> B;
	ArrayList <Integer> C;
	
}	