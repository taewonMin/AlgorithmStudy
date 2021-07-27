package week11_math.phk;

import java.util.Scanner;

//18376kb	256ms
public class Math_13270 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.close();
		 
		/* 
		 * 
		 * 13 	= 2*5+3 => 5+2 =7(min)
		 * 		= 3*3 +2+2 => 2*(13/3-1) +1+1 = 8 (max)
		 * 
		 * 14 	= 2*7 => 7(min)
		 * 		= 3*4 +2 => 2*(14/3) +1 =9 (max)
		 * 
		 * 21 	= 3*7 => 2*7 = 14(max)
		 * 		= 2*9 + 3 => 9+2 = 11 = 21%2 + 1 (min)
		 * 
		 * 2인	0.5닭/인 (min)
		 * 3인	0.666닭/인 (max)
		 * 5인	0.6닭/인
		 * 8인	0.625닭/인
		 * ...
		 * 
		 * 인원수(x)가 커질수록 닭/인 값이 진동하며 한 값으로 수렴한다.
		 * 최솟값은 2로 나눈 나머지에 달렸고,
		 * 최댓값은 3으로 나눈 나머지에 달렸다.
		 * 
		 * 최소값 => 	x%2==0? x/2:x/2+1;
		 * 
		 * 최대값 => 	x%3==0? x/3*2
		 * 		   	x%3==1? (x/3-1)*2 +2
		 * 			x$3==2? x/3*2 +1
		 * 			
		 */
		
		
		int min = n%2==0? n/2:n/2+1;
		int max = 0;
		
		switch (n%3) {
		case 1:
			max = (n/3-1)*2 +2;
			break;

		case 2:
			max = n/3*2 +1;
			break;

		default:
			max = n/3 *2;
			break;
		} 
		
		System.out.println(min + " " + max);
		
		
		
	}
}
