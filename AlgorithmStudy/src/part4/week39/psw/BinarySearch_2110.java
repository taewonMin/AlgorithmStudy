package part4.week39.psw;

import java.util.Arrays;
import java.util.Scanner;

//	169180	980
public class BinarySearch_2110 {
    static int c;
    static int[] numbers;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        c = sc.nextInt();
        numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        Arrays.sort(numbers);
        System.out.println(bs(numbers[n-1]-numbers[0]));
    }

    private static int bs(int end) {
        int start = 1;
        while (start <= end){
            int mid = (start+end)/2;
            long cnt = getCnt(mid);
            if (cnt >= c){
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return start-1;
    }

    private static long getCnt(int gap) {
        long cnt = 1;
        int next = numbers[0] + gap;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] >= next){
                cnt++;
                next = numbers[i] + gap;
            }
        }
        return cnt;
    }
}
