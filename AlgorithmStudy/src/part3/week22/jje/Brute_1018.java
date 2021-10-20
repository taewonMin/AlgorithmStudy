package part3.week22.jje;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Brute_1018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String first = br.readLine();
        int n = Integer.parseInt(first.split(" ")[0]);
        int m = Integer.parseInt(first.split(" ")[1]);
        StringBuilder sb = new StringBuilder();
        int result = 0;
        sb.append(br.readLine());
        for (int i = 1; i < m; i++) {
            String nextRow = br.readLine();
            for (int j = 0; j < n; j++) {
                String con = String.valueOf(sb.charAt(n * i - (n - (j + 1))));
                String cur = String.valueOf(nextRow.charAt(j));

                if (j == n - 1 && con.equals(cur)) {
                    result++;
                    sb.append(String.valueOf(cur.equals("W")? "B" : "W"));
                    continue;
                }

                if (j != n - 1 && !con.equals(cur)) {
                    result++;
                    sb.append(con);
                    continue;
                }
                sb.append(cur);
            }
        }
        System.out.println(result);
    }
}

/*
8 8
WBWBWBWB
BWBWBWBW
WBWBWBWB
BWBBBWBW
WBWBWBWB
BWBWBWBW
WBWBWBWB
BWBWBWBW
* */

/*
 10 13
 BBBBBBBBWBWBW
 BBBBBBBBBWBWB
 BBBBBBBBWBWBW
 BBBBBBBBBWBWB
 BBBBBBBBWBWBW
 BBBBBBBBBWBWB
 BBBBBBBBWBWBW
 BBBBBBBBBWBWB
 WWWWWWWWWWBWB
 WWWWWWWWWWBWB
 */