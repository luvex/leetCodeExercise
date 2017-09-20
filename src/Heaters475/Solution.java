package Heaters475;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution
{

	public Solution()
	{
		// TODO Auto-generated constructor stub
	}

	public int findRadius(int[] houses, int[] heaters)
	{
		Arrays.sort(heaters);
		Arrays.sort(houses);

		int radius = 0;
		int j = 0;
		for (int i = 0; i < houses.length; i++)
		{
			if (houses[i] < heaters[j])
			{
				while (houses[i] + radius < heaters[j])
					radius++;
			}
			else if (houses[i] == heaters[j])
				continue;
			else
			{
				if (houses[i] - heaters[j] <= radius)
					continue;
				while (j < heaters.length - 1
						&& Math.abs(houses[i] - heaters[j]) >= Math.abs(houses[i] - heaters[j + 1]))
					j++;
				while (Math.abs(houses[i] - heaters[j]) > radius)
					radius++;
			}
		}

		return radius;
	}

	public int findRadius_1(int[] houses, int[] heaters)
	{
		Arrays.sort(heaters);
		
		for(int i=0;i<houses.length;i++)
		{
			System.out.println(Arrays.binarySearch(heaters, houses[i]));
		}
		
		return 0;
	}

	public static void main(String[] args)
	{
		//int[] a = new int[] { 282475249, 622650073, 984943658, 144108930, 470211272, 101027544, 457850878, 458777923 };
		//int[] b = new int[] { 823564440, 115438165, 784484492, 74243042, 114807987, 137522503, 441282327, 16531729,
		//		823378840, 143542612 };
		int[] a =new int[]{1,2,3,4,5,6};
		int[] b =new int[]{3,5};
		System.out.println(new Solution().findRadius_1(a, b));
	}
}
