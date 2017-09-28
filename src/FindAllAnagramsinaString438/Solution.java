package FindAllAnagramsinaString438;

import java.util.ArrayList;
import java.util.List;

public class Solution
{

	public Solution()
	{
		// TODO Auto-generated constructor stub
	}

	public List<Integer> findAnagrams(String s, String p)
	{
		List<Integer> list = new ArrayList<Integer>();
		if (s.length() < p.length())
			return list;
		else
		{
			for (int i = 0; i < s.length() - p.length() + 1; i++)
			{
				if (compare(s.substring(i, i + p.length()), p))
				{
					list.add(i);
					while (i++ < s.length() - p.length())
					{
						if (s.charAt(i - 1) == s.charAt(i + p.length() - 1))
							list.add(i);
						else
						{
							if (!p.contains("" + s.charAt(i + p.length() - 1)))
								i = i + p.length() - 1;
							break;
						}
					}
				}
			}
		}
		return list;
	}

	public boolean compare(String a, String b)
	{
		for (int i = 0; i < b.length(); i++)
		{
			a = a.replaceAll("" + b.charAt(i), "");
			b = b.replaceAll("" + b.charAt(i), "");
			if (a.length() != b.length())
				return false;
		}
		if (a.equals(b))
			return true;
		else
			return false;
	}

	public static void main(String[] args)
	{
		// System.out.println(new
		// Solution().findAnagrams("kzexfqiudtwvpjnhgocasbmlryk",
		// "ykzexfqiudtwvpjnhgocasbmlr"));
		System.out.println(new Solution().findAnagrams("cbaebabacd", "abc"));
	}
}
