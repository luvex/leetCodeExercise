package CanPlaceFlowers605;

public class Solution
{

	public Solution()
	{
		// TODO Auto-generated constructor stub
	}

	public boolean canPlaceFlowers(int[] flowerbed, int n)
	{
		int index = 0;
		while (n != 0)
		{
			if (index >= flowerbed.length)
				return false;
			if (flowerbed[index] == 1)
				index += 2;
			else if (flowerbed[index] == 0)
			{
				if (index - 1 >= 0 && flowerbed[index - 1] == 1)
					index++;
				else if (index + 1 < flowerbed.length && flowerbed[index + 1] == 1)
					index += 2;
				else
				{
					n--;
					flowerbed[index] = 1;
					index += 2;
				}
			}
		}
		return true;
	}

	public static void main(String[] args)
	{

	}
}
