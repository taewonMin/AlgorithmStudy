package part4.week38.jje;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DivideConquer_1629 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String temp = br.readLine();
        long a = Long.parseLong(temp.split(" ")[0]);
        long b = Long.parseLong(temp.split(" ")[1]);
        long c = Long.parseLong(temp.split(" ")[2]);
        System.out.println(recursive(a, b, c));

    }

    static long recursive(long a, long b, long c) {
        long result = 0;
        if (b == 1) return a % c;
        result = recursive(a, b / 2, c); //지수법칙
        if (b % 2 == 1) return (result * result % c) * a % c;
        return result * result % c;
    }
}
