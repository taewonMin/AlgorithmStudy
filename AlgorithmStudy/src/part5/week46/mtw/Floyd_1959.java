package part5.week46.mtw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 운동
public class Floyd_1959 {
    public static int[][] graph;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        graph = new int[input[0]][input[0]];
        for(int i=0; i<input[0]; i++){
            for(int j=0; j<input[0]; j++){
                if(i!=j){
                    graph[i][j] = Integer.MAX_VALUE;
                }
            }
        }

        for(int i=0; i<input[1]; i++){
            int[] road = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            graph[road[0]-1][road[1]-1] = road[2];
        }

        floyd();

        int min = Integer.MAX_VALUE;
        for(int i=0; i<graph.length; i++){
            for(int j=0; j<graph.length; j++){
                if(i==j || graph[i][j]==Integer.MAX_VALUE || graph[j][i]==Integer.MAX_VALUE) continue;
                if(min > graph[i][j] + graph[j][i]){
                    min = graph[i][j] + graph[j][i];
                }
            }
        }

        System.out.println(min==Integer.MAX_VALUE ? -1 : min);

        br.close();
    }

    public static void floyd(){
        for(int k=0; k<graph.length; k++){
            for(int i=0; i<graph.length; i++){
                if(i==k || graph[i][k] == Integer.MAX_VALUE) continue;
                for(int j=0; j<graph.length; j++){
                    if(j==k || graph[k][j] == Integer.MAX_VALUE) continue;
                    if(graph[i][j] > graph[i][k] + graph[k][j]){
                        graph[i][j] = graph[i][k] + graph[k][j];
                    }
                }
            }
        }
    }
}
