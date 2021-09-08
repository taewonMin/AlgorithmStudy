package part2.week17.mtw;

import java.util.Arrays;
import java.util.Scanner;

public class Math_1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];
        Integer[] B = new Integer[N];
        for(int i=0; i<N; i++) {
        	A[i] = sc.nextInt();
        }
        Arrays.sort(A);
        for(int i=0; i<N; i++) {
        	B[i] = sc.nextInt();
        }
        Arrays.sort(B, (a,b) -> a.compareTo(b)*-1);
        
        int sum = 0;
        for(int i=0; i<N; i++) {
        	sum += A[i]*B[i];
        }
        
        System.out.println(sum);

        sc.close();
    }
}
