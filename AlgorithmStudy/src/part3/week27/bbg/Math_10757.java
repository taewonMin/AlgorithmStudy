package part3.week27.bbg;

import java.math.BigDecimal;
import java.util.Scanner;

public class Math_10757 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);

		BigDecimal A = new BigDecimal(sc.next());
		BigDecimal B = new BigDecimal(sc.next());
		
		sc.close();
		
		System.out.println(A.add(B));
    }
}
