package week6_sort.psw;

public class Programmers_타깃넘버 {
	public static void main(String[] args) {
		int[] numbers = {1,1,1,1,1};
		int target = 3;
		int answer = 0;

		int count = 0;
		for (int i = 1; i < numbers.length+1; i++) {
			if(i*numbers[0] == target) {
				count = i;
				break;
			}
		}
		
		if(count == 0 || (numbers.length - count)%2 != 0) {
			answer = 0;
		}else {
			answer = factorial(numbers.length)/(factorial(numbers.length-count/2)*factorial(numbers.length - (numbers.length-count/2)));
		}
		System.out.println(answer);
	}
	
	public static int factorial(int num) {
		int a = 1;
		
		for (int i = 1; i < num+1; i++) {
			a *= i;
		}
		
		return a;
	}
}

