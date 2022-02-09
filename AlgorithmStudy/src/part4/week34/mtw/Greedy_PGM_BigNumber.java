package part4.week34.mtw;

import java.util.Stack;

// 큰 수 만들기
public class Greedy_PGM_BigNumber {
    public static void main(String[] args) {
        System.out.println(solution("4177252841", 4));
    }

    public static String solution(String number, int k){
        String answer = "";
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<number.length(); i++){
            while(!stack.isEmpty() && k>0 && stack.peek() < number.charAt(i)){
                stack.pop();
                k--;
            }
            stack.push(number.charAt(i));
            if(k==0){
                for(int j=0; j<stack.size(); j++){
                    answer += stack.get(j);
                }
                answer += number.substring(i+1);
                break;
            }
        }

        if(k!=0){
            for(int j=0; j<stack.size()-k; j++){
                answer += stack.get(j);
            }
        }

        return answer;
    }
}
