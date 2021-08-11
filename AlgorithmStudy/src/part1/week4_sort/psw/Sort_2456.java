package part1.week4_sort.psw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Sort_2456 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Candidate> list = new ArrayList<Candidate>();
		
		list.add(new Candidate());
		list.add(new Candidate());
		list.add(new Candidate());
		
		for (int i = 0; i < n; i++) {
			list.get(0).put(sc.nextInt());
			list.get(1).put(sc.nextInt());
			list.get(2).put(sc.nextInt());
		}
		sc.close();

		
		Collections.sort(list);
		int answer = list.get(0).equals(list.get(1)) ? 0 : list.get(0).turn;
		int total = list.get(0).total;
		System.out.println(answer + " " + total);
		
	}
}

class Candidate implements Comparable<Candidate>{
	public static int num = 1;
	
	public int turn;
	public int one = 0;
	public int two = 0;
	public int three = 0;
	public int total = 0;
	
	public Candidate() {
		this.turn = num++;
	}
	
	@Override
	public int compareTo(Candidate obj) {
		if(this.total == obj.total) {
			if(this.three != obj.three) return -Integer.compare(this.three, obj.three);
			if(this.two != obj.two) return -Integer.compare(this.two, obj.two);
		}
		return -Integer.compare(this.total, obj.total);
	}
	
	public void put(int num) {
		total += num;
		if(num == 1) one++;
		if(num == 2) two++;
		if(num == 3) three++;
	}
	
	public boolean equals(Candidate obj) {
		if(obj.total == this.total && obj.three == this.three && obj.two == this.two) return true;
		return false;
	}
}