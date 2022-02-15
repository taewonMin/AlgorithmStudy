package part4.week35.psw;

import java.util.Arrays;
import java.util.Scanner;
//13724	1448 -> 정렬 , 	13748	1432 -> 절대값
public class Number_2981 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[sc.nextInt()];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        Arrays.sort(numbers);
        int val = numbers[1]-numbers[0];
        for (int i = 2; i < numbers.length; i++) {
            val = gcd(val,numbers[i]-numbers[i-1]);
        }

        StringBuffer sb = new StringBuffer();
        for (int i = 2; i <= val; i++) {
            if (val%i==0) sb.append(i+" ");
        }
        System.out.println(sb);
    }

    private static int gcd(int val, int i) {
        if (i == 0) return val;
        return gcd(i,val%i);
    }
}
/*
임의의 정수 A1과 A2는 다음과 같이 표현 할 수 있다.
A1 = M * a1 + r1
A2 = M * a2 + r2

이 때 나머지가 같아야 하기 때문에 r1과 r2가 같아야 한다는 가정하에 A1에서 A2를 빼면 다음과 같이 만들 수 있다.
A1 - A2 = M * (a1 - a2) + (r1 - r2)
r1 - r2 = 0 이므로, A1 - A2 = M * (a1 - a2)
M 은 (A1 - A2) 의 약수이므로, A1 과 A2 의 공약수가 됨.
 */
