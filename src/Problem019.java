import java.io.IOException;

public class Problem019 implements Problem {

	@SuppressWarnings("unused")
	private Object value;
	public Problem019()
	{
	}

	@Override
	public Object result() throws IOException 
	{
		int count = 0;
		int day = 1;
		int month = 1;
		int year = 1901;
		int dayOfWeek = 2;

		while (year < 2001)
		{
			System.out.format("%d, %d, %d, %d",day,month,year,dayOfWeek);
			if (!isEOM(day,month, year))
			{
				day++;
				dayOfWeek++;
				dayOfWeek = dayOfWeek % 7;
			}
			else if (month == 12)
			{
				year++;
				month = 1;
				day = 1;
				dayOfWeek++;
				dayOfWeek = dayOfWeek % 7;
				if(dayOfWeek == 0)
					count++;
			}
			else
			{
				month++;
				day = 1;
				dayOfWeek++;
				dayOfWeek = dayOfWeek % 7;
				if(dayOfWeek == 0)
					count++;
			}
		}
		return count;
	}


	@Override
	public void setValue(Object input) 
	{
		value = input;

	}

	public static boolean isEOM(int day, int month, int year) 
	{
		if (day < 28)
		{
			return false;
		}
		else if (month == 2)
		{
			if (day == 29)
				return true;
			else
				return !isLeapYear(year);
		}
		else if (month == 4 || month == 6 || month == 9 || month == 11)
		{
			return day == 30;
		}
		else 
			return day == 31;
	}

	public static boolean isLeapYear(int year) 
	{
		if (year % 100 == 0)
			return (year % 400 == 0);
		else
			return (year % 4 == 0);
	}
}
