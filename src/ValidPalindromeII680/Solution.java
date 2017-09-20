package ValidPalindromeII680;

public class Solution
{

	public int errors = 1;

	public Solution()
	{
		// TODO Auto-generated constructor stub
	}

	public boolean validPalindrome(String s)
	{
		int i = 0, j = s.length() - 1;
		while (i < j)
		{
			if (s.charAt(i) == s.charAt(j))
			{
				i++;
				j--;
				continue;
			}
			else
			{
				if (errors <= 0)
					return false;
				errors--;
				return validPalindrome(s.substring(i + 1, j + 1)) || validPalindrome(s.substring(i, j));
			}
		}
		return true;
	}

	public static void main(String[] args)
	{
		System.out.println(new Solution().validPalindrome("abcdea"));
	}
}
