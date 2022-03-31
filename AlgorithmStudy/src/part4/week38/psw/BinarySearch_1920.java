package part4.week38.psw;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

//187176	2368
//179000	1116 스트링 버퍼 추가
public class BinarySearch_1920 {
    static int[] numbers;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = sc.nextInt();
        }
        Arrays.sort(numbers);

        int M = sc.nextInt();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < M; i++) {
            int target = sc.nextInt();
            sb.append(Arrays.binarySearch(numbers,target)+"\n");
        }
        System.out.println(sb);
    }

    private static int binarySearch(int target) {
        int low = 0, high = numbers.length-1;
        while (low <= high){
            int mid = (low+high)/2;
            if (numbers[mid]==target){
                return 1;
            }else if (numbers[mid] > target){
                high = mid - 1;
            }else {
                low = mid + 1;
            }
        }
        return 0;
    }
}
