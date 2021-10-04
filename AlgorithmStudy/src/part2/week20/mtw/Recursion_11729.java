package part2.week20.mtw;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Recursion_11729 {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        bw.write((int)(Math.pow(2, N)-1) + "\n");
        hanoi(N, 1, 2, 3);

        br.close();
        bw.flush();
        bw.close();
    }

    static void hanoi(int n, int from, int via, int to) throws IOException {
        if(n==1){
            bw.write(from + " " + to + "\n");
        }else{
            hanoi(n-1, from, to, via);
            bw.write(from + " " + to);
            bw.newLine();
            hanoi(n-1, via, from, to);
        }
    }
}
