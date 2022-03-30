package part4.week39.psw;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch_1654 {
    static int n;
    static long[] numbers;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        n = sc.nextInt();
        numbers = new long[k];
        for (int i = 0; i < k; i++) {
            numbers[i] = sc.nextLong();
        }
        System.out.println(bs(Arrays.stream(numbers).max().getAsLong()));
    }

    private static long bs(long end) {
        long start = 1;
        while (start <= end){
            long mid = (start+end)/2;
            long cnt = getLineCnt(mid);

            if (cnt >= n){
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return start-1;// 최댓값, target은 mid, -1 하는 이유는 while문 조건에서 +1로 오기 때문...?!
    }

    private static long getLineCnt(long divider) {
        long cnt = 0;
        for (int i = 0; i < numbers.length; i++) {
            cnt += (numbers[i]/divider);
        }
        return cnt;
    }
}
