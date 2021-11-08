package part3.week25.jje;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class BackTracking_15651 {
    static int n;
    static int m;
    static int[] arr = null;
    static boolean[] visited = null;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = (br.readLine()).split(" ");
        n = Integer.parseInt(str[0]);
        m = Integer.parseInt(str[1]);

        arr = new int[m];
        visited = new boolean[n];
        dfs(0);
        bw.flush();

    }

    static void dfs(int depth) throws IOException {
        if (!Arrays.asList(arr).contains(true) && depth == m){
            for (int val : arr) {
                bw.write(val + " ");
            }
            bw.write("\n");
            return;
        }

        for (int i = 0; i < n; i++) {
                visited[i] = true;
                arr[depth] = i + 1;
                dfs(depth + 1);
                visited[i] = false;
        }
    }
}
