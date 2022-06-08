package part5.week46.mtw;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;

// 타임머신
public class Dijkstra_11657 {
    public static class Node {
        int from;
        int to;
        int distance;

        Node(int from, int to, int distance){
            this.from = from;
            this.to = to;
            this.distance = distance;
        }
    }

    public static ArrayList<Node> edgeList = new ArrayList<>();
    public static long[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        dp = new long[input[0]+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        for(int i=0; i<input[1]; i++){
            int[] info = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            edgeList.add(new Node(info[0], info[1], info[2]));
        }

        if(bellmanford(1)){
            for(int i=2; i<dp.length; i++){
                bw.write((dp[i]==Integer.MAX_VALUE ? -1 : dp[i])+"\n");
            }
        }else{
            bw.write("-1");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static boolean bellmanford(int start){
        dp[start] = 0;
        for(int i=0; i<dp.length; i++){
            for(int j=0; j<edgeList.size(); j++){
                int from = edgeList.get(j).from;
                int to = edgeList.get(j).to;
                int distance = edgeList.get(j).distance;

                if(dp[from] == Integer.MAX_VALUE){
                    continue;
                }

                if(dp[to] > dp[from]+distance){
                    if(i==dp.length-1){
                        return false;
                    }
                    dp[to] = dp[from]+distance;
                }
            }
        }
        return true;
    }
}