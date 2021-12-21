package part3.week29.phk;

import java.util.Scanner;

// 57484kb	1428ms
public class Math_9020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] test_case = new int[t];
        for(int i = 0; i < t; i++) {
        	test_case[i] = sc.nextInt();
        }
        sc.close();

        for (int i : test_case) {
        	goldBach(i);
			
		}
    }
    
    /**
     * n의 골드바흐 파티션 출력 메서드
     * @param n
     */
    public static void goldBach(int n) {
    	int x = n/2;
    	while(x > 1) {
    		if(prime(x) && prime(n - x)) {
    			System.out.printf("%d %d\n", x, (n - x));
    			break;
    		}else {
    			x--;
    		}
    	}
    }
    
    /**
     * 소수 판별하는 메서드
     * @param 소수 판별할 수 x
     * @return 소수 여부
     */
    public static boolean prime(int x) {
    	
    	for (int i = 2; i < x; i++) {
			if(x % i == 0) return false;
		}
    	return true;
    }
}
