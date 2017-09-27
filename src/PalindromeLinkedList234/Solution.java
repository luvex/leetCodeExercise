package PalindromeLinkedList234;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Solution
{

	public Solution()
	{
		// TODO Auto-generated constructor stub
	}

	public boolean isPalindrome(ListNode head)
	{
		if (head == null)
			return true;
		ListNode temp = head;
		Stack<ListNode> stack = new Stack<ListNode>();
		stack.add(temp);
		while (temp.next != null)
		{
			stack.add(temp.next);
			temp = temp.next;
		}
		while (!stack.isEmpty())
		{
			if (stack.pop().val != head.val)
				return false;
			else
				head = head.next;
		}
		return true;
	}

	public boolean isPalindrome_1(ListNode head)
	{
		int count = 0;
		ListNode temp = head;
		while (temp != null)
		{
			count++;
			temp = temp.next;
		}

		int[] ss = new int[count / 2];
		int index = 0;
		while (index < count)
		{
			if (index < count / 2)
			{
				ss[index] = head.val;
			}
			else if (index == count / 2 && count % 2 == 1)
			{
			}
			else if (index >= count / 2)
			{
				if (head.val != ss[count - index - 1])
					return false;
			}
			index++;
			head = head.next;
		}
		return true;
	}

	//from leetcode discussion
	public boolean isPalindrome_2(ListNode head)
	{
		ListNode fast = head, slow = head;
	    while (fast != null && fast.next != null) {
	        fast = fast.next.next;
	        slow = slow.next;
	    }
	    if (fast != null) { // odd nodes: let right half smaller
	        slow = slow.next;
	    }
	    slow = reverse(slow);
	    fast = head;
	    
	    while (slow != null) {
	        if (fast.val != slow.val) {
	            return false;
	        }
	        fast = fast.next;
	        slow = slow.next;
	    }
	    return true;
	}
	
	public ListNode reverse(ListNode head) {
	    ListNode prev = null;
	    while (head != null) {
	        ListNode next = head.next;
	        head.next = prev;
	        prev = head;
	        head = next;
	    }
	    return prev;
	}

	public static void main(String[] args)
	{
		ListNode l1 = new ListNode(-1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(2);
		ListNode l5 = new ListNode(-1);
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		System.out.println(new Solution().isPalindrome_2(l1));

	}
}
