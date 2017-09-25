package LengthofLastWord58;

public class Solution
{

	public Solution()
	{
		// TODO Auto-generated constructor stub
	}

	public int lengthOfLastWord(String s)
	{
		String[] ss = s.split(" ");
		if (ss.length == 0)
			return 0;
		else
			return ss[ss.length - 1].length();
	}

	public static void main(String[] args)
	{
		System.out.println(new Solution().lengthOfLastWord("Hello World"));
	}
}
