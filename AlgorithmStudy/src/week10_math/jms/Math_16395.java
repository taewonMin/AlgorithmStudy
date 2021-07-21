package week10_math.jms;

import java.util.Scanner;

public class Math_16395 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();
		if(n==1&&k==1) System.out.println(1);
		else {
			int [][] mid = new int[n][n];
			mid[0][0] =1;
			mid[1][0] = 1;
			mid[1][1] = 1;

			for(int i =1; i< n; i++){
				mid[i][0] = 1;
				mid[i][i] = 1;
				for (int j = 1; j < n; j++){
					if( mid[i-1][j-1] + mid[i-1][j]==0) break;
					mid[i][j] = mid[i-1][j-1] + mid[i-1][j];
					//				System.out.print(mid[i][j] + "\t ");
				}
				//			System.out.println();
			}

			//		System.out.println();
			System.out.println(mid[n-1][k-1]);
		}
	}

	//  public static void main(String[] args) {
	//		Scanner sc = new Scanner(System.in);
	//		int n = sc.nextInt();
	//		int k = sc.nextInt();
	//		
	//		System.out.println("ans = "+combination(n-1,k-1));
	//		System.out.println(count+"count");
	//	}
	//	static int count=0;
	//
	//	public static int combination(int n, int k) {
	//		System.out.println("n , k = "+n+","+k);
	//		if(n==k || k==0) return 1;
	//		int i = combination(n-1,k-1);
	//		int z = combination(n-1,k);
	//		System.out.println("**i , z = "+i +","+z);
	//		count++;
	//		return i+z;
	//		return combination(n-1,k-1) + combination(n-1,k);
	//	}

}

