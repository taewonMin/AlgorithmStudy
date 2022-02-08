package part4.week34.mtw;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 잃어버린 괄호
public class Greedy_1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] input = br.readLine().toCharArray();
        String temp = "";
        int result = 0;
        boolean isMinus = false;
        for(int i=0; i<input.length; i++){
            if(input[i] != '+' && input[i] != '-'){ // 숫자이면
                temp += input[i];
            }else{
                if(isMinus){
                    result -= Integer.parseInt(temp);
                }else{
                    result += Integer.parseInt(temp);
                }
                
                if(input[i] == '-'){
                    isMinus = true;
                }
                temp = "";
            }
        }
        if(isMinus){
            result -= Integer.parseInt(temp);
        }else{
            result += Integer.parseInt(temp);
        }

        bw.write(result + "");

        br.close();
        bw.flush();
        bw.close();
    }
}
