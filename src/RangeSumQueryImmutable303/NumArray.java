package RangeSumQueryImmutable303;

public class NumArray
{
	int[] sumArray;

	public NumArray(int[] nums)
	{
		if (nums.length == 0)
			return;
		sumArray = new int[nums.length];
		sumArray[0] = nums[0];
		for (int i = 1; i < nums.length; i++)
		{
			sumArray[i] = sumArray[i - 1] + nums[i];
		}
	}

	public int sumRange(int i, int j)
	{
		if (i == 0)
			return sumArray[j];
		else
			return sumArray[j] - sumArray[i - 1];
	}
}
