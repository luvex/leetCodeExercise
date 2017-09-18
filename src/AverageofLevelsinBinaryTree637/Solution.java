package AverageofLevelsinBinaryTree637;

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

	public List<Double> averageOfLevels(TreeNode root)
	{
		List<Double> list = new ArrayList<Double>();
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		int num = queue.size();
		double sum = 0;
		int sumNum = 0;
		TreeNode temp;
		while ((temp = queue.poll()) != null)
		{
			sum += temp.val;
			sumNum++;
			if (temp.left != null)
				queue.add(temp.left);
			if (temp.right != null)
				queue.add(temp.right);
			num--;
			if (num == 0)
			{
				num = queue.size();
				list.add(sum / sumNum);
				sum = 0;
				sumNum = 0;
			}
		}
		return list;
	}

}
