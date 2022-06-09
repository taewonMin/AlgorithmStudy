package part5.week46.mtw;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

// 플로이드
public class Floyd_11404 {
    public static int[][] graph;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        graph = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i!=j){
                    graph[i][j] = Integer.MAX_VALUE;
                }
            }
        }

        int m = Integer.parseInt(br.readLine());
        for(int i=0; i<m; i++){
            int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if(graph[input[0]-1][input[1]-1] > input[2]){
                graph[input[0]-1][input[1]-1] = input[2];
            }
        }

        floyd();

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                bw.write((graph[i][j]==Integer.MAX_VALUE ? 0 : graph[i][j])+" ");
            }
            bw.newLine();
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void floyd(){
        for(int k=0; k<graph.length; k++){
            for(int i=0; i<graph.length; i++){
                if(i==k || graph[i][k] == Integer.MAX_VALUE) continue;
                for(int j=0; j<graph.length; j++){
                    if(j==k || graph[k][j] == Integer.MAX_VALUE) continue;
                    if(graph[i][j] > graph[i][k]+graph[k][j]){
                        graph[i][j] = graph[i][k]+graph[k][j];
                    }
                }
            }
        }
    }
}
