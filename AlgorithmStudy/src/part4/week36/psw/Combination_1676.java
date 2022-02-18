package part4.week36.psw;

import java.util.Scanner;
//12920	108
public class Combination_1676 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int two = 0, five = 0;
        if (N > 1){
            for (int i = 2; i <= N; i++) {
                two += getTarget(i,2);
                five += getTarget(i,5);
            }
        }
        System.out.println(Math.min(two,five));
    }

    private static int getTarget(int i, int target) {
        int cnt = 0;
        while (true){
            if (i%target == 0){
                cnt++;
                i /= target;
            }else {
                break;
            }
        }
        return cnt;
    }
}
