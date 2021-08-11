package part1.week5_sort.mtw;

import java.util.Arrays;
import java.util.Scanner;

// 너의 핸들은
public class Sort_15819 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int I = sc.nextInt();
		
		String[] handles = new String[N];
		
		sc.nextLine();
		for(int i=0; i<N; i++) {
			handles[i] = sc.nextLine();
			
//			sortArray(handles, i);	// 시간 224ms 
		}
		
		Arrays.sort(handles);	// 시간 224ms..
		
		System.out.println(handles[I-1]);
		sc.close();
	}
	
	static void sortArray(String[] handles, int index) {
		// 삽입 정렬
		int j=index;
		while(j > 0) {
			char[] prev = handles[j-1].toCharArray();
			char[] now = handles[j].toCharArray();
			
			int min = Math.min(prev.length, now.length);
			for(int k=0; k<min; k++) {
				if(prev[k] < now[k]) {
					return;
				}else if(prev[k] > now[k] || (k==min-1 && now.length == min)) {
					String temp = handles[j];
					handles[j] = handles[j-1];
					handles[j-1] = temp;
					break;
				}
			}
			j--;
		}
	}
}
