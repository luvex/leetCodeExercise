package IntersectionOfTwoLinkedLists160;

import java.util.Stack;

public class Solution
{

	public Solution()
	{
		// TODO Auto-generated constructor stub
	}

	public ListNode getIntersectionNode(ListNode headA, ListNode headB)
	{
		if (headA == null || headB == null)
			return null;
		ListNode temp1 = headA;
		ListNode temp2 = headB;
		ListNode result = null;

		Stack<ListNode> s1 = new Stack<ListNode>();
		Stack<ListNode> s2 = new Stack<ListNode>();

		do
		{
			s1.add(temp1);
		}
		while ((temp1 = temp1.next) != null);

		do
		{
			s2.add(temp2);
		}
		while ((temp2 = temp2.next) != null);

		while (!s1.isEmpty() && !s2.isEmpty())
		{
			if ((result = s1.pop()) == s2.pop())
				continue;
			else
			{
				return result.next;
			}
		}

		return result;
	}

	public static void main(String[] args)
	{
		Solution s = new Solution();
		ListNode ln = new ListNode(2);
		s.getIntersectionNode(ln, ln);
	}

}
