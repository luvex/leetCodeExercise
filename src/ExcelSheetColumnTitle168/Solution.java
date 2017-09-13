package ExcelSheetColumnTitle168;

public class Solution
{

	public Solution()
	{
		// TODO Auto-generated constructor stub
	}

	public String convertToTitle(int n)
	{
		String result = "";
		while (n!=0)
		{
			int a = n % 26;
			if (a == 0)
			{
				a = 26;
				n = n / 26 - 1;
			}
			else
				n = n / 26;

			result = (char) (a + 64) + result;

		}
		return result;
	}

	public static void main(String[] args)
	{
		System.out.print(new Solution().convertToTitle(666667));
	}
}
