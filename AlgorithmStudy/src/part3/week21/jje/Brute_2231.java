package part3.week21.jje;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Brute_2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        int number = Integer.parseInt(n);
        int result = 0;
        int tempResult = 0;

        for (int i = 1; i < number; i++) {
            int charSum = 0;
            for (int j = 0; j < (int)( Math.log10(i)+1 ); j++) {
                String str = Integer.toString(i);
                charSum += Character.getNumericValue(str.charAt(j));
            }
            if (charSum + i == number){
                result = i;
                break;
            }
        }

        System.out.println(result);

    }
}
