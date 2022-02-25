package part4.week36.psw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//95360	932
public class Queue_5430 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringBuffer sb = new StringBuffer();
            String function = br.readLine();
            int n = Integer.parseInt(br.readLine());

            String[] numbers = br.readLine().replace("[","").replace("]","").split(",");

            int startIdx = 0, endIdx = n-1;
            boolean isUpsideDown = false;
            String str = "[]";
            for (int j = 0; j < function.length(); j++) {

                if (function.charAt(j) == 'R'){
                    isUpsideDown = !isUpsideDown;
                }else {

                    if (endIdx-startIdx == -1) {
                        str = "error";
                        break;
                    }

                    if (isUpsideDown){
                        endIdx--;
                    }else {
                        startIdx++;
                    }
                }
            }

            if (endIdx-startIdx == -1){
                sb.append(str);
            }else {
                sb.append("[");
                if (isUpsideDown){
                    for (int j = endIdx; j >= startIdx; j--) {
                        sb.append(numbers[j]);
                        if (j != startIdx) sb.append(",");
                    }
                }else {
                    for (int j = startIdx; j <= endIdx ; j++) {
                        sb.append(numbers[j]);
                        if (j != endIdx) sb.append(",");
                    }
                }
                sb.append("]");
            }
            System.out.println(sb);
        }
    }
}
