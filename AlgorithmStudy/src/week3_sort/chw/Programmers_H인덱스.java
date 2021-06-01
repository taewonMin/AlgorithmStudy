package week3_sort.chw;

public class Programmers_H인덱스 {
	public static void main(String[] args) {
		// 프로그래머스에서 정답으로 처리가 되었긴하지만 {0,1,1}일 때 h-index가 0으로 나온다. -- 1이어야함
		int[] citations = {0,1,1};
		
		int answer = 0;
        
        for(int h = 0; h < citations.length+1; h++){
            int hUp = 0;
            int hDown = 0;
            
            for(int citation = 0; citation < citations.length; citation++){
                if(citations[citation] >= h){
                    hUp += 1;
                }else{
                    hDown += 1;
                }
            }
            int totalTreatise = citations.length;
            int remainder = totalTreatise - h;
            
            // 일반적인 경우
            if(h == hUp && hDown <= h && remainder <= h){
                answer = h;   
            }
            
            // 숫자가 모두 같을 경우
            if(h != 0 && h < hUp && h > hDown) {
            	answer = h;
            }
             
        }
        
        System.out.println(answer);
	}
}

