package ValidNumber65;

import java.util.regex.Pattern;

public class Solution
{

	public Solution()
	{
		// TODO Auto-generated constructor stub
	}

	public boolean isNumber(String s)
	{
		String pattern = "[-+]?(([0-9]+(.[0-9]*)?)|.[0-9]+)(e[-+]?[0-9]+)?";
		if (Pattern.compile(pattern).matcher(s.trim()).find())
			return true;
		return false;
	}

	public static void main(String[] args)
	{
		System.out.print(new Solution().isNumber("20..8"));
	}
}
