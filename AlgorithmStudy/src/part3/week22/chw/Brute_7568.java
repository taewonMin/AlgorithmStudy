package part3.week22.chw;

import java.util.Scanner;

public class Brute_7568{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		int[][] arr = new int[cnt][2];
		for(int i = 0; i < cnt; i++){
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		for(int i = 0; i < cnt; i++){
			int count = 1;
			for(int j = 0; j < cnt; j++){
				if(i != j && arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]){
					count++;
				}
			}
			System.out.print(count + " ");
		}
		sc.close();
	}
}
