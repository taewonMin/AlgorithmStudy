package part4.week35.psw;

import java.util.Scanner;
//12824	108
public class Number_5086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        while (true){
            int a = sc.nextInt(), b = sc.nextInt();
            if (a==0 && b==0) break;

            boolean factor = b%a == 0;
            boolean multiple = a%b == 0;
            if (factor){
                sb.append("factor");
            }else if (multiple){
                sb.append("multiple");
            }else {
                sb.append("neither");
            }
            sb.append("\n");
        }
        System.out.println(sb);
        sc.close();
    }
}
