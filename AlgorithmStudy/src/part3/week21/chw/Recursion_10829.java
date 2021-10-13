package part3.week21.chw;

import java.util.Scanner;

public class Recursion_10829 {
	static String result = "";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        convert(sc.nextLong());
        System.out.println(result);
        sc.close();
    }
    static void convert(long input) {
    	if(input == 0) return;
    	result = (input % 2 == 0 ? 0 : 1) + result;
    	input = input / 2;
    	convert(input);
    }
}
/*

53 -> 26 ... 1
26 -> 13 ... 0
13 -> 6  ... 1
6  -> 3  ... 0
3  -> 1  ... 1
1  -> 0  ... 1

*/