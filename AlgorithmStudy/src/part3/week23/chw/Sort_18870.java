package part3.week23.chw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class Sort_18870 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(); 
		int cnt = Integer.parseInt(br.readLine());
		int[] arr = new int[cnt];
		int[] cloneArr = new int[cnt];
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		String[] numbers = br.readLine().split(" ");
		for(int i = 0; i < cnt; i++) {
			int num = Integer.parseInt(numbers[i]);
			arr[i] = num;
			cloneArr[i] = num;
		}
		Arrays.sort(cloneArr);
		int idx = 0;
		for(int i = 0; i < cnt; i++) {
			if(!map.containsKey(cloneArr[i])) {
				map.put(cloneArr[i], idx);
				idx++;
			}
		}
		for(int i = 0; i < cnt; i++) {
			sb.append(map.get(arr[i])).append(" ");
		}
		System.out.print(sb.toString());
	}
}

// 시간초과
//public class Sort_18870 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int cnt = sc.nextInt();
//		int[] arr = new int[cnt];
//		int[][] cloneArr = new int[cnt][3];
//		for(int i = 0; i < cnt; i++) {
//			int num = sc.nextInt();
//			arr[i] = num;
//			cloneArr[i][0] = num;
//			cloneArr[i][1] = i;
//		}
//		Arrays.sort(cloneArr, new Comparator<int[]>() {
//			@Override
//			public int compare(int[] o1, int[] o2) {
//				return o1[0] - o2[0];
//			}
//		});   
//		int count = 0;
//		for(int i = 0; i < cnt; i++) {
//			cloneArr[i][2] = count;
//			if(i < cnt - 1 && cloneArr[i][0] != cloneArr[i+1][0]) {
//				count++;
//			}
//		}
//		Arrays.sort(cloneArr, (t1, t2) ->{
//			return Integer.compare(t1[1], t2[1]);
//		});
//		for(int i = 0; i < cnt; i++) {
//			System.out.print(cloneArr[i][2] + " ");
//		}
//		sc.close();
//	}
//}


// 시간초과
//public class Sort_18870 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int cnt = sc.nextInt();
//        int[] arr = new int[cnt];
//        int[] cloneArr = new int[cnt];
//        Map<String, Integer> map = new HashMap<String, Integer>();
//        for(int i = 0; i < cnt; i++) {
//        	int num = sc.nextInt();
//        	arr[i] = num;
//        	cloneArr[i] = num;
//        }
//        sc.close();
//        Arrays.sort(cloneArr);
//        int idx = 0;
//        for(int i = 0; i < cnt; i++) {
//        	if(map.get(String.valueOf(cloneArr[i])) == null) {
//        		map.put(String.valueOf(cloneArr[i]), idx);
//        		idx++;
//        	}
//        }
//        for(int i = 0; i < cnt; i++) {
//        	System.out.print(map.get(String.valueOf(arr[i])) + " ");
//        }
//    }
//}
