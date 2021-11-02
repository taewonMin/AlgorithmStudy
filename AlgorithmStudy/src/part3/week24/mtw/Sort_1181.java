package part3.week24.mtw;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort_1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        List<String> word = new ArrayList<>();
        for(int i=0; i<N; i++){
            String input = br.readLine();
            if(!word.contains(input)){
                word.add(input);
            }
        }
        Collections.sort(word, (a,b) -> {
            if(a.length() == b.length()){
                return a.compareTo(b);
            }else{
                return a.length() > b.length() ? 1 : -1;
            }
        });
        for(String str : word){
            bw.write(str+"\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
