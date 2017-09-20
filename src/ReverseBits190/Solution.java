package ReverseBits190;

public class Solution
{

	public Solution()
	{
		// TODO Auto-generated constructor stub
	}

	public int reverseBits(int n)
	{
		String s = Integer.toBinaryString(n);
		int zeros = 32 - s.length();
		while (zeros-- != 0)
			s = "0" + s;
		return Integer.parseUnsignedInt(new StringBuilder(s).reverse().toString(), 2);
	}

	public int reverseBits_1(int n)
	{
		int result = 0;
	    for (int i = 0; i < 32; i++) {
	        result += n & 1;
	        n >>>= 1;   // CATCH: must do unsigned shift
	        if (i < 31) // CATCH: for last digit, don't shift!
	            result <<= 1;
	    }
	    return result;
	}

	public static void main(String[] args)
	{
		// int a = (int) Math.pow(2, 30);
		// int b = (int) Math.pow(2, 31);
		// System.out.println(a);
		// System.out.println(b);
		System.out.println(new Solution().reverseBits_1((int) 4294967295L));
	}
}
