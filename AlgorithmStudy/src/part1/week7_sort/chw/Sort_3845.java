package part1.week7_sort.chw;

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
			
			boolean bolNx = true;
			boolean bolNy = true;
			
			for(int i = 0; i < nx; i++) {
				if(i > 0) { 
					if(horizontal[i] != horizontal[i-1] + width) {
						bolNx = false;
						break;
					}
				}
			}
			
			for(int i = 0; i < ny; i++) {
				if(i > 0) { 
					if(vertical[i] != vertical[i-1] + width) {
						bolNy = false;
						break;
					}
				}
			}
			
			if(bolNx && bolNy) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
		in.close();
	}
}
