package part3.week30.jje;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Math_4153 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = 0;
        double b = 0;
        double c = 0;

        while(true){
            a = sc.nextDouble();
            b = sc.nextDouble();
            c = sc.nextDouble();
            if (a == 0 && b == 0 && c == 0){
                break;
            }
            ArrayList<Double> arr = new ArrayList<>();
            arr.add(a);
            arr.add(b);
            arr.add(c);
            arr.sort(Comparator.reverseOrder());

            if(Math.pow(arr.get(0), 2) == Math.pow(arr.get(1), 2) + Math.pow(arr.get(2), 2)){
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
        sc.close();
    }
}
