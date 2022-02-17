package part4.week36.psw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//430324	1264
public class Queue_18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();
        String[] numbers = new String[n];
        int startIdx = 0, endIdx = -1;
        for (int i = 0; i < n; i++) {
            String[] command = br.readLine().split(" ");
            String str = null;
            int gap = endIdx - startIdx;
            switch (command[0]){
                case "push":
                    numbers[++endIdx] = command[1];
                    break;
                case "pop":
                    str = gap > -1 ? numbers[startIdx++] : "-1";
                    break;
                case "size":
                    str = String.valueOf(gap +1);
                    break;
                case "empty":
                    str = gap > -1 ? "0" : "1";
                    break;
                case "front":
                    str = gap > -1 ? numbers[startIdx]: "-1";
                    break;
                case "back":
                    str = gap > -1 ? numbers[endIdx] : "-1";
            }
            if (str != null) sb.append(str+"\n");
        }
        System.out.println(sb);
    }
}