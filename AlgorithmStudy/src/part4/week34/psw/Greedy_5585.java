package part4.week34.psw;

import java.util.Scanner;

public class Greedy_5585 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] changes = {500,100,50,10,5,1};
        int n = 1000-sc.nextInt();
        int cnt = 0, idx = -1;
        while (idx++ < changes.length-1){
            if (n >= changes[idx]){
                cnt += n/changes[idx];
                n %= changes[idx];
            }
        }
        System.out.println(cnt);
    }
}
