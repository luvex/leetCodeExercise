package PathSum112;

public class Solution
{

	public Solution()
	{
		// TODO Auto-generated constructor stub
	}

	public boolean hasPathSum(TreeNode root, int sum)
	{
		boolean status = false;
		if (root != null)
		{
			if (root.left == null && root.right == null)
			{
				if (sum - root.val == 0)
					return true;
				else
					return false;
			}
			if (root.left != null)
			{
				status |= hasPathSum(root.left, sum - root.val);
			}
			if (root.right != null)
				status |= hasPathSum(root.right, sum - root.val);
		}
		return status;
	}
}
