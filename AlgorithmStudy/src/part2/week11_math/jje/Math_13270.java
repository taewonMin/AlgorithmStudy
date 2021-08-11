package part2.week11_math.jje;

import java.util.Scanner;

public class Math_13270 {
   
	/**
   	static int[] d = new int[100];
   	
    static int fibonacci(int x) {
       if(x == 1 || x == 2) d[x] = 1;
       if(d[x] != 0) return d[x];
       return d[x] = fibonacci(x -1) + fibonacci(x - 2);
    }
    **/
      public static void main(String[] args) {
         
    	  //피보나치킨
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          
          //1 1 2 3 5 8 13 21 34 55
          //20 -> 1*10 = 10
          //20 -> 3*4 = 12
          //20 -> 2*6 + 1 = 13
          //20 -> 3*3 + 2 + 1 = 12
          //20 -> 5*2 + 1*2 = 12
          //20 -> 8 + 2 +2 = 12
          //20 -> 8 + 3 = 11
          
          //21 -> 1*9 + 2 = 11
          //21 -> 2*7 = 14
          
          //23 -> 1*10+2 = 12
          //23 -> 2*7+1 = 15
           
          //19 -> 1*8+2 = 10
          //19 -> 2*5+1*2 = 12 
          
          /**          
          int max = 0;
          int min = 0;

          if (n%2 == 0) {
             min = n/2;
             max = (n/3)*2+1; 
          } else if (n%3 == 0) {
             min = (n-3)/2+2;
             max = (n/3)*2;
          } else if (n%3 == 1) {
          	min = (n-3)/2+2;
            max = (n-4)/3*2+2;
          } else {
             min = (n-3)/2+2;
             max = (n/3)*2+1;
          }
           **/
          
          int min = n%2 == 0? n/2 : (n-3)/2+2;
          int max = n%3 == 0? (n/3)*2 : (n%3 == 1? (n-4)/3*2+2 : (n/3)*2+1);
          System.out.println(min+" "+max);     
         

      }
   
}