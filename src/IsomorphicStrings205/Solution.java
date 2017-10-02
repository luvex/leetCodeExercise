package IsomorphicStrings205;

import java.util.HashMap;
import java.util.Map;

public class Solution
{

	public Solution()
	{
		// TODO Auto-generated constructor stub
	}

	public boolean isIsomorphic(String s, String t)
	{

		Map<Character, Character> map = new HashMap<Character, Character>();
		for (int i = 0; i < s.length(); i++)
		{
			if (map.containsKey(s.charAt(i)))
			{
				if (map.get(s.charAt(i)) != t.charAt(i))
					return false;
			}
			else
			{
				if (map.containsValue(t.charAt(i)))
					return false;
				map.put(s.charAt(i), t.charAt(i));
			}
		}
		return true;

	}

	public boolean isIsomorphic_1(String s1, String s2)
	{
		int[] m = new int[512];
		for (int i = 0; i < s1.length(); i++)
		{
			if (m[s1.charAt(i)] != m[s2.charAt(i) + 256])
				return false;
			m[s1.charAt(i)] = m[s2.charAt(i) + 256] = i + 1;
		}
		return true;
	}

	public static void main(String[] args)
	{
		System.out.println(new Solution().isIsomorphic_1("ab", "aa"));
	}
}
