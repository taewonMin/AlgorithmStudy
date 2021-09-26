package part2.week19.psw;

import java.util.Scanner;

public class Dynamic_17212 {
    static int n = 0;
    static int answer = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.close();

        int idx = n/7;
        while (idx-- > -1){
            int cnt = idx+1;
            if(n > cnt*7){
                int remain = n-cnt*7;
                cnt += remain/5 + (remain%5)/2 + (remain%5)%2;
            }
            if (answer == 0) answer = cnt;
            answer = answer > cnt ? cnt : answer;
        }
        System.out.println(answer);
    }
}
