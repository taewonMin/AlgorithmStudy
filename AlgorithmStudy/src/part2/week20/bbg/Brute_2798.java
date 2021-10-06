package part2.week20.bbg;

import java.util.Arrays;
import java.util.Scanner;
/* 12992KB 126ms */
public class Brute_2798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // text length
        int M = sc.nextInt(); // pattern
        
        Integer[] nums = new Integer[N]; // text
        
        for(int idx = 0; idx < N ; idx++) nums[idx] = sc.nextInt();
        sc.close();
        	
        System.out.println(bf(nums, M));
        
    }
    
    static int bf(Integer[] cards, int goal) {
    	Arrays.sort(cards);
    	int sum = 0;
    	
    	for(int c1 =0 ; c1 < cards.length; c1++) { // 목표값보다 커지면 안된다.
    		int temp;
    		for(int c2=c1+1 ; c2 < cards.length ; c2++) {
    			for(int c3=c2+1 ; c3 < cards.length ; c3++) {
    				temp = cards[c1] + cards[c2] + cards[c3];
    				if(temp > goal) break;
    				sum = temp <= goal ? temp > sum ? temp : sum : sum; 
    			}
    		}
    	}
    	return sum;
    }
}
//public class Brute_2798 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int N = sc.nextInt();
//		int M = sc.nextInt();
//		
//		Integer[] nums = new Integer[N];
//		
//		
//		for(int idx = 0; idx < N ; idx++) nums[idx] = sc.nextInt();
//		sc.close();
//		
//		Arrays.sort(nums, Comparator.reverseOrder());
//		
//		int result = 0;
//		int rem = M;
//		for(int cnt=0 ; cnt<N ; cnt++) {
//			int target = M;
//			int sum = 0;
//			int idx = 0;
//			while(cnt+idx < N || target >= nums[cnt+idx]) {
//				target -= nums[cnt+idx];
//				sum += nums[cnt+idx++];
//			}
//			result = target < rem ? sum : result; 
//			rem = target;
//		}
//		
//		System.out.println(result);
//		
//	}
//}
