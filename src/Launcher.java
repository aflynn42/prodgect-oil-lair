public class Launcher 
{

	static UtilityFunctions myFunctions;
	static Problem problem;
	
	public static void main(String[] args) throws Exception 
	{
		problem = new Problem036();
		problem.setValue(1000000);
		System.out.println(problem.result());
	}

}
