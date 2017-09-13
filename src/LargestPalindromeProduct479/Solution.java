package LargestPalindromeProduct479;

public class Solution {

	public Solution() {
		// TODO Auto-generated constructor stub
	}

	public int largestPalindrome(int n) {
		String initNum = "";
		while (n-- != 0)
			initNum += "9";
		long numA = Long.parseLong(initNum);
		long numB = numA;
		long panlidraome = 0;
		while (numA != 0) {
			long result = numA * numB;
			if (result > panlidraome) {
				numB--;
				if (isPalindrome(result))
					panlidraome = result;
				if (numB == 0) {
					numA--;
					numB = numA;
				}
			} else {
					break;
			}
		}
		return (int) (panlidraome % 1337);
	}

	public boolean isPalindrome(long input) {
		String line = Long.toString(input);
		for (int i = 0; i < line.length() / 2; i++) {
			if (line.charAt(i) != line.charAt(line.length() - 1 - i))
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.print(new Solution().largestPalindrome(3));
	}
}
