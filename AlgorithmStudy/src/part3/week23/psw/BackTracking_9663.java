package part3.week23.psw;

import java.util.Scanner;

public class BackTracking_9663 {
    static int answer = 0;
    static int N;
    static int[] board= new int[15];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        nQueen(0);
        sc.close();
        System.out.println(answer);
    }

    static void nQueen(int idx){
        if(idx == N){
            answer++;
            return;
        }

        for (int i = 0; i < N; i++) {
            board[idx] = i;
            if (promising(idx)) {
                nQueen(idx + 1);
            }
        }
    }

    private static boolean promising(int idx) {
        for (int i = 0; i < idx; i++) {
            if (board[idx] == board[i] || idx - i == Math.abs(board[idx] - board[i])) {
                return false;
            }
        }
        return true;
    }
}