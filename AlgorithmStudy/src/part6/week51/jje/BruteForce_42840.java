package part6.week51.jje;

import java.util.Scanner;

public class BruteForce_42840 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] answers = new int[n];
        int[] result = new int[3];


        for (int i = 0; i < n; i++) {
            answers[i] = sc.nextInt();
        }
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        for (int i = 0; i < n; i++) {
            if (answers[i] == a[i % a.length]) result[0]++;
            if (answers[i] == b[i % b.length]) result[1]++;
            if (answers[i] == c[i % c.length]) result[2]++;
        }

        int temp = 0;
        int count = 0;
        String resultStr = "";

        for (int i = 0; i < result.length; i++) {
            if (result[i] > temp) {
                temp = result[i];
                resultStr = "";
                resultStr += i + 1 + ",";
            } else if (result[i] == temp) {
                resultStr += i + 1 + ",";
            }
        }
        String[] resultArr = resultStr.split(",");
        int[] answer = new int[resultArr.length];
        for (int i = 0; i < resultArr.length; i++) {
            answer[i] = Integer.parseInt(resultArr[i]);
        }

    }
}