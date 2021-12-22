package part3.week29.mtw;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Math_3009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<String> xList = new ArrayList<>();
        List<String> yList = new ArrayList<>();
        for(int i=0; i<3; i++){
            String[] input = br.readLine().split(" ");
            if(xList.contains(input[0])){
                xList.remove(input[0]);
            }else{
                xList.add(input[0]);
            }
            if(yList.contains(input[1])){
                yList.remove(input[1]);
            }else{
                yList.add(input[1]);
            }
        }

        bw.write(xList.get(0) + " " + yList.get(0));

        br.close();
        bw.flush();
        bw.close();
    }
}
