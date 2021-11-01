package part3.week24.bbg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/*
 * 알파벳 소문자로 이뤄진 N개의 문자 들어오면 아래 조건에 따라 정렬
 * 1. 길이가 짧은 것부터
 * 2. 길이 같으면 사전순으로
 * 
 * 풀이방식
 * 1. 일단 다 받아서 list에 넣고 길이 확인 --- 어떻게 할까 하나씩 get.length 해?
 * 		 후 Collections.sort ... 
 * 2. 길이 확인 후 하나하나 비교하기 ?? 단어의 첫 글자가 사전순으로 정렬되어있어야. 
 *  -> 하나 뜯어서 비교해서 변경? 정렬방법 평소 안쓰던거 써보기
 *  
 *  퀵정렬은 모든 수가 유일하다는 가정 하에 사용하는 것?
 *  조건에 변화 준다면 그렇지 않아도 쓸 수 있겠지. 대부분의 프로그래밍 정렬의 근간이 되는게
 *  퀵정렬이라고 하니까.
 *  조건에 일단 길이 보고 비교하고 
 *  중복제거 필요함. -> set으로 해결
 *  left rigth 잘못둬서 변경 후 길이정렬 됐지만 사전순 수정 필요
 */
public class Sort_1181 {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int N = Integer.parseInt(br.readLine());
    	Set<String> set = new HashSet<>(); // 중복제거를 위해 set에 담음
    	
    	for(int cnt = 0 ; cnt < N ; cnt++) {
    		set.add(br.readLine());
    	}
    	
    	br.close();
    	
    	String[] arr = set.toArray(new String[0]);
    	
    	// 퀵정렬
    	sort(arr,0,arr.length-1);
    	
    	// 출력
    	StringBuffer sb = new StringBuffer();
    	for (String item : arr) {
			sb.append(item + "\n");
		}
    	System.out.println(sb);
    }
    
    static void sort(String[] arr, int startIdx, int endIdx) {
    	
    	if(startIdx >= endIdx) return; // 요소 1개일 경우 종료
    		
    	int pivot = startIdx;
    	int left = startIdx+1 ; // 왼쪽에서부터 이동하며 큰 수 찾기 ->방향
    	int right = endIdx; // 오른쪽에서부터 이동하며 작은 수 찾기  <-방향
    	
    	while(left <= right) {
	    	// 큰 수 찾기 -> 오른쪽에 남는 수
    		// left가 endIdx보다 작거나 같은 상태에서 피벗보다 길이 길거나, 길이는 같은데 사전순으로 뒤에 있는 글자이면 멈춰
    		// => 조건은 피벗보다 작거나 같고 길이 같은데 사전순 앞이면 계속 돌려
	    	while(left <= endIdx && ( (arr[left].length() < arr[pivot].length()) || (arr[left].length() == arr[pivot].length() && arr[left].charAt(0) < arr[pivot].charAt(0) ))) 
	    		left++;
	    	
	    	// 작은 수 찾기 -> 왼쪽에 남는 수
	    	// 피벗보다 길이 짧거나, 길이 같은데 사전순으로 앞서는 글자
	    	// => 조건은 길이 길거나 같고, 또는 길이 같은데 사전순 뒤인 글자면 계속 돌려
	    	while(right > startIdx && ( (arr[right].length() > arr[pivot].length()) || (arr[right].length() == arr[pivot].length() && arr[right].charAt(0) > arr[pivot].charAt(0) ))) 
	    		right--;
	    	
	    	// 두 수 엇갈리면 작은 수와 피벗을 변경
	    	if(left > right) {
	    		String temp = arr[right]; // 작은 수 담음
	    		arr[right] = arr[pivot];
	    		arr[pivot] = temp;
	    	}else{ // 안엇갈리면 작은 수랑 큰 수 바꿈
	    		String temp = arr[right]; // 작은 수 담음
	    		arr[right] = arr[left];
	    		arr[left] = temp;
	    	}
	    	
	    	// pivot 기준으로 왼쪽에 작은수들 오른쪽에 큰수들만 있음 두 부분 나눠서 다시 정렬
	    	sort(arr,startIdx,right-1);
	    	sort(arr,right+1,endIdx);
    	}
    }
}
