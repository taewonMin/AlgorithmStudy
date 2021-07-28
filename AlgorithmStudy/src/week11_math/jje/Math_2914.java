   package week11_math.jje;

import java.util.Scanner;

public class Math_2914 {
	public static void main(String[] args) {
		
		//평균값 = (창영이 앨범에 수록된 곡에 포함되어 있는 저작권이 있는 멜로디의 개수) / (앨범에 수록된 곡의 개수)
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();//앨범에 수록된 곡의 개수
		int i = sc.nextInt();//평균값
		
		System.out.println(a*(i-1)+1);
	}
}
