package part4.week36.psw;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//19668	296
public class Combination_9375 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            Map<String, Integer> map = new HashMap<>();
            for (int j = 0; j < n; j++) {
                String nm = sc.next(), kind = sc.next();
                if (!map.containsKey(kind)) {
                    map.put(kind, 1);
                }
                map.put(kind, map.get(kind) + 1);
            }
            int answer = n>0? map.values().stream().reduce((sum, a) -> sum *= a).get()-1:0;
            System.out.println(answer);
        }
    }
}
