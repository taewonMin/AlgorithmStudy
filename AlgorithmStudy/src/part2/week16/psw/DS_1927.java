package part2.week16.psw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class DS_1927 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> list  = new PriorityQueue<>();
		
		for (int i = 0; i < n; i++) {
			int x = Integer.parseInt(br.readLine());
			if(x == 0) {
				System.out.println(list.isEmpty() ? 0 : list.poll() );
			}else {
				list.offer(x);
			}
		}
		
		br.close();
	}
}
