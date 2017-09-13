package BattleshipsInABoard419;

public class Solution {

	public Solution() {
		// TODO Auto-generated constructor stub
	}

	public int countBattleships(char[][] board) {
		int x = board.length;
		int y = board[0].length;
		int count = 0;
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				if(board[i][j] == 'X')
				{
					count++;
					for(int m=i+1;m<x;m++)
					{
						if(board[m][j] == 'X')
							board[m][j] ='.';
						else
							break;
					}
					for(int n=j+1;n<y;n++)
					{
						if(board[i][n] =='X')
							board[i][n] = '.';
						else
							break;
					}
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.print(new Solution().countBattleships(new char[][] {}));
	}
}
