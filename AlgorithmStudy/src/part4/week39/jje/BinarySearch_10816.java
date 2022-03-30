package part4.week39.jje;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BinarySearch_10816 {

    static int result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int[] aList = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();
        int b = Integer.parseInt(br.readLine());
        int[] bList = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < b; i++) {
            int findNum = bList[i];
             result = (int) Arrays.stream(aList).filter(c -> c == findNum).count();
            //result = 0;
            //checkNumInFrontArray(aList, bList[i]);
            //checkNumInBackArray(aList, bList[i]);
            System.out.println(result);
        }
    }

/*
    static void checkNumInFrontArray(int[] aList, int findNum) {
        int start = 0;
        int end = aList.length -1;
        int half;

        while (start <= end) {
            half = (start + end) / 2;

            if (findNum == aList[half]) result++;
            if (findNum < aList[half]) end = half - 1;
            else start = half + 1;
        }
    }


    static void checkNumInBackArray(int[] aList, int findNum) {
        int start = 0;
        int end = aList.length -1;
        int half;

        while (start <= end) {
            half = (start + end) / 2;

            if (findNum == aList[half]) result++;
            if (findNum < aList[half]) end = half;
            else start = half + 1;
        }
    }
 */
}
