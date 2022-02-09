package part4.week34.mtw;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

// 주유소
public class Greedy_13305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        int[] road = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] city = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        long result = 0;
        int position = 0;
        
        while(position < city.length-1){
            long distance = 0;
            for(int i=position+1; i<city.length; i++){
                distance += road[i-1];
                if(city[i] < city[position] || i == city.length-1){
                    result += city[position]*distance;
                    position = i;
                    break;
                }
            }
        }

        bw.write(result + "");

        br.close();
        bw.flush();
        bw.close();
    }
}
