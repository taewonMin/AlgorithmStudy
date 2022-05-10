package part5.week43.mtw;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

// 미로 탐색
public class GraphTraversal_2178 {
    public static int[][] maze;
    public static boolean[][] visited;
    public static int[] dx = {0,1,0,-1};
    public static int[] dy = {-1,0,1,0};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        maze = new int[input[0]][input[1]];
        visited = new boolean[input[0]][input[1]];
        for(int i=0; i<input[0]; i++){
            maze[i] = Arrays.stream(br.readLine().split("")).mapToInt(Integer::parseInt).toArray();
        }

        bw.write(bfs()+"");

        br.close();
        bw.flush();
        bw.close();
    }

    public static int bfs(){
        Queue<Node> queue = new LinkedList<>();
        queue.offer(new Node(0,0,1));
        visited[0][0] = true;
        int count = 0;

        while(!queue.isEmpty()){
            Node node = queue.poll();

            for(int i=0; i<4; i++){
                int x = node.x+dx[i];
                int y = node.y+dy[i];
                if(x==maze[0].length-1 && y==maze.length-1){
                    return node.distance+1;
                }
                if(boundaryCheck(x, y) && visited[y][x]==false && maze[y][x]==1){
                    queue.offer(new Node(x,y,node.distance+1));
                    visited[y][x]=true;
                }
            }
        }

        return count;
    }

    public static boolean boundaryCheck(int x, int y){
        return 0<=x && x<maze[0].length && 0<=y && y<maze.length;
    }
}

class Node{
    int x;
    int y;
    int distance;

    Node(int x, int y, int distance){
        this.x = x;
        this.y = y;
        this.distance = distance;
    }
}
