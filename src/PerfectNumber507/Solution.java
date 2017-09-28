package PerfectNumber507;

public class Solution
{

	public Solution()
	{
		// TODO Auto-generated constructor stub
	}

	public boolean checkPerfectNumber(int num)
	{
		if (num <= 1)
			return false;
		int temp = num - 1;
		for (int i = 2; i < Math.sqrt(num); i++)
		{
			if (num % i == 0)
			{
				temp -= i;
				temp -= num / i;
			}
		}
		if (temp == 0)
			return true;
		else
			return false;
	}
}
