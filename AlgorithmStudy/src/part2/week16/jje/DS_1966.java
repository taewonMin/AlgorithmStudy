package part2.week16.jje;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class DS_1966 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int testCase = Integer.parseInt(br.readLine());


		for (int i = 0; i < testCase; i++) {

			StringTokenizer st = new StringTokenizer(br.readLine());

			int docNum = Integer.parseInt(st.nextToken());
			int docPlace = Integer.parseInt(st.nextToken());

			LinkedList<Integer> queue = new LinkedList<>();

			st = new StringTokenizer(br.readLine());

			for (int j = 0; j < docNum; j++) {
				queue.addLast(Integer.parseInt(st.nextToken()));
			}
			LinkedList<Integer> cloneQueue = (LinkedList<Integer>) queue.clone();
			Collections.sort(cloneQueue);
			int result = 0;
			for (int j = 0; j < docNum; j++) {
				int pop = cloneQueue.pop();
				if (queue.get(docPlace) == pop) {
					result = j + 1;
				}
				System.out.println(result);
			}

			br.close();

		}
	}
}