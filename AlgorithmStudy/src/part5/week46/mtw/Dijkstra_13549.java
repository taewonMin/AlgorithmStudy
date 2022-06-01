package part5.week46.mtw;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

// 숨바꼭질3
public class Dijkstra_13549 {
    public static int MAX_LENGTH = 100001;
    public static int[] dp = new int[MAX_LENGTH];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Arrays.fill(dp, Integer.MAX_VALUE);
        
        System.out.println(bfs(sc.nextInt(), sc.nextInt()));
        
        sc.close();
    }

    public static int bfs(int start, int target){
        Deque<Integer> deque = new LinkedList<>();
        deque.add(start);
        dp[start] = 0;

        int maximum = Math.min(target+Math.abs(target-start), MAX_LENGTH); // 상한 범위

        while(!deque.isEmpty()){
            int pos = deque.poll();
            if(target==pos){
                return dp[pos];
            }
            if(pos*2 <= maximum && dp[pos*2] > dp[pos]){
                deque.addFirst(pos*2);
                dp[pos*2] = dp[pos];
            }
            if(pos+1 <= maximum && dp[pos+1] > dp[pos]+1){
                deque.add(pos+1);
                dp[pos+1] = dp[pos]+1;
            }
            if(pos-1 >= 0 && dp[pos-1] > dp[pos]+1){
                deque.add(pos-1);
                dp[pos-1] = dp[pos]+1;
            }
        }

        return -1;
    }
}
