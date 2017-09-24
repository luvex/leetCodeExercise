package LongestCommonPrefix14;

public class Solution
{

	public Solution()
	{
		// TODO Auto-generated constructor stub
	}

	public String longestCommonPrefix(String[] strs)
	{
		if (strs.length == 0)
			return "";
		else if (strs.length == 1)
			return strs[0];
		String prefix = strs[0];
		int index = 0;
		boolean next = true;
		while (true)
		{
			boolean add = true;
			for (int i = 1; i < strs.length; i++)
			{
				if (index >= strs[i].length() || index >= prefix.length())
				{
					next = false;
					break;
				}
				else
				{
					if (strs[i].charAt(index) != prefix.charAt(index))
					{
						add = false;
						break;
					}
				}
			}
			if (!add)
				break;
			if (!next)
				break;
			index++;
		}
		return prefix.substring(0, index);
	}

	public static void main(String[] args)
	{
		Solution s = new Solution();
		System.out.println(s.longestCommonPrefix(new String[] { "", "a"}));
	}
}
