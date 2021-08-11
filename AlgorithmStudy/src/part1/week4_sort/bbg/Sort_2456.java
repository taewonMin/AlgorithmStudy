package part1.week4_sort.bbg;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

// 회장
/*
총점이나 갯수를 구할 때 그 값이 어떤 후보의 값인지 꼬리표처럼 붙여놓고 싶어서 각 값을 Map에 담았습니다.

*/
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
		//이후 Map객체를 entry로 바꿔서 value 기준 내림차순 정렬시켰고, 그것을 List에 담아서 0번값이 가장 큰 값을 갖도록 했습니다.
		//총점으로만 비교하면 0번방 1번방 값을 비교하면 되는데, 이 때 두 값이 같을 경우, 두 값의 3점갯수를 얻기 위해 3점갯수를 담은 맵 객체에 0번방의 키와 1번방의 키를 넣고 갯수를 꺼냈습니다.
		//이렇게 3점을 비교했는데도 같은 값이 있을 경우 2점갯수도 같은 방법으로 비교 후 결과 확인
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
