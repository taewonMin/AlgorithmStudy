package part3.week23.psw;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BinarySearch_10816 {
    public static void main(String[] args) throws IOException {
        Map<Integer,Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            map.put(x, map.get(x) == null ? 1 : map.get(x)+1);
        }

        int m = sc.nextInt();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            sb.append(map.get(x) == null ? 0 : map.get(x));
            sb.append(" ");
        }

        System.out.println(sb.toString());
    }

    private static int binarySearch(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;
        int mid = 0;

        while (left <= right){
            mid = (left + right)/2;
            if(numbers[mid] == target){

                while (true){
                    if (mid-1 > -1 && numbers[mid-1] == target){
                        mid--;
                        continue;
                    }
                    break;
                }

                return mid;
            }else if (numbers[mid] > target){
                right = mid-1;
            }else {
                left = mid+1;
            }
        }

        return -1;
    }
}
