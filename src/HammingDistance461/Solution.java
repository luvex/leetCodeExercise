package HammingDistance461;

public class Solution {

	public Solution() {
		// TODO Auto-generated constructor stub
	}

	public int hammingDistance(int x, int y) {
		int count = 0;

		while (true) {
			if (x % 2 != y % 2)
				count++;
			x = x / 2;
			y = y / 2;
			if (x == 0 && y == 0)
				break;
			else
				continue;
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println(new Solution().hammingDistance(1, 4));
		System.out.println(Integer.bitCount(1 ^ 4));
	}
}
