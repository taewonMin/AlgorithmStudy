package part3.week27.mtw;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Math_10757 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] input = br.readLine().split(" ");
        // BigInteger A = new BigInteger(input[0]);
        // BigInteger B = new BigInteger(input[1]);

        // bw.write(A.add(B).toString());
        int gap = input[0].length()-input[1].length();
        if(gap > 0){
            for(int i=0; i<Math.abs(gap); i++){
                input[1] = "0"+input[1];
            }
        }else if(gap < 0){
            for(int i=0; i<Math.abs(gap); i++){
                input[0] = "0"+input[0];
            }
        }
        String result = "";
        int remain = 0;
        for(int i=input[0].length(); i>=0; i--){
            int sum = input[0].charAt(i)+(secondNum[j]-'0')+remain;
            result = sum%10 + result;
            remain = sum/10;
        }
        if(remain!=0){
            result = remain+result;
        }
        bw.write(result);

        br.close();
        bw.flush();
        bw.close();
    }
}
