package MaximumBinaryTree654;

public class Solution
{

	public Solution()
	{
		// TODO Auto-generated constructor stub
	}

	public TreeNode constructMaximumBinaryTree(int[] nums)
	{
		return buildTree(nums, 0, nums.length - 1);

	}

	public TreeNode buildTree(int[] nums, int begin, int end)
	{
		int index = begin;
		int val = nums[begin];
		for (int i = begin + 1; i <= end; i++)
		{
			if (nums[i] > val)
			{
				val = nums[i];
				index = i;
			}
		}
		TreeNode node = new TreeNode(val);
		if (index - 1 >= begin)
			node.left = buildTree(nums, begin, index - 1);
		if (index + 1 <= end)
			node.right = buildTree(nums, index + 1, end);
		return node;
	}

	public static void main(String[] args)
	{
		int[] nums = new int[] { 3, 2, 1, 6, 0, 5 };
		Solution s = new Solution();
		s.constructMaximumBinaryTree(nums);
	}
}
