package part2.week19.mtw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tomato_7569 {
    public static int[][][] box;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int M = Integer.parseInt(input[0]);
        int N = Integer.parseInt(input[1]);
        int H = Integer.parseInt(input[2]);
        box = new int[H][N][M];

        int ripeCnt = 0;
        int nonRipeCnt = 0;
        for(int i=0; i<H; i++){
            for(int j=0; j<N; j++){
                String[] line = br.readLine().split(" ");
                for(int k=0; k<M; k++){
                    int state = Integer.parseInt(line[k]);
                    box[i][j][k] = state;
                    if(state == 0) nonRipeCnt++;
                    else if(state == 1) ripeCnt++;
                }
            }
        }

        if(nonRipeCnt == 0){    // 모든 토마토가 익어있는 경우
            System.out.println(0);
        }else if(ripeCnt == 0){ // 익은 토마토가 없을경우 = 토마토가 모두 익지 못하는 상황

        }else{

        }

        br.close();
    }
}