package part4.week34.mtw;

import java.util.Arrays;

public class Greedy_PGM_Boat {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {70,80,50}, 101));
    }
    
    public static int solution(int[] people, int limit) {
    	int answer = 0;
    	
    	Arrays.sort(people);
    	
    	int firstIndex = 0;
    	int lastIndex = people.length-1;
    	while(firstIndex <= lastIndex) {
				// 몸무게가 limit의 반보다 작거나 같아지면 남은길이/2만큼 보트 수 증가
    		if(limit/2 >= people[lastIndex]) {
    			int remain = lastIndex-firstIndex+1;
    			answer += remain/2 + (remain%2==0 ? 0 : 1);
    			break;
    		}
    		if(people[firstIndex] + people[lastIndex] <= limit) {
    			firstIndex++;
    		}
    		lastIndex--;
    		answer++;
    	}
    	
    	return answer;
    }
}
