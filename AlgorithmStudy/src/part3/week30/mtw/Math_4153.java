package part3.week30.mtw;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Math_4153 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true){
            String[] input = br.readLine().split(" ");
            int[] array = Arrays.stream(input).mapToInt(Integer::parseInt).sorted().toArray();

            if(array[0]==0 && array[1]==0 && array[2]==0){
                break;
            }

            if(array[0]*array[0] + array[1]*array[1] == array[2]*array[2]){
                bw.write("right");
            }else{
                bw.write("wrong");
            }
            bw.newLine();
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
