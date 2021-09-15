package part2.week18.bbg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/* 별찍기 */
public class Imple_10994 {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int N = Integer.parseInt(br.readLine());
        br.close();
        int ttC = 1 + 4*(N-1) ;
        for(int y = 0 ; y < ttC ; y++) {
        	for(int x = 0 ; x < ttC ; x++ ) {
        		if(x*y == 0 || (x*y)%ttC == 0 || ((x*y)%(ttC-1) == 0)) { // 짝수일때
        			sb.append('*');
        		}else {
        			sb.append(' ');
        		}
        	}
        	sb.append('\n');
        }
/* 1. 정사각형을 만든다.
N = 1이면 1줄 append 하고 끝 2의0승		1 * 1	(1 + 4*0)
N = 2이면 5줄 (3줄에 5-2(2*1)개)			5 * 5	(1 + 4*1) 첫줄끝줄은 꽉채움
								짝인덱스줄에서 홀인덱스칸 비우기, 
								홀수줄에선 짝인덱스칸 바깥쪽에서부터 1씩 늘리며 채움 -> ttC를 2로 나눴을 때 
N = 3이면 9줄 (5줄에 9-4(2*2)개)			9 * 9	(1 + 4*2) 
N = 4이면 13줄 (7줄에 13-6(2*3)개)		13 * 13 (1 + 4*3)
N = 5이면 17줄 (9줄에 17-8(2*4)개)		17 * 17 (1 + 4*4)

 */
        
        System.out.println(sb);
        
        
    }
}
