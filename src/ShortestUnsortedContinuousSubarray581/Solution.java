package ShortestUnsortedContinuousSubarray581;

import java.util.Arrays;

public class Solution
{

	public Solution()
	{
		// TODO Auto-generated constructor stub
	}

	public int findUnsortedSubarray(int[] nums)
	{
		if (nums.length <= 1)
			return 0;
		int[] origin = nums.clone();

		Arrays.sort(nums);
		int i = 0;
		for (; i < nums.length; i++)
		{
			if (nums[i] != origin[i])
				break;
		}
		int j = nums.length - 1;
		for (; j >= i; j--)
		{
			if (nums[j] != origin[j])
				break;
		}
		if (j <= i)
			return 0;
		else
			return j - i + 1;
	}

	public void quickSort(int[] nums, int start, int end)
	{
		if (start >= end)
			return;
		int mid = partition(nums, start, end);
		quickSort(nums, start, mid - 1);
		quickSort(nums, mid + 1, end);
	}

	public int partition(int[] nums, int i, int j)
	{
		int key = nums[i];
		int temp = 0;
		for (; j > i; j--)
		{
			if (nums[j] < key)
			{
				temp = nums[j];
				nums[j] = nums[i];
				nums[i] = temp;
			}
			else
				continue;
			for (; i < j; i++)
			{
				if (nums[i] > key)
				{
					temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
					break;
				}
				else
					continue;
			}
		}
		return i;
	}

	public static void main(String[] args)
	{
		int[] nums = new int[] { 1, 2, 3, 4 };
		System.out.print(new Solution().findUnsortedSubarray(nums));
	}
}
