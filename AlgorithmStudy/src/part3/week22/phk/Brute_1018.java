package part3.week22.phk;

import java.util.Scanner;

// 13320kb	124ms
public class Brute_1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        String[] pan = new String[n];
        for(int i = 0; i < n; i++){
            pan[i] = sc.nextLine();
        }
        sc.close();

        int min = 8*8-1;
        // 체스판 시작 (0,0) ~ (n-8, m-8) -> (i,j)
        for (int i = 0; i <= n - 8; i++) {
            for (int j = 0; j <= m - 8; j++) {
                int check = color_check(pan, i, j);
                if(min > check) min = check;
            }
        }

        System.out.println(min);

    }

    public static int color_check(String[] pan, int a, int b) {
        int check = 0;
        int check_1 = 0;
        int check_2 = 0;
        for(int i = a; i < a + 8; i++){
            for(int j = b; j < b + 8; j++){
                char color = pan[a].charAt(b);
                if((i+j)%2 == 0){
                    if(color != pan[i].charAt(j)) check_1++;
                    else check_2++;
                }else{
                    if(color == pan[i].charAt(j)) check_1++;
                    else check_2++;
                }
            }
        }
        check = (check_1 <= check_2 ? check_1 : check_2);
        return check;
    }
}
