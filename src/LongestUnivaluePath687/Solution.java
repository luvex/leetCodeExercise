package LongestUnivaluePath687;

public class Solution
{

	public Solution()
	{
		// TODO Auto-generated constructor stub
	}

	public int longestUnivaluePath(TreeNode root)
	{
		int len = 0;
		if (root == null)
			return 0;
		else
		{
			if (root.left != null)
			{
				if (root.val == root.left.val)
				{
					len++;
					len += longestUnivaluePath(root.left);
				}
			}
			if (root.right != null)
			{
				if (root.val == root.right.val)
				{
					len++;
					len += longestUnivaluePath(root.left);
				}
			}
		}
		return len;

	}
}
