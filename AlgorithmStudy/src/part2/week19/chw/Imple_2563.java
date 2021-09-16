package part2.week19.chw;

import java.util.Scanner;

public class Imple_2563 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int[][] arr = new int[100][100];
        int sum = 0;
        for(int i = 0; i < cnt; i++) {
        	int x = sc.nextInt();
        	int y = sc.nextInt();
        	for(int j = y; j < y+10; j++) {
        		for(int k = x; k < x+10; k++) {
        			arr[j][k] = 1;
        		}
        	}
        }
        for(int[] ar : arr) {
        	for(int a : ar) {
        		if(a == 1) sum++;
        	}
        }
        System.out.println(sum);
        sc.close();
    }
}
