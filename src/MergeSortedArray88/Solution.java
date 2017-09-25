package MergeSortedArray88;

import java.util.Arrays;

/*
 * unsolved
 */
public class Solution
{

	public Solution()
	{
		// TODO Auto-generated constructor stub
	}

	public void merge(int[] nums1, int m, int[] nums2, int n)
	{
		for (int i = m; i < m + n; i++)
		{
			nums1[i] = nums2[i - m];
		}
		Arrays.sort(nums1);
	}

	public void merge_1(int[] nums1, int m, int[] nums2, int n)
	{
		int i = m - 1;
		int j = n - 1;
		int k = m + n - 1;
		while (i > -1 && j > -1)
			nums1[k--] = nums1[i] >= nums2[j] ? nums1[i--] : nums2[j--];
		while (j > -1)
			nums1[k--] = nums2[j--];
	}

	public static void main(String[] args)
	{
		Solution s = new Solution();
		s.merge_1(new int[] { 1, 3, 5, 0, 0 }, 3, new int[] { 2, 4 }, 2);
	}
}
