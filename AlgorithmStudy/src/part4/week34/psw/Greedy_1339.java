package part4.week34.psw;

import java.util.Arrays;
import java.util.Scanner;
/*
    탐욕 조건
    1. 인덱스가 빠른것.  ABC, BBC -> 987 + 887
    2. 개수가 많은것.
 */
public class Greedy_1339 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] words = new String[n];
        // 개수랑 순서
        Integer[][] data = new Integer['Z'-'A'+1][2];
        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
            for (int j = 0; j < words[i].length(); j++) {
                int idx = 'Z'-words[i].charAt(j);
                if (data[idx][0] == null) data[idx][0] = 0;
                data[idx][0] += 1;
                if (data[idx][1] == null) data[idx][1] = j;
            }
        }
        // 정렬
        Arrays.sort(data,(a,b)->{
            return 0;
        });

        // 계산

    }
}
