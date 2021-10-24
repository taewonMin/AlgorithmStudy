package part3.week23.mtw;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Sort_18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        Map<Integer, Integer> countMap = new HashMap<>(); // 숫자 : 작은 수의 개수
        int[] coordinate = new int[N];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int length = st.countTokens();
        for(int i=0; i<length; i++){
            coordinate[i] = Integer.parseInt(st.nextToken());
        }
        int[] sortList = coordinate.clone();
        Arrays.sort(sortList);

        int cnt = 0;
        for(int key : sortList){
            if(!countMap.containsKey(key)){
                countMap.put(key, cnt++);
            }
        }
        
        for(int i : coordinate){
            bw.write(countMap.get(i) + " ");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
