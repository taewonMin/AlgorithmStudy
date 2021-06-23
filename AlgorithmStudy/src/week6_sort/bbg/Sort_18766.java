package week6_sort.bbg;

import java.util.Scanner;

public class Sort_18766 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 줄 길이
		int L = sc.nextInt();
//		int L = 5;
		
		// 측정할 타이밍 (초)
		int T = sc.nextInt();
//		int T = 5;
		
		// 개미 수
		int N = sc.nextInt();
//		int N = 2;
		
		
		// 개미가 방향을 바꿀 때 == 위치 0, 위치 L, 다른 개미 위치와 같을 때. 방향 전환시마다 ! 붙여줌 방향출력 필요없고 위치 찾기위한 요소임
		boolean dir = true; // 좌
		
		Object[][] ants = new Object[N][2];
		for(int cnt = 0 ; cnt < N ; cnt++) {
			ants[cnt][0] = sc.nextInt(); // 위치
			char temp = sc.next().trim().charAt(0); // 방향
			if(temp == 'L') {
				ants[cnt][1] = dir;
			}else {
				ants[cnt][1] = !dir;
			}
		}
		
		// 개미는 이름이 필요없다. 누가 그 위치에 있든 위치만 알면 됨.
		// 시간 경과에 따른 위치이동
		for(int cnt = 0 ; cnt < T ; cnt++) {
			for(int idx = 0; idx < N ; idx++) {
				if((boolean) ants[idx][1]) { // L(true)  이면
					ants[idx][0] = (Integer)(ants[idx][0]) -1;
				}else if(!(boolean) ants[idx][1]) { // D(false)  이면
					ants[idx][0] = (Integer)(ants[idx][0]) +1;
				}
			}
			
			for(int idx = 0; idx < N ; idx++) {
				if((Integer)(ants[idx][0]) == 0 || (Integer)(ants[idx][0]) == L) {
					ants[idx][1] = !(boolean)ants[idx][1];
				}else if(idx-1 >= 0 && N != 1) {
					if(ants[idx][0] == ants[idx-1][0]) {
						ants[idx][1] = !(boolean)ants[idx][1];
					}
				}else if(idx+1 < L && N != 1) {
					if(ants[idx][0] == ants[idx+1][0]) {
						ants[idx][1] = !(boolean)ants[idx][1];
					}
				}
			}
		}

		for(int idx = 0 ; idx < N ; idx++) {
			int cnt = idx;
			while(cnt > 0 && (Integer)ants[cnt-1][0] > (Integer)ants[cnt][0]) {
				Object temp = ants[cnt-1][0];
				ants[cnt-1][0] = ants[cnt][0];
				ants[cnt][0] = temp;
				cnt--;
			}
		}
		
		for(int cnt = 0; cnt < N ; cnt++) {
			System.out.println((Integer)ants[cnt][0]);
		}
		
		sc.close();
	}
}
