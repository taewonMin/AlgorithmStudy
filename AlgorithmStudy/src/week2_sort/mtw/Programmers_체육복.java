package week2_sort.mtw;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n-lost.length;	//수업을 들을 수 있는 학생 수
        // 잃어버렷지만 예비복있는사람 제외
        for(int i=0; i<lost.length; i++){	
        	for(int j=0; j<reserve.length; j++){
        		if(lost[i]==reserve[j]){
        			lost[i] = -1;
        			reserve[j] = -1;
        			answer++;
        			break;
        		}
        	}
        }
        
        for(int i=0; i<lost.length; i++){
        	for(int j=0; j<reserve.length; j++){
        		if(lost[i]==reserve[j]-1 || lost[i]==reserve[j]+1){
        			reserve[j] = -1;
        			answer++;
        			break;
        		}
        	}
        }
        
        
// 테스트케이스 7번 왜 안되는지 알 수가 없다ㅏㅏㅏㅏㅏㅏㅏ
//      boolean[] lostStd = new boolean[n];	// 잃어버린 학생 체크 배열
        
//      for(int i=0; i<lost.length; i++){	// 잃어버렸으면 true
//      	lostStd[lost[i]-1] = true;
//      }
        
//        for(int i=0; i<reserve.length; i++){
//        	if(lostStd[reserve[i]-1]==true){	// 여분을 가지고 있는 학생이 잃어버렷으면
//        		lostStd[reserve[i]-1] = false;
//        	}else if(reserve[i]!=1 && lostStd[reserve[i]-2]==true){	// 여분을 가지고 있는 학생의 앞번호	
//        		lostStd[reserve[i]-2] = false;
//        	}else if(reserve[i]!=n && lostStd[reserve[i]]==true){	// 여분을 가지고 있는 학생의 뒷번호
//        		lostStd[reserve[i]] = false;
//        	}else{
//        		continue;
//        	}
//        	answer++;
//        }
        
        return answer;
    }
}