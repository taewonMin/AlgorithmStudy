package part3.week24.mtw;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BackTracking_15650 {
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static int N;
    public static int M;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);

        for(int i=1; i<=N-M+1; i++){
            backTracking(i,1,i+" ");
        }
        
        br.close();
        bw.flush();
        bw.close();
    }

    public static void backTracking(int number, int count, String str) throws IOException{
        if(count == M){
            bw.write(str+"\n");
            return;
        }
        for(int i=number+1; i<=N; i++){
            backTracking(i,count+1,str+i+" ");
        }
    }
}
