package ReverseInteger7;

public class Solution {

	public Solution() {
		// TODO Auto-generated constructor stub
	}

	public int reverse(int x) {
		int index = Integer.toString(Math.abs(x)).length();

		int result = 0;

		for (int i = 1; i <= index; i++) {
			int addValue = x % (int) Math.pow(10, 1) * (int) Math.pow(10, index - i);
			if (index != 1 && i!=index && addValue % 10 != 0)
				return 0;
			if (x >= 0 && Integer.MAX_VALUE - result < addValue)
				return 0;
			else if (x < 0 && Integer.MIN_VALUE - result > addValue)
				return 0;
			result += addValue;
			x /= (int) Math.pow(10, 1);

		}

		return result;
	}

	public static void main(String[] args) {
		System.out.print(new Solution().reverse(54321));
	}
}
