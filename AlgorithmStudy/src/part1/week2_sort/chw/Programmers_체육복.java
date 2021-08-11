package part1.week2_sort.chw;

import java.util.ArrayList;
import java.util.List;

public class Programmers_체육복 {
	public static void main(String[] args) {
		int n = 3;
		int[] lost = {3};
		int[] reserve = {1};
		List<Integer> list = new ArrayList<Integer>();
		
		for(int res : reserve) {
			list.add(res);
		}
		
		
		int answer = 0;
        int exception = 0;
        int cnt = 0;
        for(int i = 0; i < lost.length; i++){
            if(lost[i] == 1){
                exception = lost[i] + 1;
            }else if(lost[i] == n){
                exception = lost[i] - 1;
            }
            
                
            for(int res = 0; res < list.size(); res++){
                if(exception == list.get(res)){
                    cnt += 1;
                    list.remove(res);
                    break;
                }
                
                int preNum = lost[i] - 1;
                int postNum = lost[i] + 1;
                
                if(preNum == list.get(res)){
                    cnt += 1;
                    list.remove(res);
                    break;
                }else if(postNum == list.get(res)){
                    cnt += 1;
                    list.remove(res);
                    break;
                }
            }
                
        }
        answer = n - (lost.length - cnt);
        
        System.out.println(answer);
	}

}

