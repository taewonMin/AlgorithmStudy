package part4.week34.psw;

import java.util.Arrays;
import java.util.Scanner;

public class Greedy_10610 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.next().toCharArray();
        Arrays.sort(arr);
        StringBuffer sb = new StringBuffer();
        sb.append(arr,0,arr.length);
        String answer = sb.reverse().toString();
        if (answer.contains("0") && Long.parseLong(answer)%3 == 0){
            System.out.println(answer);
        }else {
            System.out.println("-1");
        }
    }
}
