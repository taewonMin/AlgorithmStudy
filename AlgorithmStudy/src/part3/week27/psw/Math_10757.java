package part3.week27.psw;

import java.util.Scanner;

public class Math_10757 {
    //18624	272
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] a = sc.next().split("");
        String[] b = sc.next().split("");

        StringBuffer sb = new StringBuffer();
        int x = a.length-1;
        int y = b.length-1;
        int remain = 0;
        while (x>-1 || y>-1){
            int q = x > -1 ? Integer.parseInt(a[x--]) : 0;
            int p = y > -1 ? Integer.parseInt(b[y--]) : 0;
            int k = q+p+remain;
            remain = k > 9 ? 1 : 0;
            sb.append(k%10);
        }
        if (remain == 1) sb.append(remain);
        System.out.println(sb.reverse());
    }
}
