package NthDigit400;

public class Solution
{

	public Solution()
	{
		// TODO Auto-generated constructor stub
	}

	public int findNthDigit(int n)
	{
		int index = 1;
		while (true)
		{
			if (n > index * 9 * Math.pow(10, index - 1))
				n -= index * 9 * Math.pow(10, index - 1);
			else
			{
				int num = (int) (Math.pow(10, index - 1) + Math.ceil((double) n / index)) - 1;
				int digit = n % index == 0 ? index : n % index;
				return (num / (int) Math.pow(10, index - digit) % 10);
			}
			index++;
		}
	}

	public static void main(String[] args)
	{
		System.out.println(new Solution().findNthDigit(1002));
	}
}
