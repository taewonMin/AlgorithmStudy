package part5.week44.psw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
    1. sb 없을때 -> 324ms 50점
    2. sb만 쓸 떄 -> 204ms 50점
    3. sb+br -> 824ms 100점
 */
public class PrefixSum_16139 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] s = br.readLine().toCharArray();
        int[][] prefixSum = new int[26][s.length+1];
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < 26; j++) {
                prefixSum[j][i+1] = prefixSum[j][i] + (s[i]-'a' == j ? 1 : 0);
            }
        }
        StringBuffer sb = new StringBuffer();
        int q = Integer.parseInt(br.readLine());
        for (int i = 0; i < q; i++) {
            String[] line = br.readLine().split(" ");
            char ch = line[0].charAt(0);
            int l = Integer.parseInt(line[1]), r = Integer.parseInt(line[2]);
            sb.append(prefixSum[ch-'a'][r+1]- prefixSum[ch-'a'][l] +"\n");
        }
        System.out.println(sb);
    }
}
