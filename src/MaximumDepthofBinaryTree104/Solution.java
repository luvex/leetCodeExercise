package MaximumDepthofBinaryTree104;

import java.util.LinkedList;
import java.util.Queue;

public class Solution
{

	public Solution()
	{
		// TODO Auto-generated constructor stub
	}

	public int maxDepth(TreeNode root)
	{
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		int num = queue.size();
		int result = 0;
		TreeNode temp;
		while ((temp = queue.poll()) != null)
		{
			num--;
			if (temp.left != null)
				queue.add(temp.left);
			if (temp.right != null)
				queue.add(temp.right);
			if (num == 0)
			{
				result++;
				num = queue.size();
			}
		}
		return result;
	}
}
