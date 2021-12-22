package part3.week29.mtw;

import java.io.*;

public class Math_1085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);
        int w = Integer.parseInt(input[2]);
        int h = Integer.parseInt(input[3]);
        bw.write(Math.min(Math.min(x,y), Math.min(w-x, h-y))+"");

        br.close();
        bw.flush();
        bw.close();
    }
}
