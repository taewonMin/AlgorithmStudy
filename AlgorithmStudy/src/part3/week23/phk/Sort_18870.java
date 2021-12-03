package part3.week23.phk;

import java.util.Scanner;

public class Sort_18870 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i : arr) {
            i = sc.nextInt();
        }
        sc.close();
        
        int [] press_arr = new int[n];
        for (int i = 0; i < press_arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                if(arr[i] > arr[j]) press_arr[i]++;
            }
            System.out.print(press_arr[i] + " ");
        }
    }
}
