package ThirdMaximumNumber414;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Solution
{

	public Solution()
	{
		// TODO Auto-generated constructor stub
	}

	public int thirdMax(int[] nums)
	{
		if (nums.length == 1)
			return nums[0];
		else if (nums.length == 2)
			return nums[0] > nums[1] ? nums[0] : nums[1];
		else
		{
			int[] temp = new int[3];
			boolean containMin = false;
			for (int i = 0; i < 3; i++)
				temp[i] = Integer.MIN_VALUE;
			for (int i = 0; i < nums.length; i++)
			{
				if (nums[i] == Integer.MIN_VALUE)
					containMin = true;
				if (nums[i] > temp[0])
				{
					temp[2] = temp[1];
					temp[1] = temp[0];
					temp[0] = nums[i];
				}
				else if (nums[i] > temp[1] && nums[i] != temp[0])
				{
					temp[2] = temp[1];
					temp[1] = nums[i];
				}
				else if (nums[i] > temp[2] && nums[i] != temp[1] && nums[i] != temp[0])
					temp[2] = nums[i];

			}
			if (temp[2] != Integer.MIN_VALUE)
				return temp[2];
			else if (containMin && temp[1] != Integer.MIN_VALUE)
				return temp[2];
			else
				return temp[0];
		}
	}

	/*
	 * low efficiency
	 */
	public int thirdMax_1(int[] nums)
	{
		Set<Integer> mySet = new HashSet<Integer>();
		for (int i = 0; i < nums.length; i++)
		{
			mySet.add(nums[i]);
		}
		if (mySet.size() > 2)
		{
			mySet.remove(Collections.max(mySet));
			mySet.remove(Collections.max(mySet));
		}
		return Collections.max(mySet);
	}

	public static void main(String[] args)
	{
		int[] nums = new int[] { 1, 2, -2147483648 };
		System.out.print(new Solution().thirdMax_1(nums));
	}
}
