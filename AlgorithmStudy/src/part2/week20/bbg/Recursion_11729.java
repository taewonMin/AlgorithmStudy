package part2.week20.bbg;

import java.util.Scanner;
/*하노이*/
public class Recursion_11729 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        
        int K = 0; // 횟수
        for(int cnt = 0 ; cnt < n ; cnt++) {
        	K += Math.pow(2, cnt);
        }
        System.out.println(K);
        move(n,1,3); // n개의 원반을 1번에서 시작해서 3번으로 가는게 목표임
        
    }
    
    /*
     * n개의 원판을 x에서 y로 이동시키는 메서드.
     *  move(이동시킬원판갯수 n, 시작기둥번호 x, 목표기둥번호 y)
     * 
     * 1. 바닥원판을 제외한 모든 원판그룹(1 ~ n-1개)을 시작기둥(x) -> '중간기둥'으로 "이동"(move메서드)
     * 2. 바닥원판(n)을 시작기둥(1) -> 목표기둥(3)으로 이동했음을 "출력"
     * 3. 바닥원판을 제외한 모든 원판그룹(1 ~ n-1개)을 '중간기둥'-> 목표기둥(y)으로 "이동"(move메서드)
     * 
     * '중간기둥' == 모든 기둥의 합이 6이니까 6-x-y로 시작,목표기둥이 어디여도 중간기둥 구할 수 있다고 함 .......
     */
    static void move(int no, int x, int y) {
    	if(no > 1) 
    		move(no-1, x, 6-x-y); // 1.
    	
    	System.out.println(x+" "+y); // 2.
    	
    	if(no > 1)
    		move(no-1, 6-x-y, y); // 3.
    }
}
