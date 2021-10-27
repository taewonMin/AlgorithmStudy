package part3.week23.jje;

import java.util.*;

public class Sort_10814 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[][] sortArray = new String[n][2];
        for (int i = 0; i < n; i++) {
            sortArray[i][0] = sc.next();
            sortArray[i][1] = sc.next();
        }
        Arrays.sort(sortArray, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                    return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
            }
        });

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(sortArray[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}

