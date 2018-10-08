import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Problem018 implements Problem {

	private Object value;
	public Problem018()
	{
	}

	@Override
	public Object result() throws IOException 
	{
		try (BufferedReader br = new BufferedReader (new FileReader((String) value)))
		{
			String line = "";
			ArrayList<Integer> leaves = new ArrayList<Integer>();
			ArrayList<Integer> parents = new ArrayList<Integer>();

			line = br.readLine();
			leaves = parseLine18(line);
			Integer value = new Integer(0);

			while ((line = br.readLine()) != null)
			{
				parents = parseLine18(line);

				for (int i = 0; i < parents.size(); i++)
				{
					value = Integer.valueOf(parents.get(i) +
							Math.max(leaves.get(i), 
									leaves.get(i+1)));
					parents.set(i, value);
				}

				leaves = parents;
			}
			return parents.get(0);
		}
	}

	public static ArrayList<Integer> parseLine18(String line) 
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		String substring = "";
		for (int i = 0; i < line.length(); i++)
		{
			if (Character.isDigit(line.charAt(i)))
				substring = substring + line.charAt(i);
			else
			{
				list.add(Integer.valueOf(substring));
				substring = "";
			}
		}
		list.add(Integer.valueOf(substring));

		return list;
	}
	


	@Override
	public void setValue(Object input) 
	{
		value = input;

	}

}
