package part3.week25.bbg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*N&M  113148KB 496ms*/
public class BackTracking_15651 {

	static int[] arr = null;
	static StringBuffer sb = new StringBuffer();
	
	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        br.close();

        arr = new int[M];
        bfs(N,M,0);
        System.out.println(sb);
    }
    
    static void bfs(int N, int M, int depth) {
    	if(depth == M) { // 깊이와 숫자 갯수가 같으면 출력
    		for(int item : arr){
    			sb.append(item).append(" ");
    		}
    		sb.append("\n");
    		return;
    	}
    	
    	for(int i = 0 ; i < N ; i++) {
    		arr[depth] = i+1;
    		bfs(N,M,depth+1);
    	}
    }
}
