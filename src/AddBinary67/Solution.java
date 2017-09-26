package AddBinary67;

public class Solution
{

	public Solution()
	{
		// TODO Auto-generated constructor stub
	}

	public String addBinary(String a, String b)
	{
		a = new StringBuffer(a).reverse().toString();
		b = new StringBuffer(b).reverse().toString();
		int index = 0;
		String c = "";
		boolean next = false;
		while (index < a.length() && index < b.length())
		{
			if (a.charAt(index) == '1' && b.charAt(index) == '1')
			{
				if (next)
				{
					c += "1";
					next = false;
				}
				else
					c += "0";
				next = true;
			}
			else if (a.charAt(index) == '0' && b.charAt(index) == '0')
			{
				if (next)
				{
					c += "1";
					next = false;
				}
				else
					c += "0";
			}
			else
			{
				if (next)
				{
					c += "0";
				}
				else
					c += "1";
			}
			index++;
		}
		if (a.length() > b.length())
		{
			while (index < a.length())
			{
				if (a.charAt(index) == '0')
				{
					if (next)
					{
						c += "1";
						next = false;
					}
					else
					{
						c += "0";
					}
				}
				else
				{
					if (next)
					{
						c += "0";
					}
					else
						c += "1";
				}
				index++;
			}
		}
		else if (a.length() == b.length())
		{
			if (next)
			{
				c += "1";
				next = false;
			}
		}
		else
		{
			while (index < b.length())
			{
				if (b.charAt(index) == '0')
				{
					if (next)
					{
						c += "1";
						next = false;
					}
					else
					{
						c += "0";
					}
				}
				else
				{
					if (next)
					{
						c += "0";
					}
					else
						c += "1";
				}
				index++;
			}
		}
		if (next)
			c += "1";
		c = new StringBuffer(c).reverse().toString();
		return c;
	}

	public static void main(String[] args)
	{
		System.out.println(new Solution().addBinary("1", "1"));
	}
}
