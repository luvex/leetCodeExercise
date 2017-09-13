package ValidPalindrome125;

public class Solution
{

	public Solution()
	{
		// TODO Auto-generated constructor stub
	}

	public boolean isPalindrome(String s)
	{
		if (s.isEmpty())
			return true;
		int i = 0;
		int j = s.length() - 1;

		char tempA, tempB = '-';
		while (i != s.length())
		{
			tempA = judgeChar(s.charAt(i++));
			if (tempA == '~')
				continue;
			while (j != -1)
			{
				tempB = judgeChar(s.charAt(j--));
				if (tempB == '~')
					continue;
				if (tempA != tempB)
					return false;
				else
				{
					tempA = '-';
					tempB = '-';
					break;
				}
			}

			if (tempA != '-' || tempB != '-')
				return false;
		}
		return true;
	}

	public char judgeChar(char c)
	{
		int num = (int) c;
		if (num >= 65 && num <= 90)
			return c;
		else if (num >= 48 && num <= 57)
			return c;
		else if (num >= 97 && num <= 122)
			return (char) (c - 32);
		else
			return '~';
	}

	public static void main(String[] args)
	{
		//System.out.println((int) '0');
		System.out.print(new Solution().isPalindrome("0P"));
		// System.out.print(new Solution().isPalindrome("A man, a plan, a canal:
		// Panama"));
		// System.out.print(new Solution().isPalindrome("race a car"));
		// System.out.print(new Solution().isPalindrome("race a car"));
	}
}
