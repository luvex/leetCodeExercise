package RepeatedStringMatch686;

public class Solution
{

	public Solution()
	{
		// TODO Auto-generated constructor stub
	}

	public int repeatedStringMatch(String A, String B)
	{
		int min = B.length() / A.length();
		int max = B.length() * 2 / A.length() + 1;

		int mid = (min + max) / 2;

		while (mid > min && mid < max)
		{
			if (search(A, B, mid))
			{
				max = mid;
				mid = (min + max) / 2;
			}
			else
			{
				min = mid;
				mid = (min + max) / 2;
			}
		}

		if (search(A, B, min))
			return min;
		else if (search(A, B, max))
			return max;
		else

			return -1;
	}

	public boolean search(String s1, String s2, int times)
	{
		String x = "";
		for (int i = 0; i < times; i++)
			x += s1;
		if (x.contains(s2))
			return true;
		else
			return false;
	}

	public static void main(String[] args)
	{
		String a = "abcabcabcabc";
		String b = "abac";
		System.out.println(new Solution().repeatedStringMatch(a, b));
	}
}
