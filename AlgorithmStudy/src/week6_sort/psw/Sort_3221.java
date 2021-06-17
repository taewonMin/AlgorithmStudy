package week6_sort.psw;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sort_3221 { // 모르겠다 너무 어렵다 처음 위치에서 다음 위치 친구들이 한계인거같은데 모르겠다 난 모르겠따 정말
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int t = sc.nextInt();
		int n = sc.nextInt();
		List<Ant> list = new ArrayList<Ant>();
		setInit(n, list, sc);
		
		for (int i = 0; i < t; i++) {
			antGo(list,l);
		}
		
		list.sort((Ant a, Ant b) -> Integer.compare(a.order, b.order));
		
	
		sc.close();
	}
	
	
	
	public static void antGo(List<Ant> list, int l) {
		for (int i = 0; i < list.size(); i++) {
			Ant ant = list.get(i);

			if (ant.location == 1 && !ant.direction) { // 왼쪽 벽
				ant.location  = ant.location++;
				ant.direction = !ant.direction;
				
			}else if(ant.location == l-1 && ant.direction) { // 오른쪽 벽
				ant.location  = ant.location--;
				ant.direction = !ant.direction;
			}
			
			
			ant.location = ant.direction ? ant.location++ : ant.location--;
			
			
			
		}
		
	}

	public static void setInit(int n, List<Ant> list, Scanner sc) {
		for (int i = 0; i < n; i++) {
			list.add(new Ant(sc.nextInt(), sc.next()));
		}
	}
}

class Ant {
	public static int num = 1;
	public int order = 0;
	public int location = 0;
	public boolean direction;
	
	public Ant(int location, String direction) {
		this.order = num++;
		this.location = location;
		this.direction = direction.equals("D") ? true : false;
	}
}
