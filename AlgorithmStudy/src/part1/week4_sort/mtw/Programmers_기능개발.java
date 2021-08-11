package part1.week4_sort.mtw;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Programmers_기능개발 {
    public int[] solution(int[] progresses, int[] speeds) {
    	//큐에 작업별 남은 완료일수 넣기
        LinkedList<Integer> queue = new LinkedList<>();
        for(int i=0; i<progresses.length; i++) {
        	int tempDay = (100-progresses[i])/speeds[i];
        	int remain = (100-progresses[i])%speeds[i];  
        	int day = remain > 0 ? tempDay+1 : tempDay;
        	queue.offer(day);
        }
        //한꺼번에 배포되는 작업 개수 세기
        List<Integer> answerList = new ArrayList<>();
        while(!queue.isEmpty()) {
        	int cnt = 1;
        	int out = queue.poll();
        	while(queue.peek()!=null) {
        		if(out >= queue.peek()) {
        			queue.pop();
        			cnt++;
        		}else {
        			break;
        		}
        	}
        	answerList.add(cnt);
        }
        //list를 배열로 변환
        int[] answer = new int[answerList.size()];
        for(int i=0; i<answerList.size(); i++) {
        	answer[i] = answerList.get(i);
        }
        return answer;
    }
}