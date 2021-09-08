package part2.week17.chw;

import java.util.Scanner;

public class Imple_10808 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[26];
        char[] input = sc.next().toCharArray();
        for(char i : input) {
        	arr[i - 97] += 1;
        } 
        for(int i : arr) {
        	System.out.println(i);
        }
        sc.close();
    }
}
