package ContainsDuplicateII219;

import java.util.HashMap;
import java.util.Map;

public class Solution
{

	public Solution()
	{
		// TODO Auto-generated constructor stub
	}

	// time limit exceeded
	public boolean containsNearbyDuplicate(int[] nums, int k)
	{
		for (int i = 0; i < nums.length; i++)
		{
			for (int j = i + 1; j < i + k + 1; j++)
			{
				if (j >= nums.length)
					break;
				if (nums[i] == nums[j])
					return true;
			}
		}
		return false;
	}

	public boolean containsNearbyDuplicate_1(int[] nums, int k)
	{
		for (int i = 0; i < nums.length; i++)
		{
			for (int j = i + 1; j < nums.length; j++)
			{
				if (nums[i] == nums[j] && j - i <= k)
					return true;
			}
		}
		return false;
	}

	public boolean containsNearbyDuplicate_2(int[] nums, int k)
	{
		Map<Integer, Integer[]> map = new HashMap<Integer, Integer[]>();
		for (int i = 0; i < nums.length; i++)
		{
			if (map.containsKey(nums[i]))
			{
				if (i >= map.get(nums[i])[0] && i <= map.get(nums[i])[1])
					return true;
				else
				{
					int small = i - k > 0 ? i - k : 0;
					int big = i + k < nums.length ? i + k : nums.length;
					map.get(nums[i])[0] = small < map.get(nums[i])[0] ? small : map.get(nums[i])[0];
					map.get(nums[i])[1] = big > map.get(nums[i])[1] ? big : map.get(nums[i])[1];
				}
			}
			else
			{
				int small = i - k > 0 ? i - k : 0;
				int big = i + k < nums.length ? i + k : nums.length;
				map.put(nums[i], new Integer[] { small, big });
			}
		}
		return false;
	}
}
