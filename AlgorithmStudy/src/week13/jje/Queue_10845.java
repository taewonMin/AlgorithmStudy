package week13.jje;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Queue_10845 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		Queue<Integer> queue = new LinkedList<>();

		int commandNum = sc.nextInt();

		for (int i = 0; i < commandNum; i++){
			String command = sc.next();
			if("push".equals(command)){
				queue.add(sc.nextInt());
			}else if ("pop".equals(command)){
				if(queue.isEmpty()) System.out.println(-1);
				else System.out.println(queue.remove());
			}else if ("size".equals(command)){
				System.out.println(queue.size());
			}else if ("empty".equals(command)){
				if(queue.isEmpty()) System.out.println(1);
				else System.out.println(0);
			}else if ("front".equals(command)){
				if(queue.isEmpty()) System.out.println(-1);
				else System.out.println(queue.peek());
			}else if ("back".equals(command)){
				if(queue.isEmpty()) System.out.println(-1);
				else back(queue);
			}
		}

		sc.close();
	}

	static ArrayList<Integer> tempQueue = new ArrayList<>();

	static void back(Queue<Integer> queue){
		for (int i = 0; i < queue.size(); i++){
			tempQueue.add(queue.remove());
			if(i == queue.size()-1) System.out.println(queue.peek());
		}

		for (int i = 0; i < tempQueue.size(); i++){
			queue.add(tempQueue.get(i));
		}
	}
}