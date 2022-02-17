package part4.week36.psw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//	17520	152
public class Queue_10866 {
    static final int STR = 0, VALUE=1;
    static StringBuffer sb;
    static String[] frontNumbers, backNumbers;
    static int frontStartIdx = 0, frontEndIdx = -1,backStartIdx = 0, backEndIdx = -1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = init(br.readLine());

        for (int i = 0; i < n; i++) {
            String str = command(br.readLine().split(" "));
            if (str != null) sb.append(str+"\n");
        }
        System.out.println(sb);
    }

    private static int init(String readLine) {
        int n = Integer.parseInt(readLine);
        frontNumbers = new String[n];
        backNumbers = new String[n];
        sb = new StringBuffer();
        return n;
    }

    private static String command(String[] command) {
        String str = null;

        if ("push_front".equals(command[STR])){
            frontNumbers[++frontEndIdx]=command[VALUE];
        } else if ("push_back".equals(command[STR])){
            backNumbers[++backEndIdx]=command[VALUE];
        } else if ("pop_front".equals(command[STR])){

            if (frontSize() > -1){
                str = frontNumbers[frontEndIdx--];
            }else if (backEndIdx-backStartIdx > -1){
                str = backNumbers[backStartIdx++];
            }else {
                str = "-1";
            }

        } else if ("pop_back".equals(command[STR])){

            if (backSize() > -1){
                str = backNumbers[backEndIdx--];
            }else if (frontSize() > -1){
                str = frontNumbers[frontStartIdx++];
            }else {
                str = "-1";
            }

        } else if ("size".equals(command[STR])){
            str = String.valueOf(backSize()+frontSize()+2);
        } else if ("empty".equals(command[STR])){
            str = frontSize()>-1 || backSize() > -1 ? "0" : "1";
        } else if ("front".equals(command[STR])){

            if (frontSize() > -1){
                str = frontNumbers[frontEndIdx];
            }else if (backSize() > -1){
                str = backNumbers[backStartIdx];
            }else {
                str = "-1";
            }

        } else if ("back".equals(command[STR])){

            if (backSize() > -1){
                str = backNumbers[backEndIdx];
            }else if (frontSize() > -1){
                str = frontNumbers[frontStartIdx];
            }else {
                str = "-1";
            }

        }
        return str;
    }

    private static int frontSize() {
        return frontEndIdx-frontStartIdx;
    }

    private static int backSize() {
        return backEndIdx-backStartIdx;
    }
}
