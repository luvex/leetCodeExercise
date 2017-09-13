package RotateArray189;

public class Solution
{

	public Solution()
	{
		// TODO Auto-generated constructor stub
	}

	public void rotate(int[] nums, int k)
	{
		k %= nums.length;
		if (k == 0)
			return;
		else
		{
			int[] nums_new = new int[nums.length];
			int index = nums.length - k;
			int i = 0;
			while (true)
			{
				nums_new[i++] = nums[index++];
				if (index == nums.length)
					index = 0;
				if (index == nums.length - k)
					break;
			}
			for (int a = 0; a < nums.length; a++)
				nums[a] = nums_new[a];
		}
	}

	public void rotate_1(int[] nums, int k)
	{
		k %= nums.length;

		int count = 0;
		int i = 0;
		while (true)
		{
			int index = i;
			int swap = nums[index];
			int swap_2 = 0;
			while (true)
			{
				swap_2 = nums[(index + k) % nums.length];
				nums[(index + k) % nums.length] = swap;
				count++;
				swap = swap_2;
				index = (index + k) % nums.length;
				if (index == i)
					break;
			}
			if (count == nums.length)
				break;
			else
				i++;
		}

	}

	public void rotate_2(int[] nums, int k)
	{
		k %= nums.length;
		if (k == 0 || nums.length == 1)
			return;

		reverse(nums, 0, nums.length - k - 1);
		reverse(nums, nums.length - k, nums.length - 1);
		reverse(nums, 0, nums.length - 1);
	}

	public void reverse(int[] nums, int i, int j)
	{
		int temp = 0;
		for (int a = i; a < Math.ceil((double) (i + j) / 2); a++)
		{
			temp = nums[a];
			nums[a] = nums[j - a + i];
			nums[j - a + i] = temp;

		}
	}

	public static void main(String[] args)
	{
		int[] x = new int[] { 1,2, 3, 4,5,6,7 };
		Solution s = new Solution();
		s.rotate_2(x, 2);
		for (int i = 0; i < x.length; i++)
			System.out.print(x[i]);
	}

}
