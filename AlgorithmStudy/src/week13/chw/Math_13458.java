package week13.chw;

import java.util.Scanner;

public class Math_13458 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		sc.close();
	}
}
/*
파이썬
cnt, exam_cnt, viewer = int(input()), input().split(), input().split()

total_viewer = int(viewer[0])
bu_viewer = int(viewer[1])

result = cnt
for exam in exam_cnt:
    result += (int(exam) - total_viewer) // bu_viewer if (int(exam) - total_viewer) % bu_viewer == 0 else (int(exam) - total_viewer) // bu_viewer + 1
print(result) 
*/