package week7_sort.chw;

import java.util.Arrays;
import java.util.Scanner;

public class Sort_3845 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int nx = 0;
		int ny = 0;
		float width = 0;
		
		while(true) {
			nx = in.nextInt();
			ny = in.nextInt();
			width = in.nextFloat();
			
			if(nx == 0 && ny == 0 && width == 0.0) {
				break;
			}
			
			float[] horizontal = new float[nx];
			float[] vertical = new float[ny];

			for(int i = 0; i < nx; i++) {
				horizontal[i] = in.nextFloat();
			}
			
			for(int i = 0; i < ny; i++) {
				vertical[i] = in.nextFloat();
			}
			
			Arrays.sort(horizontal);
			Arrays.sort(vertical);
			// 0번째 += width 총합 비교하면 될듯
		}
		
		in.close();
	}
}
