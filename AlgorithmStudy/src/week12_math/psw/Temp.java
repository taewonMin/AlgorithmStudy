package week12_math.psw;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

public class Temp {
	static int n = 0;
	static int m = 0;
	static boolean[][] squ;
	
	public static BiPredicate<Integer[], Integer[]> isRange = (numbers, indexs) ->{
		boolean flag_y = indexs[1] >= Math.min(numbers[0], numbers[2]) && indexs[0] < Math.max(numbers[0], numbers[2]);
		boolean flag_x = indexs[0] >= Math.min(numbers[1], numbers[3]) && indexs[1] < Math.max(numbers[1], numbers[3]);
		return flag_y && flag_x;
	};
	
	
	public static Consumer<Integer[]> init = (numbers) ->{
		for (int i = numbers[1]; i < squ.length; i++) {
			for (int j = 0; j < squ[i].length; j++) {
				//if(isRange.test(numbers, new Integer[] {i,j})) squ[i][j] = true;
			}
		}
	};
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = 5;
		m = 7;
		
		squ = new boolean[n][m];
		
		(Arrays.asList(squ)).forEach((x) -> {
			System.out.println(Arrays.toString(x));
		});
		
		init.accept(new Integer[] {0,2,4,4}) ;
		
		System.out.println();
		(Arrays.asList(squ)).forEach((x) -> {
			System.out.println(Arrays.toString(x));
		});
		
		
		sc.close();
	}
}
