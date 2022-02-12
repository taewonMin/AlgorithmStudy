package part4.week35.mtw;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

// 스택
public class Stack_10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack stack = new Stack();

        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            String[] input = br.readLine().split(" ");
            switch(input[0]){
                case "push":
                    stack.push(Integer.parseInt(input[1]));
                    break;
                case "pop":
                    bw.write(stack.pop()+"\n");
                    break;
                case "size":
                    bw.write(stack.size()+"\n");
                    break;
                case "empty":
                    bw.write(stack.empty()+"\n");
                    break;
                case "top":
                    bw.write(stack.top()+"\n");
                    break;
            }
        }
        
        br.close();
        bw.flush();
        bw.close();
    }
}

class Stack{
    List<Integer> stack = new ArrayList<>();

    void push(int n){
        stack.add(n);
    }

    int pop(){
        return stack.isEmpty() ? -1 : stack.remove(stack.size()-1);
    }

    int size(){
        return stack.size();
    }

    int empty(){
        return stack.isEmpty() ? 1 : 0;
    }

    int top(){
        return stack.isEmpty() ? -1 : stack.get(stack.size()-1);
    }
}