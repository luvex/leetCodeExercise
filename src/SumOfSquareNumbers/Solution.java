package SumOfSquareNumbers;

public class Solution {

	public Solution() {
		// TODO Auto-generated constructor stub
	}

	public boolean judgeSquareSum(int c) {

		int estimatedValue = (int) Math.round(Math.sqrt(c));
		for (int i = estimatedValue; i >= 0; i--) {
			int leftValue = c - i * i;
			double result = Math.sqrt(leftValue);
			if (result > i)
				return false;
			if (result % 1 == 0)
				return true;
			else
				continue;
		}
		return false;

	}

	public static void main(String[] args) {
		System.out.print(new Solution().judgeSquareSum(99));
	}
}
