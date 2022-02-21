package part4.week33.psw;

import java.util.Scanner;

//12896	112
public class Greedy_11047 {
    public static void main(String[] args) { }

    static void dp(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
    }

    static void greedy(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int[] numbers = new int[n];
        int maxIdx = 0;

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
            if (numbers[i] <= k) maxIdx = Math.max(maxIdx,i);
        }

        int answer = 0;
        while (k != 0){
            if(numbers[maxIdx] <= k){
                answer += k/numbers[maxIdx];
                k = k%numbers[maxIdx];
            }
            maxIdx--;
        }

        System.out.println(answer);
        sc.close();
    }
}
