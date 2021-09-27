package part2.week19.phk;

import java.util.Scanner;

public class Dynamic_17212 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int result = n/7;
        switch( n%7 ){
            case 1: 
            case 2: 
            case 5:
                result += 1;
                break;  
            case 4: 
            case 6: 
                result += 2;
                break;  
            case 3: 
                result += (n < 7 ? 2 : 1); 
                break;
            default:
                break;
            
            
        }

        System.out.println(result);
        sc.close();
    }
}
