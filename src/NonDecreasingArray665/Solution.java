package NonDecreasingArray665;

public class Solution {

	public Solution() {
		// TODO Auto-generated constructor stub
	}

	public boolean checkPossibility(int[] nums) {

		int count = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] > nums[i + 1]) {
				if (i != 0 && i != (nums.length - 2)) {
					if (nums[i] > nums[i + 2] && nums[i - 1] > nums[i + 1])
						return false;
				}
				count++;
			}
			if (count >= 2)
				return false;
		}

		return true;
	}

	public static void main(String[] args) {
		System.out.println(new Solution().checkPossibility(new int[] { 2, 3, 3, 2, 4 }));
	}

}
