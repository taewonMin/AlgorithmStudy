package part5.week44.jje;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PrefixSum_2559 {
    public static void main(String[] args) throws IOException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = input[0];
        int k = input[1];
        int[] num = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] prefixSum = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            prefixSum[i] = prefixSum[i - 1] + num[i - 1];
        }
        int max = 0;
        for (int j = k; j < n; j++) {
            int resultSum = prefixSum[j] - prefixSum[j - k];
            if (resultSum > max) max = resultSum;
        }
        System.out.println(max);
    }
}
