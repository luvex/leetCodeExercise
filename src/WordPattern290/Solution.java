package WordPattern290;

import java.util.HashMap;
import java.util.Map;

public class Solution
{

	public Solution()
	{
		// TODO Auto-generated constructor stub
	}

	public boolean wordPattern(String pattern, String str)
	{
		String[] ss = str.trim().split(" ");

		if (ss.length != pattern.length())
			return false;
		else
		{
			Map<Character, String> map = new HashMap<Character, String>();
			for (int i = 0; i < ss.length; i++)
			{
				if (map.containsKey(pattern.charAt(i)))
				{
					if (!map.get(pattern.charAt(i)).equals(ss[i]))
						return false;
				}
				else
				{
					if (map.containsValue(ss[i]))
						return false;
					map.put(pattern.charAt(i), ss[i]);
				}
			}
		}
		return true;
	}

	public static void main(String[] args)
	{
		System.out.println(new Solution().wordPattern("abba", "dog dog dog dog"));
	}
}
