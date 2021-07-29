package week12_math.psw;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.function.BiConsumer;
import java.util.function.Function;

public class BFS_2583 {
	static boolean[][] square;
	
	static BiConsumer<Integer[],Integer[]> goVisit = (start,end) ->{
		int x1 = start[0];
		int y1 = start[1];
		int x2 = end[0];
		int y2 = end[1];
		
		for (int x = x1; x < x2; x++) {
			for (int y = y1; y < y2; y++) {
				square[x][y] = true;
			}
		}
	};
	
	static Function<boolean[][],Integer[]> getIndex = (visited) -> {
		for (int i = 0; i < visited.length; i++) {
			for (int j = 0; j < visited[i].length; j++) {
				if (!visited[i][j] && !square[i][j]) {
					visited[i][j] = true;
					return new Integer[]{i,j};
				}
			}
		}
		return null;
	};
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		square = new boolean[m][n];
		int k = sc.nextInt();
		
		for (int i = 0; i < k; i++) {
			goVisit.accept(new Integer[]{sc.nextInt(),sc.nextInt()},new Integer[]{sc.nextInt(),sc.nextInt()});
		}
		
		
		boolean[][] visited = new boolean[m][n];
		Queue<Integer[]> queue = new LinkedList<Integer[]>();
		Integer[] index = getIndex.apply(visited);
		queue.add(index);
		
		List<Integer> answer = new ArrayList<Integer>();
		
		while (index != null) {
			int sectionSize = 0;
			while(!queue.isEmpty()) {
				
				Integer[] indexes = queue.poll();
				int x = indexes[0];
				int y = indexes[1];
				
				// north
				if(x -1 > -1 && !visited[x-1][y] && !square[x-1][y])  {
					queue.add(new Integer[] {x-1,y});
					visited[x-1][y] = true;
				}
				
				// west
				if(y -1 > -1 && !visited[x][y-1] && !square[x][y-1])  {
					queue.add(new Integer[] {x,y-1});
					visited[x][y-1] = true;
				}
				
				// east
				if(x + 1 < n && !visited[x+1][y] && !square[x+1][y])  {
					queue.add(new Integer[] {x+1,y});
					visited[x+1][y] = true;
				}
				
				// south
				if(y + 1 < n && !visited[x][y+1] && !square[x][y+1])  {
					queue.add(new Integer[] {x,y+1});
					visited[x][y+1] = true;
				}
				sectionSize++;
			}
			index = getIndex.apply(visited);
			if(index != null) queue.add(index);
			answer.add(sectionSize);
		}
		System.out.println(answer.size());
		sc.close();
	}
}
