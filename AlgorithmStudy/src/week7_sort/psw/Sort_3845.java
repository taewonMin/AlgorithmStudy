package week7_sort.psw;

import java.util.Scanner;

public class Sort_3845 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		while (true) {
			float[] nx = new float[sc.nextInt()];
			float[] ny = new float[sc.nextInt()];
			float width = sc.nextFloat();
			
			for (int i = 0; i < nx.length; i++) {
				nx[i] = sc.nextFloat();
			}
			for (int i = 0; i < ny.length; i++) {
				ny[i] = sc.nextFloat();
			}
			
			
			
			if(nx.length == 0 && ny.length ==0 && width == 0 ) break;
		}
		
		sc.close();
	}
}
