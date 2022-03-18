package part4.week39.psw;

import java.util.Arrays;
import java.util.Scanner;
//310968	1828
public class BinarySearch_2805 {
    static int m;
    static int[] numbers;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        m = sc.nextInt();
        numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println(bs(Arrays.stream(numbers).max().getAsInt()));
    }

    private static int bs(int end) {
        int start = 0;
        while (start <= end){
            int mid = (start+end)/2;
            long h = getRemains(mid);

            if (h >= m){
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return start-1;
    }

    private static long getRemains(int mid) {
        long sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]-mid > 0){
                sum += (numbers[i]-mid);
            }
        }
        return sum;
    }
}
