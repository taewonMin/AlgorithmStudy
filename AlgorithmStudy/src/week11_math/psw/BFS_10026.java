package week11_math.psw;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class BFS_10026 {
	public static int size;
	public static char[][] section;
	public static int answer = 0;
	public static char none = '0';

	final static char red = 'R';
	final static char green = 'G';
	final static char blue = 'B';
	
	
	static BiPredicate<Character, Character> nomal = Character::equals;

	static BiPredicate<Character, Character> unnomal = (one, two) ->{
		boolean flag = false;
		
		if((one.equals(red) || one.equals(green)) 
				&& (two.equals(red) || two.equals(green))) {
			flag = true;
		}else {
			flag = one.equals(two);
		}
		
		return flag;
	};

	private static void addQueue(Integer[] integers, boolean[][] visited, Queue<Integer[]> queue) {
		visited[integers[0]][integers[1]] = true;
		queue.add(integers);
	}

	private static char getColor(Integer[] integers, boolean[][] visited) {
		visited[integers[0]][integers[1]] = true;
		return section[integers[0]][integers[1]];
	}
	
	static Function<BiPredicate<Character, Character>, Integer> findColor = (condition) -> {
		boolean[][] visited = new boolean[size][size];
		int total = 0;
		char target = none;
		
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				
				if(!visited[i][j]) {

					target = getColor(new Integer[] {i,j},visited);
					Queue<Integer[]> queue = new LinkedList<Integer[]>();
					queue.add(new Integer[] {i,j});
					
					

					while (!queue.isEmpty()) {
						Integer[] indexes = queue.poll();
						int x = indexes[0];
						int y = indexes[1];

						// north
						if(x -1 > -1 && !visited[x-1][y] &&  condition.test(target, section[x-1][y]))  {
							addQueue(new Integer[] {x-1,y},visited, queue);
						}
						
						// west
						if(y -1 > -1 && !visited[x][y-1] &&  condition.test(target, section[x][y-1]))  {
							addQueue(new Integer[] {x,y-1},visited, queue);
						}
						
						// east
						if(x + 1 < size && !visited[x+1][y] && condition.test(target, section[x+1][y]))  {
							addQueue(new Integer[] {x+1,y},visited, queue);
						}
						
						// south
						if(y + 1 < size && !visited[x][y+1] &&  condition.test(target, section[x][y+1]))  {
							addQueue(new Integer[] {x,y+1},visited, queue);
						}
						
					};
					total++;
					target = none;
				}
			}
		}
		
		return total;
	};

	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		section = new char[size][];
		for (int i = 0; i < section.length; i++) { section[i] = sc.next().toCharArray(); }
		sc.close();
		
		int count1 = findColor.apply(nomal);
		int count2 = findColor.apply(unnomal);
		
		System.out.println(count1 + " " + count2);
	}

}
