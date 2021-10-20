package part3.week22.chw;

import java.util.Scanner;

public class Brute_1018 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int height = sc.nextInt();
		int width = sc.nextInt();
		int[][] board = new int[height][width];
		int answer = height*width;
		for(int i = 0; i < height; i++){
			char[] charArr = sc.next().toCharArray();
			for(int j = 0; j < charArr.length; j++){
				// 흰색 1, 검은색 0
				board[i][j] = charArr[j] == 'W' ? 1 : 0;
			}
		}
		for(int i = 0; i <= board.length - 8; i++){
			for(int j = 0; j <= board[i].length - 8; j++){
				int result = checkBoard(board, i, j);
				answer = Math.min(answer, result);
			}
		}
		System.out.println(answer);
		sc.close();
	}
	static int checkBoard(int[][] board, int height, int width){
		int cnt = 0;
		boolean checkColor = true;
		for(int i = height; i < height + 8; i++){
			for(int j = width; j < width + 8; j++){
				if(!(checkColor && board[i][j] == 1) && !(!checkColor && board[i][j] == 0)) {
					cnt++;
				}
				checkColor = !checkColor;
			}
			checkColor = !checkColor;
		}
		return Math.min(cnt, 64-cnt);
	}
}