package part3.week30.bbg;
/*
 * 두 점 사이의 거리가 최단거리.
 * r1 + r2 가 
 * 	1. 최단거리와 같으면 = 1
 *  2. 최단거리보다 작고, 두 점이 같지 않으면 = 2
 *  3. 최단거리보다 크면 == 0
 *  4. 두 점이 같고 r1 == r2 = -1 (위에서 먼저 제거)
 *  5. 두 점이 같고 r1 != r2 =  0 (위에서 먼저 제거)
 * */

import java.util.Arrays;
import java.util.Scanner;

public class Math_1002 {
	
	static StringBuffer sb = new StringBuffer();
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[][] jo;
        int[][] baek;
        int[][] ryu;
        for(int i = 0 ; i < T ; i++) {
        	jo = new int[T][2];
        	baek = new int[T][2];
        	ryu = new int[T][2];
        	int minD = 0; // 두 거리의 합
        	
        	jo[i][0] = sc.nextInt();
        	jo[i][1] = sc.nextInt();
        	ryu[i][0] = sc.nextInt();
        	minD += ryu[i][0];
        	
        	baek[i][0] = sc.nextInt();
        	baek[i][1] = sc.nextInt();
        	ryu[i][1] = sc.nextInt();
        	minD += ryu[i][1];

        	if(Arrays.deepEquals(jo, baek)) { // 두 점이 같을 때
        		
        		if(ryu[i][0] == ryu[i][1]) { // 거리가 같으면 같은 원 그리며 무한대
        			sb.append("-1\n");
        		}else { // 거리가 다르면 만나지 않음
        			sb.append("0\n");
        		}
        		continue;
        	}

        	// 두 점 사이의 거리 구하기
        	int byun1 = Math.abs(jo[i][0] - baek[i][0]);
        	int byun2 = Math.abs(jo[i][1] - baek[i][1]);
        	double r = Math.sqrt(Math.pow(byun1, 2) + Math.pow(byun2, 2));
        	
        	if(minD == r) {
        		sb.append("1\n");
        	}else if(minD < r) {
        		sb.append("0\n");
        	}else {
        		sb.append("2\n");
        	}
        }
        sc.close();
        System.out.println(sb);
    }
}
