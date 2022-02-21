package part4.week34.psw;

import java.util.Arrays;
import java.util.Scanner;
//	12836	124
public class Greedy_1541 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] calculations = sc.nextLine().split("-");

        int answer = 0;
        for (int i = 0; i < calculations.length; i++) {
            String[] numbers = calculations[i].split("\\+");
            int sum = 0;
            for (int j = 0; j < numbers.length; j++) {
                if (!"".equals(numbers[j])){
                    sum += Integer.parseInt(numbers[j]);
                }
            }
            answer += i > 0? -(sum) : sum;
        }
        System.out.println(answer);
    }
}
