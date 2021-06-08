package week4_sort.bbg;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Sort_2456 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // 학생수
		
		int[] arr1 = new int[N], arr2 = new int[N], arr3 = new int[N];
		
		int sum1 = 0, sum2 = 0, sum3 = 0;
		Map<Integer, Integer> sumMap = new HashMap<Integer, Integer>();
		
		int firCnt1 = 0, firCnt2 = 0, firCnt3 = 0;
		Map<Integer, Integer> firCntMap = new HashMap<Integer, Integer>();
		
		int secCnt1 = 0, secCnt2 = 0, secCnt3 = 0;
		Map<Integer, Integer> secCntMap = new HashMap<Integer, Integer>();

		for(int idx=0; idx<N; idx++) {
			arr1[idx]=sc.nextInt();
			arr2[idx]=sc.nextInt();
			arr3[idx]=sc.nextInt();
			
			if(arr1[idx] == 3) {
				firCnt1++;
			}else if(arr1[idx] == 2) {
				secCnt1++;
			}
			if(arr2[idx] == 3) {
				firCnt2++;
			}else if(arr2[idx] == 2) {
				secCnt2++;
			}
			if(arr3[idx] == 3) {
				firCnt3++;
			}else if(arr3[idx] == 2) {
				secCnt3++;
			}
			
			sum1 += arr1[idx];
			sum2 += arr2[idx];
			sum3 += arr3[idx];
		}
		
		sumMap.put(1, sum1);
		sumMap.put(2, sum2);
		sumMap.put(3, sum3);
		
		firCntMap.put(1, firCnt1);
		firCntMap.put(2, firCnt2);
		firCntMap.put(3, firCnt3);
			
		secCntMap.put(1, secCnt1);
		secCntMap.put(2, secCnt2);
		secCntMap.put(3, secCnt3);
		
		List<Map.Entry<Integer, Integer>> entries = sumMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).collect(Collectors.toList());
		
		for(Map.Entry<Integer, Integer> entry : entries) {
			System.out.println("key : " + entry.getKey() + ", value : " + entry.getValue());
		}
		
		int selectedHubo = 0;
		int bestScore = 0;
		
		if(entries.get(0).getValue() == entries.get(1).getValue()) {
			if(firCntMap.get(entries.get(0).getKey()) == firCntMap.get(entries.get(1).getKey())) {
				if(secCntMap.get(entries.get(0).getKey()) == secCntMap.get(entries.get(1).getKey())) {
					selectedHubo = 0;
					bestScore = entries.get(0).getValue();
				}else if(secCntMap.get(entries.get(0).getKey()) > secCntMap.get(entries.get(1).getKey())) {
					selectedHubo = entries.get(0).getKey();
					bestScore = entries.get(0).getValue();
				}else {
					selectedHubo = entries.get(1).getKey();
					bestScore = entries.get(1).getValue();
				}
				
			}else if(firCntMap.get(entries.get(0).getKey()) > firCntMap.get(entries.get(1).getKey())){
				selectedHubo = entries.get(0).getKey();
				bestScore = entries.get(0).getValue();
			}else {
				selectedHubo = entries.get(1).getKey();
				bestScore = entries.get(1).getValue();
			}
		}else{
			selectedHubo = entries.get(0).getKey();
			bestScore = entries.get(0).getValue();
		}
		
		System.out.println(selectedHubo + " " + bestScore);
	}
}
