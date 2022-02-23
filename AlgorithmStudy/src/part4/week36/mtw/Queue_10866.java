package part4.week36.mtw;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 덱
public class Queue_10866 {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
        LinkedDeque deque = new LinkedDeque();
        int N = Integer.parseInt(br.readLine());
    	for(int i=0; i<N; i++) {
            String[] input = br.readLine().split(" ");
    		switch(input[0]){
                case "push_front":
                    deque.push_front(Integer.parseInt(input[1]));
                    break;
                case "push_back":
                    deque.push_back(Integer.parseInt(input[1]));
                    break;
                case "pop_front":
                    bw.write(deque.pop_front()+"\n");
                    break;
                case "pop_back":
                    bw.write(deque.pop_back()+"\n");
                    break;
                case "size":
                    bw.write(deque.size()+"\n");
                    break;
                case "empty":
                    bw.write((deque.isEmpty() ? 1 : 0)+"\n");
                    break;
                case "front":
                    bw.write(deque.front()+"\n");
                    break;
                case "back":
                    bw.write(deque.back()+"\n");
                    break;
            }
    	}
        
    	br.close();
    	bw.flush();
    	bw.close();
    }
}

class DequeNode{
	private int value;
	private DequeNode prevNode;
	private DequeNode nextNode;
	
	DequeNode(int num){
		value = num;
		prevNode = nextNode = null;
	}
	
	int getValue() {
		return value;
	}

	DequeNode getPrevNode(){
        return prevNode;
    }
    void setPrevNode(DequeNode prevNode){
        this.prevNode = prevNode;
    }

	DequeNode getNextNode() {
		return nextNode;
	}
	void setNextNode(DequeNode nextNode) {
		this.nextNode = nextNode;
	}
}

class LinkedDeque{
	private DequeNode front, rear;
    private int size;
	
	public LinkedDeque() {
		front = rear = null;
	}
	
	boolean isEmpty() {
		return front == null && rear == null;
	}
	
	int size() {
        return size;
	}
	
	void push_front(int num) {
		DequeNode node = new DequeNode(num);
		if(isEmpty()) {
			front = node;
			rear = node;
		}else {
            node.setNextNode(front);
            front.setPrevNode(node);
            front = node;
		}
        size++;
	}

    void push_back(int num) {
		DequeNode node = new DequeNode(num);
		if(isEmpty()) {
			front = node;
			rear = node;
		}else {
            node.setPrevNode(rear);
            rear.setNextNode(node);
            rear = node;
		}
        size++;
	}
	
	int pop_front() {
		if(isEmpty()) {
			return -1;
		}
        if(front == rear){
            rear = null;
        }
		int value = front.getValue();
        DequeNode nextNode = front.getNextNode();
        if(nextNode != null){
            nextNode.setPrevNode(null);
        }
		front = nextNode;
        size--;
		return value;
	}

    int pop_back() {
		if(isEmpty()) {
			return -1;
		}
        if(front == rear){
            front = null;
        }
		int value = rear.getValue();
        DequeNode prevNode = rear.getPrevNode();
        if(prevNode != null){
            prevNode.setNextNode(null);
        }
		rear = prevNode;
        size--;
		return value;
	}
	
	int front() {
		if(isEmpty()) {
			return -1;
		}
		return front.getValue();
	}
	
	int back() {
		if(isEmpty()) {
			return -1;
		}
		return rear.getValue();
	}
}
