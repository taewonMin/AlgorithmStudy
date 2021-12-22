package part3.week29.chw;

import java.util.Scanner;

public class Math_3009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][2];
        for(int i = 0; i < 3; i++) {
        	arr[i][0] = sc.nextInt();
        	arr[i][1] = sc.nextInt();
        }
        sc.close();
        System.out.print(arr[0][0] == arr[1][0] ? arr[2][0] + " " : arr[1][0] == arr[2][0] ? arr[0][0] + " " : arr[1][0] + " ");
        System.out.print(arr[0][1] == arr[1][1] ? arr[2][1] : arr[1][1] == arr[2][1] ? arr[0][1] : arr[1][1]);
        
//        if(arr[0][0] == arr[1][0]) {
//        	System.out.print(arr[2][0] + " ");
//        }else if(arr[1][0] == arr[2][0]) {
//        	System.out.print(arr[0][0] + " ");
//        }else {
//        	System.out.print(arr[1][0] + " ");
//        }
//        
//        if(arr[0][1] == arr[1][1]) {
//        	System.out.print(arr[2][1]);
//        }else if(arr[1][1] == arr[2][1]) {
//        	System.out.print(arr[0][1]);
//        }else {
//        	System.out.print(arr[1][1]);
//        }
    }
}

