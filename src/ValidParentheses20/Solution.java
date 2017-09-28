package ValidParentheses20;

import java.util.Stack;

public class Solution
{

	public Solution()
	{
		// TODO Auto-generated constructor stub
	}

	public boolean isValid(String s)
	{
		if (s.length() % 2 == 1)
			return false;
		else
		{
			Stack<Character> stack = new Stack<Character>();
			for (int i = 0; i < s.length(); i++)
			{
				if (!stack.isEmpty())
				{
					if (validate(stack.peek(), s.charAt(i)))
					{
						stack.pop();
						continue;
					}
				}
				stack.add(s.charAt(i));
			}
			if (stack.isEmpty())
				return true;
			else
				return false;
		}
	}

	public boolean validate(char c1, char c2)
	{
		if (c1 == '(')
		{
			if (c2 == ')')
				return true;
			else
				return false;
		}
		else if (c1 == '[')
		{
			if (c2 == ']')
				return true;
			else
				return false;
		}
		else if (c1 == '{')
		{
			if (c2 == '}')
				return true;
			else
				return false;
		}
		else
			return false;
	}

	public static void main(String[] args)
	{
		System.out.println(new Solution().isValid("()"));
	}
}
