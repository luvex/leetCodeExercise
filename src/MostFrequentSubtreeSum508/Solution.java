package MostFrequentSubtreeSum508;

import java.util.HashMap;
import java.util.Map;

public class Solution
{

	Map<Integer, Integer> map = new HashMap<Integer, Integer>();

	public Solution()
	{
		// TODO Auto-generated constructor stub
	}

	public int[] findFrequentTreeSum(TreeNode root)
	{
		if (root == null)
			return new int[] {};
		root.val = updateValue(root);
		int y = 1;
		int num = 0;
		for (Integer value : map.values())
		{
			if (value > y)
			{
				y = value;
				num = 1;
			}
			else if (value == y)
				num++;
		}

		int[] all = new int[num];
		int index = 0;
		if (y == 1)
		{
			for (Integer key : map.keySet())
			{
				all[index++] = key;
			}
		}
		else
		{
			for (Integer key : map.keySet())
			{
				if (map.get(key) == y)
				{
					all[index++] = key;
				}
			}

		}
		return all;
	}

	public int updateValue(TreeNode root)
	{
		int left = 0, right = 0;
		if (root.left != null)
			left = updateValue(root.left);
		if (root.right != null)
			right = updateValue(root.right);
		root.val = root.val + left + right;
		if (map.containsKey(root.val))
			map.put(root.val, map.get(root.val) + 1);
		else
			map.put(root.val, 1);
		return root.val;
	}
}
