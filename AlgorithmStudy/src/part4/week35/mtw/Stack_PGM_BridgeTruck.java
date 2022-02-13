package part4.week35.mtw;

import java.util.LinkedList;

public class Stack_PGM_BridgeTruck {
    public static void main(String[] args) {
        System.out.println(solution(5, 5, new int[]{2, 2, 2, 2, 1, 1, 1, 1, 1}));
    }

    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int totalWeight = 0;	// 다리위 트럭들의 무게
        int cnt = 0;    // 다리를 건넌 트럭 수
        int nextIndex = 0; // 다음 트럭 번호
        LinkedList<int[]> bridge = new LinkedList<>();	// 다리 큐 ([트럭무게, 경과시간])

        while(cnt < truck_weights.length){
            // 1초 마다 반복
            answer++;

            // 다음 트럭이 들어갈 수 있는지 체크
            if(nextIndex < truck_weights.length && totalWeight + truck_weights[nextIndex] <= weight){
                totalWeight += truck_weights[nextIndex];
                bridge.offer(new int[]{truck_weights[nextIndex++], 0});
            }

            // 다리위의 트럭들의 이동시간 +1
            for(int i=0; i<bridge.size(); i++){
                bridge.get(i)[1] += 1;
            }

            // 다리를 지났으면 빼기
            if(bridge.peek()[1] == bridge_length){
                totalWeight -= bridge.poll()[0];
                cnt++;
            }
        }
        return answer+1;
    }
}