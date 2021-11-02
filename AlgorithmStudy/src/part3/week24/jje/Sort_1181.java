package part3.week24.jje;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;

public class Sort_1181 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] dupleArr = new String[n];
        for (int i = 0; i < n; i++) {
            dupleArr[i] = sc.next();
        }
        HashSet<String> set = new HashSet<>(Arrays.asList(dupleArr));
        String[] resultArr = set.toArray(new String[0]);

        Arrays.sort(resultArr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                } else {
                    return o1.length() - o2.length();
                }
            }
        });

        for (int i = 0; i < resultArr.length; i++) {
            System.out.println(resultArr[i]);
        }
        sc.close();
    }
}
