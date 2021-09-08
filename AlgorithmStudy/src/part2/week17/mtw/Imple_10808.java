package part2.week17.mtw;

import java.util.Scanner;

public class Imple_10808 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] alphabet = new int[26];
        String str = sc.nextLine();
        for(int i=0; i<str.length(); i++) {
        	int cnt = str.charAt(i) - 97;
        	alphabet[cnt]++;
        }
        
        for(int i : alphabet) {
        	System.out.print(i+" ");
        }
        
        sc.close();
    }
}
