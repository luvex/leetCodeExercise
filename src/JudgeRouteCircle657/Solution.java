package JudgeRouteCircle657;

public class Solution {

	public Solution() {
		// TODO Auto-generated constructor stub
	}

	public boolean judgeCircle(String moves) {
		if (moves.length() % 2 == 1)
			return false;
		else {
			int countU = 0;
			int countD = 0;
			int countR = 0;
			int countL = 0;
			for (int i = 0; i < moves.length(); i++) {
				char c = moves.charAt(i);
				if (c == 'U')
					countU++;
				else if (c == 'D')
					countD++;
				else if (c == 'R')
					countR++;
				else
					countL++;
			}
			if(countU == countD && countR == countL)
				return true;
			else
				return false;
		}
	}

	public static void main(String[] args) {
		System.out.print(new Solution().judgeCircle("LL"));
	}
}
