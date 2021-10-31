package part3.week23.mtw;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// 숫자 카드2
public class BinarySearch_10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");

        // 방법1) 이분 탐색
        int[] card = new int[N];
        for(int i=0; i<N; i++){
            card[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(card);

        int M = Integer.parseInt(br.readLine());
        input = br.readLine().split(" ");
        for(int i=0; i<M; i++){
            int key = Integer.parseInt(input[i]);
            bw.write((upper_bound(card, key) - lower_bound(card, key))+" ");
        }

        // 방법2) Map으로 카운팅
        // Map<Integer, Integer> card = new HashMap<>();
        // for(int i=0; i<N; i++){
        //     int number = Integer.parseInt(input[i]);
        //     if(!card.containsKey(number)){
        //         card.put(number, 1);
        //     }else{
        //         card.put(number, card.get(number)+1);
        //     }
        // }

        // int M = Integer.parseInt(br.readLine());
        // input = br.readLine().split(" ");
        // for(int i=0; i<M; i++){
        //     Integer count = card.get(Integer.parseInt(input[i]));
        //     bw.write((count==null ? 0 : count) + " ");
        // }

        br.close();
        bw.flush();
        bw.close();
    }

    public static int lower_bound(int[] arr, int key){
        int lo = 0;
        int hi = arr.length-1;
        while(lo <= hi){    // lo가 key가 시작되는 index에서 끝남
            int mid = (hi+lo)/2;
            if(key <= arr[mid]){
                hi = mid-1;
            }else if(key > arr[mid]){
                lo = mid+1;
            }
        }
        return lo;
    }

    public static int upper_bound(int[] arr, int key){
        int lo = 0;
        int hi = arr.length-1;
        while(lo <= hi){ // lo가 key보다 큰 바로 다음 index에서 끝남
            int mid = (hi+lo)/2;
            if(key < arr[mid]){
                hi = mid-1;
            }else if(key >= arr[mid]){
                lo = mid+1;
            }
        }
        return lo;       
    }
}