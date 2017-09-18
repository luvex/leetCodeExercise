package TrimaBinarySearchTree669;

public class Solution
{

	public Solution()
	{
		// TODO Auto-generated constructor stub
	}

	public TreeNode trimBST(TreeNode root, int L, int R)
	{
		if (root != null)
		{
			if (root.val < L || root.val > R)
			{
				TreeNode rootA = trimBST(root.left, L, R);
				TreeNode rootB = trimBST(root.right,L,R);
				if (rootA != null)
					root = rootA;
				else if(rootB != null)
					root = rootB;
				else
					root =null;
			}
			else
			{
				root.left = trimBST(root.left, L, R);
				root.right = trimBST(root.right, L, R);
			}
			return root;
		}
		else
			return null;
	}

	public static void main(String[] args)
	{
		TreeNode tn1 = new TreeNode(1);
		TreeNode tn2 = new TreeNode(0);
		TreeNode tn3 = new TreeNode(2);
		tn1.left = tn2;
		tn1.right = tn3;
		Solution s = new Solution();
		s.trimBST(tn1, 1, 2);
	}

}
