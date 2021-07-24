package week11_math.psw;

import java.util.Scanner;
import java.util.function.BiPredicate;
import java.util.function.Supplier;

public class BFS_10026 {
	public static int size;
	public static char[][] section;
	public static int answer = 0;

	public static char none = '0';
	final static char red = 'R';
	final static char blue = 'B';
	final static char green = 'G';
	
	
	public static Supplier<Character> getColor = () -> {
		for (int i = 0; i < section.length; i++) {
			for (int j = 0; j < section.length; j++) {
				if(Character.compare(none, section[i][j]) != 0) return section[i][j];
			}
		}
		return none;
	};
	
	/**
	 * @param  찾을 색, 색 판단 기준 (색맹 여부)
	 * @return 찾은 색이 없다면 false 리턴
	 */
	public static BiPredicate<Character, BiPredicate<Character,Character>> findColor = (color, condition) -> {
		if (color.equals('0')) return false;
		
		
		
		
		return true;
	};
	
	
	
	
	public void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		section = new char[size][];
		
		for (int i = 0; i < size; i++) {
			section[i] = sc.nextLine().toCharArray();
		}
		
		char[][] temp = section.clone();
		
		// 일반인 영역
		while (findColor.test(getColor.get(), (color1, color2) -> color1.equals(color2))) { };
		System.out.print(answer + " ");
		
		answer = 0;
		section = temp;
		
		// 색맹 영역
		while (findColor.test(getColor.get(), (color1, color2) -> {
			if(color1.equals(red) && (color2.equals(red) || color2.equals(blue))) return true;
			if(color1.equals(blue) && (color2.equals(red) || color2.equals(blue))) return true;
			return color1.equals(color2);
		})) { };
		System.out.print(answer);
		
		sc.close();
	}
}
