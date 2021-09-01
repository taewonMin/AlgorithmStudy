package part2.week16.bbg;

import java.util.Scanner;
public class DS_1966 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tCase = sc.nextInt();
		for(int cnt = 0 ; cnt < tCase ; cnt++) {
			int N = sc.nextInt();
			Heap heap = new Heap(N+1); // heap 1번index부터 시작해서 +1 
			int target = sc.nextInt();
			for(int cnt2 = 0 ; cnt2 < N ; cnt2++) {
				int item = sc.nextInt();
				if(item != 0) {
					heap.push(item);
				}else {
					if(heap.length() > 0) {
						System.out.println(heap.pop());
					}else {
						System.out.println(0);
					}
				}
			}
			// target은 몇번째에 꺼낼 수 있는지?
			int resultNum = heap.indexOf(target);
			System.out.println(resultNum);
		}
		sc.close();
		
	}
}

//class Heap {
//	int[] heap;
//	int count = 0;
//	int n = 0;
//	public Heap(int size) {
//		heap = new int[size];
//	}
//	
//	void push(int item) {
//		int idx = 0;
//		idx = ++n; // 처음 넣을 때 1부터 들어감. 이후  push 호출 시 마다 ++ 되어 들어감
//		
//		while((idx != 1) && item < heap[idx/2]) { 
//			// ex. 2번방 타겟인데 새로온 템이 1번방템보다 작으면
//			heap[idx] = heap[idx/2]; // 2번방에 1번방템 넣는다.
//			idx = idx/2; // 그 다음 1번방에 값을 담기 위해 idx값 변경
//		}
//		heap[idx] = item; // 비워둔 1번방에 값 담기.
//		count++;
//	}
//	
//	int pop() {
//		int first = heap[1]; // 첫째값 == 제일 큰 값.
//		int temp = heap[count--]; // 들어온값-1 해서 idx로 heap의 값 담아둠
//		int parent = 1; // 제일 큰거 1번방. 부모노드
//		int child = 2; // 그 다음 큰거 2번방. 1번방의 자식노드
//		
//		while(child <= count) { // num의 정체가 뭐야?? 자식노드와 같거나 더 자식일때?
//			if((child < count) && (heap[child] > heap[child+1])) {
//				// 2번방(자식노드)보다 큰 인덱스이면서 -> temp에 더 큰 인덱스의 값이 들어감.
//				// 2번방 값이 3번방 값보다 클 때
//				child++; // 큰값이  더 앞에 있어야해서?
//			}
//			
//			if(temp <= heap[child]) { // 삭제할 값이?? 자식노드보다 작거나 같으면 멈춰!
//				break;
//			}
//			
//			heap[parent] = heap[child]; // 가장 큰값 꺼내고 그 다음 큰 값이 parent에 들어가야함.
//			parent = child; // parent값이 이제 기존 child 있던 인덱스로 변경.
//			child *= 2; // 반쪽만 볼거라서 *2, 왼쪽 자식노드 index
//			
//		}
//		
//		heap[parent] = temp; // 기존 child가 있던 인덱스에 temp 넣음. 
//		return first;
//	}
//	
//	int length() {
//		return count;
//	}
//}
