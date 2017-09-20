package ImplementstrStr28;

public class Solution
{

	public Solution()
	{
		// TODO Auto-generated constructor stub
	}

	public int strStr(String haystack, String needle)
	{
		if (haystack.equals(needle))
			return 0;
		for (int i = 0; i < haystack.length() - needle.length() + 1; i++)
		{
			boolean judge = true;
			for (int j = 0; j < needle.length(); j++)
			{
				if (haystack.charAt(i + j) != needle.charAt(j))
				{
					judge = false;
					break;
				}
			}
			if (judge)
				return i;
		}
		return -1;
	}

	public static void main(String[] args)
	{
		System.out.println(new Solution().strStr("mississippi", "pi"));
	}
}
