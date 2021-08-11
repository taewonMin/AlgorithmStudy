package part1.week7_sort.psw;

import java.util.Arrays;
import java.util.Scanner;

public class Sort_3845 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		while (true) {
			float[] nx = new float[sc.nextInt()];
			float[] ny = new float[sc.nextInt()];
			float width = sc.nextFloat();
			if(nx.length == 0 && ny.length ==0 && width == 0 ) break;
			
			boolean answer = true;
			
			for (int i = 0; i < nx.length; i++) {
				nx[i] = sc.nextFloat();
			}
			for (int i = 0; i < ny.length; i++) {
				ny[i] = sc.nextFloat();
			}
			
			Arrays.sort(nx);
			Arrays.sort(ny);
			
			for (int i = 0; i < nx.length; i++) {
				if(nx[i] > (75/nx.length)*(i+1) + width/2 || nx[i] < (75/nx.length)*(i+1) -width/2) {
					answer = false;
					break;
				}
			}
			
			if(!answer) {
				for (int i = 0; i < ny.length; i++) {
					if(ny[i] > (100/ny.length)*(i+1) + width/2 || ny[i] < (100/ny.length)*(i+1) -width/2) {
						answer = false;
						break;
					}
				}
			}
			
			System.out.println(answer ? "YES" : "NO");
		}
		
		sc.close();
	}
}
