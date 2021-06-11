package week5_sort.psw;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Programmers_트럭 {
	public static void main(String[] args) {
		int bridge_length = 2;
		int weight = 10;
		int[] truck_weights = {7,4,5,6};
		int answer = 0;
		
		int totalTime = 0;
		int totalWeight = 0;
		
		LinkedList<Integer> waitingTruck=new LinkedList<Integer>();
		for (int i = 0; i < truck_weights.length; i++) {
			waitingTruck.offer(truck_weights[i]);
		}
		
		LinkedList<Integer> passingTruck=new LinkedList<Integer>(); // 얘네는 오직 다리 길이에만 영향받음
		List<Integer> passedTruck=new ArrayList<Integer>();
		// 1초에 한대씩 다리에 오를 수 있네

		// 자료 셋팅
		
		passingTruck.offer(0);
		totalWeight += truck_weights[0];
		
		
		int i = 1;
		while(true) {
			// 시간 증가
			totalTime++;
			for (int j = 0; j < passingTruck.size(); j++) {
				passingTruck.set(j, passingTruck.get(j)+1);
			}
			
			// 다리는 1초당 하나씩만 지날 수 있으므로 제일 앞에있는 뇨석만 체크해보면 됨
			if(passingTruck.get(0) == bridge_length) {
				passingTruck.poll();
				passedTruck.add(waitingTruck.poll());
				totalWeight -= passedTruck.get(passedTruck.size()-1);
			}
			
			if(passedTruck.size() == truck_weights.length) {
				totalTime++;
				break;
			} // 탈출조건
			
			
			if(i<truck_weights.length) {
				// 다리 위에 올라 갈 수 있다면
				if(totalWeight + truck_weights[i] <= weight) {
					passingTruck.offer(0); // 들어가면 0초부터 시작인듯
					totalWeight += truck_weights[i];
					i++;
				}
			}
			
		}
        answer = totalTime;
        System.out.println(answer);
	}
}

