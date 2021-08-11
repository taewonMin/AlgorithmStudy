package part2.week12_math.psw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;

public class BFS_2583 {
	static int n = 0;
	static int m = 0;
	static boolean[][] squ;
	
	public static BiPredicate<Integer[], Integer[]> isRange = (numbers, indexs) ->{
		int x1 = (n-1) - numbers[1];
		int x2 = (n-1) - numbers[3];
		
		int y1 = numbers[0];
		int y2 = numbers[2];
		
		boolean flag_x = indexs[0] > Math.min(x1, x2) && indexs[0] <= Math.max(x1, x2);

		boolean flag_y = indexs[1] >= Math.min(y1, y2) && indexs[1] < Math.max(y1, y2);
		
		return flag_y && flag_x;
	};
	
	static Function<boolean[][],Integer[]> getIndex = (visited) -> {
		for (int i = 0; i < visited.length; i++) {
			for (int j = 0; j < visited[i].length; j++) {
				if (!visited[i][j] && !squ[i][j]) {
					visited[i][j] = true;
					return new Integer[]{i,j};
				}
			}
		}
		return null;
	};
	
	public static Consumer<Integer[]> init = (numbers) ->{
		for (int i = 0; i < squ.length; i++) {
			for (int j = 0; j < squ[i].length; j++) {
				if(isRange.test(numbers, new Integer[] {i,j})) squ[i][j] = true;
			}
		}
	};
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		
		squ = new boolean[n][m];
		
//		(Arrays.asList(squ)).forEach((x) -> {
//			System.out.println(Arrays.toString(x));
//		});
		
		// 영역 그리기
		int k = sc.nextInt();
		for (int i = 0; i < k; i++) {
			init.accept(new Integer[] {sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt()}) ;
		}
		
		
		(Arrays.asList(squ)).forEach((x) -> { System.out.println(Arrays.toString(x)); });
		boolean[][] visited = new boolean[n][m];
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
				if(x -1 > -1 && !visited[x-1][y] && !squ[x-1][y])  {
					queue.add(new Integer[] {x-1,y});
					visited[x-1][y] = true;
				}
				
				// west
				if(y -1 > -1 && !visited[x][y-1] && !squ[x][y-1])  {
					queue.add(new Integer[] {x,y-1});
					visited[x][y-1] = true;
				}
				
				// east
				if(x + 1 < visited.length && !visited[x+1][y] && !squ[x+1][y])  {
					queue.add(new Integer[] {x+1,y});
					visited[x+1][y] = true;
				}
				
				// south
				if(y + 1 < visited[x].length && !visited[x][y+1] && !squ[x][y+1])  {
					queue.add(new Integer[] {x,y+1});
					visited[x][y+1] = true;
				}
				sectionSize++;
			}
			index = getIndex.apply(visited);
			if(index != null) queue.add(index);
			answer.add(sectionSize);
		}
		
		answer.sort(Integer::compareTo);
		for (int i = 0; i < answer.size(); i++) {
			System.out.print(answer.get(i));
			
			if(i != answer.size()-1) System.out.print(" ");
		}
		sc.close();
	}
}
