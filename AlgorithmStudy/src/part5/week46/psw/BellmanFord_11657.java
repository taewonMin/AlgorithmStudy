package part5.week46.psw;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BellmanFord_11657 {

    static class Node{
        int start, end, dist;

        public Node(int start, int end, int dist) {
            this.start = start;
            this.end = end;
            this.dist = dist;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        long[] dp = new long[n+1];
        List<Node> list = new ArrayList<>();


        for (int i = 2; i <= n; i++) {
            dp[i] = Integer.MAX_VALUE;
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
            list.add(new Node(a,b,c));
        }

        StringBuffer sb = new StringBuffer();
        if (bellmanFord(dp,list)){
            sb.append(-1+"\n");
        }else {
            for (int i = 2; i <= n; i++) {
                sb.append((dp[i] == Integer.MAX_VALUE ? -1 : dp[i]) + "\n");
            }
        }
        System.out.println(sb);
    }

    private static boolean bellmanFord(long[] dp, List<Node> list) {
        for (int i = 1; i <= dp.length; i++) {
            for (int j = 0; j < list.size(); j++) {
                if (dp[list.get(j).start] == Integer.MAX_VALUE) continue;
                if (dp[list.get(j).end] > dp[list.get(j).start] + list.get(j).dist){
                    dp[list.get(j).end] = dp[list.get(j).start] + list.get(j).dist;
                    if (i==dp.length) return true;
                }
            }
        }
        return false;
    }

}
