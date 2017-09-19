package FindLargestValueinEachTreeRow515;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution
{

	public Solution()
	{
		// TODO Auto-generated constructor stub
	}

	public List<Integer> largestValues(TreeNode root)
	{
		List<Integer> list = new ArrayList<Integer>();
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		TreeNode temp;
		int maxNum = Integer.MIN_VALUE;
		int num = queue.size();

		while ((temp = queue.poll()) != null)
		{
			maxNum = temp.val > maxNum ? temp.val : maxNum;
			num--;
			if (temp.left != null)
				queue.add(temp.left);
			if (temp.right != null)
				queue.add(temp.right);
			if (num == 0)
			{
				list.add(maxNum);
				num = queue.size();
				maxNum = Integer.MIN_VALUE;
			}
		}
		return list;
	}
}
