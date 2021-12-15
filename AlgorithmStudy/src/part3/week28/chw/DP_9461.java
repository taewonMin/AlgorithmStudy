package part3.week28.chw;

import java.util.Scanner;

public class DP_9461 {
	static Integer[] p = new Integer[101];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        p[1] = 1;
        p[2] = 1;
        p[3] = 1;
        p[4] = 2;
        p[5] = 2;
        for(int i = 0; i < sc.nextInt(); i++) {
            System.out.println(makeP(sc.nextInt()));
        }
        sc.close();
    }
    static int makeP(int input) {
//        if(input < 6) return p[input];
    	if(p[input] == null) {
    		p[input] = makeP(input-1) + makeP(input-5);
    	}
    	return p[input];
    }
}
/*
p(1) = 1
p(2) = 1
p(3) = 1
p(4) = 2
p(5) = 2


p(6) = 1 + 2 = p(5) + p(3) => p(5) + p(1) 
p(7) = 1 + 3 = p(6) + p(2) => p(6) + p(2) 
p(8) = 1 + 4 = p(7) + p(1) => p(7) + p(3) 

p(9) = 5 + 2 = p(8) + p(4) 
p(10) = 7 + 2 = p(9) + p(5)
p(11) = 9 + 3 = p(10) + p(6)
p(12) = 12 + 4 = p(11) + p(7)
p(13) = 16 + 5
p(14) = 21 + 7
p(15) = 28 + 9
p(16) = 37 + 12
p(17) = 49 + 16
p(18) = 65 + 21
*/
