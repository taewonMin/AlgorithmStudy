package part2.week19.bbg;

import java.util.Scanner;
/*달토끼 */
public class Dynamic_17212 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] coins = {7, 5, 2, 1};
        int N = sc.nextInt();
        int N2 = N;
        sc.close();
        int idx = 0;
        int cnt = 0;
        /*
         *  최대공약수? 최소공배수?
         *  인수?
         *  7 5 2 1로 쪼갤 수 있는 경우의 수 중 가장 작은 수 리턴
         *  분기해서 원래 7의 개수 -1개로 조회..? 큰수일수록 안될거같은데
         * */
        int seven = 0;
        while(true) {
        	cnt += N/coins[idx];
        	if(idx == 0) seven = cnt; // 제일 큰 수의 cnt만 담기
        	N = N%coins[idx++];
        	
        	if(N == 0) break;
        }
        
        idx = 0;
        int cnt2 = 0;
        while(true) {
        	if(cnt2 == 0) {
        		cnt2 += seven-1;
        		N2 = N2-(coins[idx]*(seven-1));
        	}else {
        		cnt2 += N2/coins[idx];
        		N2 = N2%coins[idx];
        		if(N2 == 0) break;
        	}
        	idx++;
        }
        
        System.out.println(cnt > cnt2 ? cnt2 : cnt);
    }
}
