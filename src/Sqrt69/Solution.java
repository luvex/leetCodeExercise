package Sqrt69;

public class Solution
{

	public Solution()
	{
		// TODO Auto-generated constructor stub
	}

	public int mySqrt(int x)
	{
		if (x == 0)
			return 0;
		if (x == 1)
			return 1;
		int a = 0;
		int b = x;
		int i = 0;
		while (true)
		{
			i = (a + b) / 2;
			if (x / i < i)
			{
				b = i;
				if (b - a <= 1)
					return a;
			}
			else
			{
				a = i;
				if (b - a <= 1)
					return a;
			}
		}
	}

	public int mySqrt_1(int x)
	{
		return (int) Math.sqrt(x);
	}

	public static void main(String[] args)
	{
		System.out.println(new Solution().mySqrt(9));
	}
}
