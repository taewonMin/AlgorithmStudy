package part2.week15.jje;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class DS_10773 {
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	int k = sc.nextInt();

	Stack<Integer> studyStack = new Stack<Integer>();

		for (int i = 0; i < k; i++) {
		int num = sc.nextInt();
		if(num==0) studyStack.pop();
		else studyStack.push(num);
		}

		int result = 0;
		int temp = studyStack.size();

		for (int i = 0; i < studyStack.size(); i++) {
		result+=studyStack.get(i);
		}

		System.out.println(result);
		sc.close();
		}
		}
