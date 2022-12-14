package season2.part8.mtw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 좋은 단어
public class Stack_3986 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Character> stack = new Stack<>();
        int t = Integer.parseInt(br.readLine());
        int cnt = 0;
        for(int i=0; i<t; i++){
            stack.clear();
            char[] str = br.readLine().toCharArray();
            for(char c : str){
                if(stack.isEmpty()==false && stack.peek()==c){
                    stack.pop();
                }else{
                    stack.push(c);
                }
            }
            if(stack.isEmpty()){
                cnt++;
            }
        }

        System.out.println(cnt);
        br.close();
    }
}
