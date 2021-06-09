package week4_sort.jms;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Sort_18310 {

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			
			ArrayList< Integer> arr = new ArrayList<>();
			
			
			for (int i = 0; i < n; i++) {
				arr.add(sc.nextInt());
			}
			
			arr.sort(null);
			
			int size = arr.size();
			int index = 0;
			
			if (size %2 == 0) index = size /2 ; 
			else index = size /2 -1;
			
			int answer = arr.get(index-1);
			
			
			System.out.println(answer);
		
	}
		

}
