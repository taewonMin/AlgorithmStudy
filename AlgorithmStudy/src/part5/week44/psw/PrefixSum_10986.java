package part5.week44.psw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PrefixSum_10986 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int n = Integer.parseInt(line[0]) , m = Integer.parseInt(line[1]);
        int[] prefixSum = new int[n+1];
        int cnt = 0;

        int[] numbers = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int i = 1; i <= n; i++) {
            prefixSum[i] = prefixSum[i-1] + numbers[i-1];
            for (int j = 1; j <= i; j++) {
                if ((prefixSum[i]-prefixSum[j-1])%m == 0) cnt++;
            }
        }

        System.out.println(cnt);
    }
}
