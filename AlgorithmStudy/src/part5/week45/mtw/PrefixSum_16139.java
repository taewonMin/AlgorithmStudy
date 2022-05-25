package part5.week45.mtw;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 인간-컴퓨터 상호작용
public class PrefixSum_16139 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int[][] prefixSum = new int[26][str.length()+1];
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            for(int j=0; j<prefixSum.length; j++){
                if(j==ch-'a'){
                    prefixSum[j][i+1] = prefixSum[j][i]+1;
                }else{
                    prefixSum[j][i+1] = prefixSum[j][i];
                }
            }
        }

        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            String[] input = br.readLine().split(" ");
            int index = input[0].charAt(0)-'a';
            int count = prefixSum[index][Integer.parseInt(input[2])+1];
            if(!input[1].equals("0")){
                count -= prefixSum[index][Integer.parseInt(input[1])];
            }
            bw.write(count+"\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
