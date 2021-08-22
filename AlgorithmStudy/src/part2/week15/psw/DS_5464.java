package part2.week15.psw;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

public class DS_5464 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		List<Parking> parkingZone = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			parkingZone.add(new Parking(i, sc.nextInt()));
		}
		
		int[] price = new int[m];
		for (int i = 0; i < price.length; i++) {
			price[i] = sc.nextInt();
		}
		
		long answer = 0;
		Queue<Integer> waiting = new LinkedList<Integer>();
		Map<Integer, Parking> onParking = new HashMap<Integer, Parking>();
		for (int i = 0; i < (m*2); i++) {
			int car = sc.nextInt();
			
			if(car > 0) {
				if(!parkingZone.isEmpty()) {
					onParking.put(car, parkingZone.remove(0));				
				}else {
					waiting.add(car);
				}
				
			}else {
				car *= -1;
				Parking zone = onParking.remove(car);
				answer += price[car-1] * zone.rate;
				if(!waiting.isEmpty()) {
					onParking.put(waiting.poll(), zone);
				}else {
					parkingZone.add(zone);
					parkingZone.sort( (a,b) -> Integer.compare(a.index, b.index) );
				}
			}
		}
		
		System.out.println(answer);
		sc.close();
	}
	
}
class Parking{
	int index;
	int rate;
	
	public Parking(int idx , int rate) {
		this.index = idx;
		this.rate = rate;
	}
}
