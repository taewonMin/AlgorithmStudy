package part4.week34.chw;

import java.util.Arrays;
import java.util.Scanner;

public class Greedy_11399 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int[] arr = new int[N];
    	int result = 0;
    	for(int i = 0; i < N; i++) {
    		arr[i] = sc.nextInt();
    	}
    	Arrays.sort(arr);
    	for(int minute : arr) {
    		result += minute * N;
    		N--;
    	}
    	System.out.println(result);
    	sc.close();
    }
}
