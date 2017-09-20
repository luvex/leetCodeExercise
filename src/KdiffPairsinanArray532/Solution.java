package KdiffPairsinanArray532;

import java.util.HashMap;
import java.util.Map;

public class Solution
{

	public Solution()
	{
		// TODO Auto-generated constructor stub
	}

	public int findPairs_1(int[] nums, int k)
	{
		if (k < 0)
			return 0;
		int count = 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++)
		{
			map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
		}
		for (int i : map.keySet())
		{
			if (k == 0)
			{
				if (map.get(i) >= 2)
					count++;
			}
			else
			{
				if (map.containsKey(i + k))
					count++;
			}
		}
		return count;
	}

	public int findPairs(int[] nums, int k)
	{
		int count = 0;
		quickSort(nums, 0, nums.length - 1);
		for (int i = 0; i < nums.length; i++)
		{
			for (int j = i + 1; j < nums.length; j++)
			{
				if (nums[j] - nums[i] == k)
					count++;
				while (j < nums.length - 1 && nums[j + 1] == nums[j])
					j++;
			}
			while (i < nums.length - 1 && nums[i + 1] == nums[i])
				i++;
		}
		return count;
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
		int[] nums = new int[] { 1, 2, 3, 4, 5 };
		// new Solution().quickSort(nums, 0, nums.length - 1);
		for (int x : nums)
			System.out.println(x);
		System.out.println(new Solution().findPairs_1(nums, -1));
	}
}
