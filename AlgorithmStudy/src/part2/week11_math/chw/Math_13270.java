package part2.week11_math.chw;

import java.util.Scanner;

public class Math_13270 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int people = in.nextInt();
		
		int max_chicken = 0;
		int min_chicken = people % 2 == 0 ? people / 2 : people / 2 + 1;
		
		if(people % 3 == 0 || people % 3 == 1) {
			max_chicken = 2 * (people / 3);
		}else {
			max_chicken = 2 * (people / 3) + 1;
		}
		System.out.println(min_chicken + " " + max_chicken);
		in.close();
	}
}
