package part3.week25.mtw;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BackTracking_15651 {
    public static BufferedWriter bw;
    public static int N;
    public static int M;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);

        backTracking(0, "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void backTracking(int depth, String str) throws IOException{
        if(depth == M){
            bw.write(str+"\n");
            return;
        }
        for(int i=1; i<N+1; i++){
            backTracking(depth+1, str+i+" ");
        }
    }
}
