package part2.week18.chw;

import java.util.Scanner;

public class Imple_10994 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int size = 4 * (cnt - 1) + 1;
        int[][] arr = new int[size][size];
        int temp = size;
        int temp2 = 1;
        
        int tempI = 0;
        int tempJ = 0;
        
        String str1 = "* ";
        String str2 = " *";
        for(int i = 0; i < size/2-1; i++) {
        	String str = "";
        	if(i > str1.length()) {
        		str1+=str1;
        		str2+=str2;
        	}
        	for(int j = 0; j < size; j++) {
        		if(i > 0 && i % 2 == 0) {
        			str = str1;
        			int length = size-str1.length()-str2.length();
        			for(int k = 0; k < length; k++) {
        				str += "*";
        			}
        			str += str2;
        		}else {
        			str = str1;
        			int length = size-str1.length()-str2.length();
        			for(int k = 0; k < length; k++) {
        				str += " ";
        			}
        			str += str2;
        		}
        		System.out.println(str);
        	}
        }
        
        sc.close();
    }
}
