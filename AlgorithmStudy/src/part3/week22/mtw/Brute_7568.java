package part3.week22.mtw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Brute_7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        List<Integer[]> bulkList = new ArrayList<>(); // 몸무게, 키, 순서

        for(int i=0; i<N; i++){
            String[] input = br.readLine().split(" ");
            bulkList.add(new Integer[]{Integer.parseInt(input[0]), Integer.parseInt(input[1]), i});
        }
        bulkList.sort((a,b) -> a[0].compareTo(b[0]));

        String[] rank = new String[N];
        for(int i=0; i<N; i++){
            Integer[] bulk = bulkList.get(i);
            int cnt = 1;
            for(int j=i+1; j<N; j++){
                Integer[] next = bulkList.get(j);
                if(bulk[0] < next[0] && bulk[1] < next[1]){
                    cnt++;
                }
            }
            rank[bulk[2]] = String.valueOf(cnt);
        }
        
        System.out.println(String.join(" ", rank));

        br.close();
    }
}
