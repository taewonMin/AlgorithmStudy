package part2.week20.psw;

import java.util.Scanner;

public class Brute_2798 {
    static int[] numbers = null;
    static int answer = 0;
    static int xxcnt = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        final int M = sc.nextInt();

        numbers = new int[N];
        for (int i = 0; i < N; i++) numbers[i] = sc.nextInt();

        //search(M);
        recursiveSearch(0,3,M,0);
        System.out.println(answer);
        sc.close();
    }

    static void recursiveSearch(int sum,int cnt,int target, int idx){
        if(sum > target || idx >= numbers.length) return;

        if(cnt == 0) {
            answer = sum <= target && sum > answer ? sum : answer;
            return;
        }

        for(int i = idx; i < numbers.length - (cnt-1); i++) {
            recursiveSearch(sum+numbers[i], cnt-1,target ,i+1);
        }
    }


    static void search(int target){
        for (int q = 0; q < numbers.length-2; q++) {
            for (int w = q+1; w < numbers.length-1; w++) {
                for (int e = w+1; e < numbers.length; e++) {
                    int sum = numbers[q] + numbers[w] + numbers[e];
                    answer = sum <= target && sum > answer ? sum : answer;
                    System.out.println(q + " , " + w + " , " + e);
                }
            }
        }
    }
}