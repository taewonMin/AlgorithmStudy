package week8_sort.psw;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Sort_2358 {
	public static Set<Line> lines = new HashSet<Line>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Point[] points = new Point[sc.nextInt()];

		for (int i = 0; i < points.length; i++) {
			points[i] = new Point(sc.nextInt(), sc.nextInt());
		}
		
		for (int i = 0; i < points.length; i++) {
			for (int j = i+1; j < points.length; j++) {
				AddLine(points[i], points[j]);
			}
		}
		
		
		sc.close();
		System.out.println(lines.size());
	}
	
	public static void AddLine(Point one, Point two) {
		if(two.y - one.y == 0 || two.x - one.x == 0) lines.add(new Line(one, two));
	}
}

class Point {
	public int x;
	public int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class Line {
	public Point one;
	public Point two;
	
	public Line(Point one, Point two) {
		this.one = one;
		this.two = two;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		return this.one.equals(this.two);
	}
}