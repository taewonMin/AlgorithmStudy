package part4.week34.mtw;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

// 회의실 배정
public class Greedy_1931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[][] meeting = new int[N][2];
        for(int i=0; i<N; i++){
            meeting[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        Arrays.sort(meeting, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1] == o2[1]){
                    return o1[0] - o2[0];
                }
                return o1[1] - o2[1];
            }
        });

        int count = 1;
        int endTime = meeting[0][1];    // 첫 회의 종료시간
        for(int i=1; i<meeting.length; i++){
            if(endTime <= meeting[i][0]){
                endTime = meeting[i][1];
                count++;
            }
        }

        bw.write(count+"\n");

        br.close();
        bw.flush();
        bw.close();
    }
}
