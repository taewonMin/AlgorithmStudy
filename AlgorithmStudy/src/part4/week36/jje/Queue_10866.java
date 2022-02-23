package part4.week36.jje;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Queue_10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Deque<String> deque = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            String[] order = br.readLine().split(" ");
            switch(order[0]){
                case "push_front" :
                    deque.addFirst(order[1]);
                    break;
                case "push_back" :
                    deque.addLast(order[1]);
                    break;
                case "pop_front" :
                    if(deque.isEmpty()) System.out.println(-1);
                    else System.out.println(deque.pollFirst());
                    break;
                case "pop_back" :
                    if(deque.isEmpty()) System.out.println(-1);
                    else System.out.println(deque.pollLast());
                    break;
                case "size" :
                    System.out.println(deque.size());
                    break;
                case "empty" :
                    if(deque.isEmpty()) System.out.println(1);
                    else System.out.println(0);
                    break;
                case "front" :
                    if(deque.isEmpty()) System.out.println(-1);
                    else System.out.println(deque.peekFirst());
                    break;
                case "back" :
                    if(deque.isEmpty()) System.out.println(-1);
                    else System.out.println(deque.peekLast());
                    break;
            }
        }

        /*
        int[] deque = new int[10000];
        int first = 10000;
        int last = 0;

        for (int i = 0; i < n; i++) {
            String[] order = sc.next().split(" ");
            int num = Integer.parseInt(order[1]);
            switch(order[0]){
                case "push_front" :
                    deque[first] = num;
                    first--;
                case "push_back" :
                    deque[deque.length] = num;
                case "pop_front" :
                    System.out.println(deque[first]);
                    deque[first] = 0;
                case "pop_back" :
                    System.out.println(deque[deque.length]);
                    deque[deque.length] = 0;
                case "size" :
                case "empty" :
                case "front" :
                case "back" :
            }
        }
         */
    }
}