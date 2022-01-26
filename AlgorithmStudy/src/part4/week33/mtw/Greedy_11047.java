package part4.week33.mtw;

import java.io.*;

public class Greedy_11047 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);
        
        int[] coin = new int[N];
        for(int i=0; i<N; i++){
            coin[i] = Integer.parseInt(br.readLine());
        }

        int count = 0;
        int remain = K;
        int coinIndex = coin.length-1;
        while(remain > 0){
            while(remain / coin[coinIndex] == 0){
                coinIndex--;
            }
            count += remain / coin[coinIndex];
            remain %= coin[coinIndex];
        }

        bw.write(count+"");

        br.close();
        bw.flush();
        bw.close();
    }
}
