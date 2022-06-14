package part5.week44.psw;

import java.util.*;

public class PrefixSum_10986 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() , m = sc.nextInt(), sum = 0;
        int[] cnt = new int[m];
        while (n-- > 0) {
            sum = (sum + sc.nextInt())%m;
            cnt[sum]++;
        }

        long ans = cnt[0];
        for (int i = 0; i < m; i++) {
            ans += (long) cnt[i] * (cnt[i]-1)/2;
        }

        System.out.print(ans);
    }
}
