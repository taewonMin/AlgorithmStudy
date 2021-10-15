package part3.week22.mtw;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BackTracking_15652 {
    public static int N;
    public static int M;
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);

        for(int i=1; i<N+1; i++){
            dfs(i,1,i+" ");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void dfs(int start, int depth, String str) throws IOException {
        if(depth==M) {
            bw.write(str.trim()+"\n");
            return;
        }
        for(int i=start; i<N+1; i++){
            dfs(i, depth+1, str+i+" ");
        }
    }
}