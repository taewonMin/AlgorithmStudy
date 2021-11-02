package part3.week23.mtw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BackTracking_9663 {
    public static boolean[][] position;
    public static int N;
    public static int[] dx = {-1,0,1}; // ↖↑↗
    public static int result = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        position = new boolean[N][N];
        
        for(int i=0; i<N; i++){
            dfs(0, i, 1);
        }

        System.out.println(result);

        br.close();
    }

    public static void dfs(int y, int x, int count){
        // 퀸 이동경로 체크
        if(validCheck(y,x) == false) return;

        if(count == N){
            result++;
            return;
        }
        
        Arrays.fill(position[y], false);
        position[y][x] = true;
        
        // 다음줄로 이동
        for(int i=0; i<N; i++){   
            dfs(y+1,i, count+1);
        }
    }

    public static boolean validCheck(int y, int x){
        for(int i=0; i<dx.length; i++){
            int posX = x+dx[i];
            int posY = y-1;
            while(0 <= posX && posX < N && 0 <= posY && posY < N){
                if(position[posY][posX]){
                    return false;
                }
                posX += dx[i];
                posY += -1;
            }
        }
        return true;
    }
}
