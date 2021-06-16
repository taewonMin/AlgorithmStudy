//package week5;
//
//public class Programmers_truck {
//	public static void main(String[] args) {
//		int bridge_length = 2;
//		int weight = 10; 
//		int[] truck_weights = {7,4,5,6};
//		int accumulateWeight = 0;
//		int cnt = 0;
//		int answer = 0;
//		
//		for(int i = 0; i < truck_weights.length; i++) {
//			accumulateWeight += truck_weights[i]; 
//			if(weight < accumulateWeight){
//				answer += bridge_length + cnt - 1; 
//				cnt = 0;
//				accumulateWeight = 0;
//				i--;
//			}else {
//				if(cnt == bridge_length - 1) {
//					accumulateWeight += weight;
//				}
//				cnt++;
//			}
//			
//			if(i == truck_weights.length -1) {
//				answer+= bridge_length + cnt;
//			}
//		}
//		
//		System.out.println(answer);
//		
//	}
//}
//




//package week5;
//
//import java.util.LinkedList;
//import java.util.Queue;
//
//public class Programmers_truck {
//	public static void main(String[] args) {
//		int bridge_length = 5;
//		int weight = 5; 
//		int[] truck_weights = {2,2,2,2,1,1,1,1,1};
//		int accumulateWeight = 0;
//		int cnt = 0;
//		int answer = 0;
//		
//		Queue<Integer> queue = new LinkedList<>();
//		
//		for(int i = 0; i < truck_weights.length; i++) {
//			accumulateWeight += truck_weights[i];
//			if(weight < accumulateWeight) {
//				for(int j = 0; j < cnt; j++) {
//					accumulateWeight -= queue.peek();
//					queue.remove();
//				}
////				accumulateWeight -= queue.peek();
////				queue.clear();
//				answer += bridge_length + cnt - 1;
//				cnt = 1;
//			}else {
//				cnt++;
//			}
//			if(i == truck_weights.length -1) {
//				answer+= bridge_length + queue.size();
//				break;
//			}
//			queue.add(truck_weights[i]);
//		}
//		
//		System.out.println(answer);
//			
//	}
//}


//package week5;
//
//import java.util.LinkedList;
//import java.util.Queue;
//
//public class Programmers_truck {
//	public static void main(String[] args) {
//		int bridge_length = 5;
//		int weight = 5; 
//		int[] truck_weights = {2,2,2,2,1,1,1,1,1};
//		int accumulateWeight = 0;
//		int cnt = 0;
//		int answer = 0;
//		
//		Queue<Integer> queue = new LinkedList<>();
//		
//		for(int i = 0; i < truck_weights.length; i++) {
//			accumulateWeight += truck_weights[i];
//			if(queue.size() <= bridge_length && accumulateWeight <= weight) {
//				queue.add(truck_weights[i]);
//				cnt++;
//			}else if(weight < accumulateWeight) {
//				while(weight < accumulateWeight) {
//					accumulateWeight -= queue.peek();
//					queue.remove();
//					cnt++;
//				}
//				queue.add(truck_weights[i]);
//			}
//			
//			
//		}
//	}
//}





package week5_sort.chw;

import java.util.LinkedList;
import java.util.Queue;

public class Programmers_트럭 {
	public static void main(String[] args) {
		int bridge_length = 5;
		int weight = 5; 
		int[] truck_weights = {2,2,2,2,1,1,1,1,1};
		int accumulateWeight = 0;
		int cnt = 0;
		int answer = 0;
		
		Queue<Integer> queue = new LinkedList<>();
		for(int i = 0; i < bridge_length; i++) {
			queue.add(0);
		}
		
		
		for(int i = 0; i < truck_weights.length; i++) {
			accumulateWeight += truck_weights[i];
			
			
			
		}
	}
}
















