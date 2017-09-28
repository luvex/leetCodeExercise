package MinimumDepthofBinaryTree111;

import java.util.LinkedList;
import java.util.Queue;

public class Solution
{

	public Solution()
	{
		// TODO Auto-generated constructor stub
	}

	public int minDepth(TreeNode root)
	{
		if (root == null)
			return 0;
		int depth = 1;
		int nodesNum = 1;
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		TreeNode temp;
		while ((temp = queue.poll()) != null)
		{
			nodesNum--;
			if (temp.left == null && temp.right == null)
				break;
			if (temp.left != null)
				queue.add(temp.left);
			if (temp.right != null)
				queue.add(temp.right);
			if (nodesNum == 0)
			{
				depth++;
				nodesNum = queue.size();
			}
		}
		return depth;
	}
}
