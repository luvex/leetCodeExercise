package FindBottomLeftTreeValue513;

import java.util.LinkedList;
import java.util.Queue;

public class Solution
{

	public Solution()
	{
		// TODO Auto-generated constructor stub
	}

	public int findBottomLeftValue(TreeNode root)
	{
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		TreeNode temp;
		while ((temp = queue.poll()) != null)
		{
			if (temp.right != null)
				queue.add(temp.right);
			if (temp.left != null)
				queue.add(temp.left);
			if (queue.peek() == null)
				break;
		}
		return temp.val;
	}

	public static void main(String[] args)
	{
		TreeNode tn = new TreeNode(2);
		TreeNode ta = new TreeNode(1);
		TreeNode tb = new TreeNode(3);
		tn.left = ta;
		tn.right = tb;
		System.out.println(new Solution().findBottomLeftValue(tn));
	}

}
