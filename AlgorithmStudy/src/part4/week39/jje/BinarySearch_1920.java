package part4.week39.jje;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BinarySearch_1920 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int[] aList = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();
        int b = Integer.parseInt(br.readLine());
        int[] bList = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < b; i++) {
            System.out.println(checkNumInArray(aList, bList[i], 0, a));
        }
    }

    static int checkNumInArray(int[] aList, int findNum, int start, int end) {

        if (start > end) {
            return 0;
        }
        int half = (start + end) / 2;
        if (aList[half] == findNum) {
            return 1;
        } else if (aList[half] > findNum){
            return checkNumInArray(aList, findNum, start, half - 1);
        } else {
            return checkNumInArray(aList, findNum, half + 1, end);
        }
    }

}