package part4.week39.psw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BinarySearch_12015 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] numbers = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int val = numbers[i];
            if (list.isEmpty() || list.get(list.size()-1) < val){
                list.add(val);
            }else {
                int left = 0, right = list.size()-1;

                while (left < right){
                    int mid = (left+right)/2;
                    if (list.get(mid) >= val){
                        right = mid;
                    }else {
                        left = mid + 1;
                    }
                }
                list.set(left,val);
            }
        }
        System.out.println(list.size());
    }
}