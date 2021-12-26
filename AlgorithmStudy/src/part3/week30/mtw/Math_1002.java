package part3.week30.mtw;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Math_1002 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++){
            int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            double distance = Math.sqrt(Math.pow(Math.abs(input[0]-input[3]),2)+Math.pow(Math.abs(input[1]-input[4]),2));
            // 두 원이 동일한 경우
            if(distance==0 && input[2]==input[5]){
                bw.write(-1+"\n");
            }
            // 두 원이 겹치지 않거나 한 원을 내부에 포함하는 경우
            else if(distance > input[2]+input[5] || Math.max(input[2], input[5]) > Math.min(input[2], input[5])+distance){
                bw.write(0+"\n");
            }
            // 두 원이 외접/내접 하는 경우
            else if(distance == input[2]+input[5] || Math.max(input[2], input[5]) == Math.min(input[2], input[5])+distance){
                bw.write(1+"\n");
            }
            // 그 외
            else{
                bw.write(2+"\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
