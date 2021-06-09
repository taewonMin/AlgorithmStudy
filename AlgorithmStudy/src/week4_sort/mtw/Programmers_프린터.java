package week4_sort.mtw;

import java.util.LinkedList;

class Programmers_프린터 {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        LinkedList<Integer> queue = new LinkedList<>();
        for(int i : priorities) {
        	queue.offer(i);
        }
        
        while(location != -1) {
        	boolean pass = true;
        	int temp = queue.poll();
        	
        	for(int i=0; i<queue.size(); i++) {
        		if(temp < queue.get(i)) {
        			queue.offer(temp);
        			pass = false;
        			break;
        		}
        	}
        	location--;
        	if(pass) {	// 나가면 -> location--
        		answer++;
        	}else { // 못나가면 -> location-- , 0번째면 size-1
        		if(location == -1) {
        			location = queue.size()-1;
        		}
        	}
        }
        
        return answer;
    }
}