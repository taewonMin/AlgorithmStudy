package part4.week36.mtw;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 큐2
public class Queue_18258 {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	LinkedQueue queue = new LinkedQueue();
    	int N = Integer.parseInt(br.readLine());
    	for(int i=0; i<N; i++) {
    		String[] input = br.readLine().split(" ");
    		switch(input[0]) {
    		case "push":
    			queue.push(Integer.parseInt(input[1]));
    			break;
    		case "pop":
    			bw.write(queue.pop()+"\n");
    			break;
    		case "size":
    			bw.write(queue.size()+"\n");
    			break;
    		case "empty":
    			bw.write((queue.isEmpty() ? 1 : 0)+"\n");
    			break;
    		case "front":
    			bw.write(queue.peek()+"\n");
    			break;
    		case "back":
    			bw.write(queue.last()+"\n");
    			break;
    		}
    	}
    			
    	br.close();
    	bw.flush();
    	bw.close();
    }
}

class ArrayQueue{
	private int CAPACITY = 1000;
	private int front;
	private int rear;
	private int size;
	private int[] queue;
	
	ArrayQueue(){
		front = rear = size = 0;
		queue = new int[CAPACITY];
	}
	
	boolean isEmpty() {
		return front == rear;
	}
	
	boolean isFull() {
		return (rear+1)%CAPACITY == front;
	}
	
	int size() {
		return size;
	}
	
	void push(int num) {
		if(isFull()) {
			System.out.println("Full");
			return;
		}
		queue[rear++] = num;
		rear %= CAPACITY;
		size++;
	}
	
	int pop() {
		if(isEmpty()) {
			System.out.println("isEmpty");
			return -1;
		}
		int num = queue[front++];
		front %= CAPACITY;
		size--;
		return num; 
	}
	
	int peek() {
		if(isEmpty()) {
			return -1;
		}
		return queue[front];
	}
}


class QueueNode{
	private int value;
	private QueueNode nextNode;
	
	QueueNode(int num){
		value = num;
		nextNode = null;
	}
	
	int getValue() {
		return value;
	}
	
	QueueNode getNextNode() {
		return nextNode;
	}
	
	void setNextNode(QueueNode nextNode) {
		this.nextNode = nextNode;
	}
}

class LinkedQueue{
	private QueueNode front, rear;
    private int size;
	
	public LinkedQueue() {
		front = rear = null;
	}
	
	boolean isEmpty() {
		return front == null && rear == null;
	}
	
	int size() {
        return size;
		// if(isEmpty()) {
		// 	return 0;
		// }
		// int cnt = 1;
		// QueueNode next = front;
		// while(next.getNextNode() != null) {
		// 	next = next.getNextNode();
		// 	cnt++;
		// }
		// return cnt;
	}
	
	void push(int num) {
		QueueNode node = new QueueNode(num);
		if(isEmpty()) {
			front = node;
			rear = node;
		}else {
			rear.setNextNode(node);
			rear = node;	
		}
        size++;
	}
	
	int pop() {
		if(isEmpty()) {
			return -1;
		}
        if(front == rear){
            rear = null;
        }
		int value = front.getValue();
		front = front.getNextNode();
        size--;
		return value;
	}
	
	int peek() {
		if(isEmpty()) {
			return -1;
		}
		return front.getValue();
	}
	
	int last() {
		if(isEmpty()) {
			return -1;
		}
		return rear.getValue();
	}
}