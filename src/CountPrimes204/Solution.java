package CountPrimes204;

import java.util.ArrayList;
import java.util.List;

public class Solution
{

	public Solution()
	{
		// TODO Auto-generated constructor stub
	}

	public int countPrimes(int n)
	{
		int count = 0;
		boolean isPrime;
		for (int i = 2; i <= n - 1; i++)
		{
			if (i == 2 || i == 3)
			{
				count++;
				continue;
			}
			else if (i % 6 != 1 && i % 6 != 5)
				continue;
			else
			{
				int stop = (int) Math.sqrt(i);
				isPrime = true;
				for (int j = 5; j <= stop; j += 6)
				{
					if (i % j == 0 || i % (j + 2) == 0)
					{
						isPrime = false;
						break;
					}
				}
				if (isPrime)
				{
					count++;
				}
			}
		}
		return count;
	}

	public int countPrimes_1(int n)
	{
		boolean[] isPrime = new boolean[n];
		for (int i = 2; i < n; i++)
			isPrime[i] = true;

		for (int i = 2; i * i < n; i++)
		{
			if (!isPrime[i])
				continue;
			for (int j = i * i; j < n; j += i)
				isPrime[j] = false;
		}
		int count = 0;
		for (int i = 0; i < n; i++)
			if (isPrime[i])
				count++;
		return count;
	}

	public static void main(String[] args)
	{
		System.out.print(new Solution().countPrimes_1(999983));
	}
}
