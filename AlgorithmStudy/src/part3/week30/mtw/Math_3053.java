package part3.week30.mtw;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Math_3053 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double R = Integer.parseInt(br.readLine());
        bw.write(Math.PI*R*R+"\n");
        bw.write(2*R*R+"");

        br.close();
        bw.flush();
        bw.close();
    }
}
