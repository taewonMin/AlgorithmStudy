package week1.yjc;

import java.util.Scanner;

public class Math1_1712 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int cnt = 0;
		
        if(B >= C){//이 조건일 때는 손익분기점이 없는경우
          cnt = -1;
        }else{//손익분기점
          cnt = (A/(C-B))+1;  
        }
		
		System.out.println(cnt);
		
	}
}
