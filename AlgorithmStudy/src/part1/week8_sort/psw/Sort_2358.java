package part1.week8_sort.psw;

import java.util.Scanner;

public class Sort_2358 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int answer = 0;
		
		System.out.println(answer);
		sc.close();
	}
}

class Point {
	public int x;
	public int y;
	
	public Point(int x,int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public boolean equals(Object obj) {
		Point other = (Point)obj;
		if(this.x == other.x && this.y == other.y) return true;
		return false;
	}
}
