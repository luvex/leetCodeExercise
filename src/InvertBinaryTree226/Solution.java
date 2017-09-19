package InvertBinaryTree226;

public class Solution
{

	public Solution()
	{
		// TODO Auto-generated constructor stub
	}

	public TreeNode invertTree(TreeNode root)
	{
		if(root == null)
			return null;
		else
		{
			TreeNode temp;
			temp = root.left;
			root.left = root.right;
			root.right = temp;
			invertTree(root.left);
			invertTree(root.right);
			return root;
		}
	}
}
