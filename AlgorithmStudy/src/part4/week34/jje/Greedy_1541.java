package part4.week34.jje;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Greedy_1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] splitMinus = br.readLine().split("-");
        int result = 0;

        for (int i = 0; i < splitMinus.length; i++) {
            int plus = 0;
            String[] splitPlus = splitMinus[i].split("\\+");
            for (int j = 0; j < splitPlus.length; j++) {
                plus += Integer.parseInt(splitPlus[j]);
            }
            if (i == 0) {
                result = plus;
            } else {
                result -= plus;
            }
        }
        System.out.println(result);
    }
}
