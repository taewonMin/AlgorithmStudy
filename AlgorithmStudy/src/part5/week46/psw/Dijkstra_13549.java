package part5.week46.psw;

import java.util.*;

public class Dijkstra_13549 {

    static class Node {
        int idx , dist;
        public Node(int idx, int dist) {
            this.idx = idx;
            this.dist = dist;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt(), end = sc.nextInt();
        int[] dp = new int[1000001];
        Arrays.fill(dp,Integer.MAX_VALUE);

        PriorityQueue<Node> queue = new PriorityQueue<>((a1,a2) -> {return Integer.compare(a1.dist,a2.dist);});
        queue.add(new Node(start,0));
        dp[start] = 0;

        while (!queue.isEmpty()){
            Node poll = queue.poll();
            int[] idx = {poll.idx*2,poll.idx+1,poll.idx-1};

            for (int i = 0; i < 3; i++) {
                if (boundaryChk(idx[i]) && dp[idx[i]] > dp[poll.idx] + (i==0?0:1)){
                    queue.offer(new Node(idx[i], dp[idx[i]] = dp[poll.idx] + (i==0?0:1)));
                }
            }
        }

        System.out.println(dp[end]);
    }

    private static boolean boundaryChk(int idx) {
        return idx > -1 && idx < 100001;
    }
}