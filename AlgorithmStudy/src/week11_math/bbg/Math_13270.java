package week11_math.bbg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Math_13270 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		sc.close();

		int[] fibo = new int[N];
		for(int idx = 1 ; idx <= N ; idx++) {
			fibo[idx-1] = fact(idx);
		}
		
		int decoN = N;
		List<Integer> decos = new ArrayList<Integer>();
		//소인수분해
		for(int i = 2 ; decoN > 1;) {
			if(decoN%i == 0) {
				decos.add(i);
				decoN /= i;
			}else {
				i++;
			}
		}

		//닭수
		int[] chickenPerPerson = new int[decos.size()];
		for(int idx = 0 ; idx < decos.size() ; idx++) {
			chickenPerPerson[idx] = fibo[Arrays.binarySearch(fibo, decos.get(idx)) -1];
		}
		
		//최솟값
		System.out.println(chickenPerPerson[0] * decos.get(decos.size()-1));
		//최댓값
		System.out.println(chickenPerPerson[decos.size()-1] * decos.get(0));
		
		
	}
	
	public static int fact(int num) {
		int result = 0;
		
		if(num <= 1) {
			result = num;
		}else {
			result = fact(num-2) + fact(num-1);
		}

		return result;
	}
}
