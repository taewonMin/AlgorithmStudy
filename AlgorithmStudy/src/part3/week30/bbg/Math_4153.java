package part3.week30.bbg;

import java.util.Arrays;
import java.util.Scanner;
// java8 12960kb 116ms
public class Math_4153 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        StringBuffer sb = new StringBuffer();
        while(true) {
        	for(int i = 0 ; i < 3 ; i++)
        		arr[i] = sc.nextInt();
        	
        	if(arr[0]+arr[1]+arr[2] == 0) break;
        	
        	Arrays.sort(arr);
        	sb.append(Math.pow(arr[0], 2) + Math.pow(arr[1], 2) == Math.pow(arr[2], 2) ? "right\n" : "wrong\n");
        }
        System.out.println(sb);
        sc.close();
    }
}
