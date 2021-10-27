package part3.week23.jje;

import java.util.ArrayList;
import java.util.Scanner;

public class BackTracking_15649 {

    static Scanner sc = new Scanner(System.in);
    static int n = sc.nextInt();
    static int m = sc.nextInt();

    public static void main(String[] args) {

        //for (int i = 1; i <= n; i++) {
            checkBefore(0);
        //}
        sc.close();
    }
    static int temp = 0;
    static ArrayList<Integer> resultArray = new ArrayList<>();
    static void checkBefore(int num){
        if(resultArray.size() == m){
            for (int i = 0; i < resultArray.size(); i++) {
                System.out.println(resultArray.get(i));
            }
            return;
        }

        for (int i = 0; i < m; i++) {
            if(resultArray.get(i) == num){
                checkBefore(num+1);
            }else {
                resultArray.add(num);
            }
        }

    }
}