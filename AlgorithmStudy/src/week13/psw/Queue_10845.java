package week13.psw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Queue_10845 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		LinkedList<Integer> queue = new LinkedList<Integer>();
		StringTokenizer st;
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			String str = st.nextToken();

			switch ( str ) {
			case "push":
				queue.add( Integer.parseInt(st.nextToken()) );
				break;
			case "pop":
				System.out.println( queue.isEmpty() ? -1 : queue.removeFirst() );
				break;
			case "size":
				System.out.println( queue.size() );
				break;
			case "empty":
				System.out.println( queue.isEmpty() ? 1 : 0 );
				break;
			case "front":
				System.out.println( queue.isEmpty() ? -1 : queue.getFirst());
				break;
			case "back":
				System.out.println( queue.isEmpty() ? -1 : queue.getLast());
				break;
			default:
				break;
			}
		}
	}
}
