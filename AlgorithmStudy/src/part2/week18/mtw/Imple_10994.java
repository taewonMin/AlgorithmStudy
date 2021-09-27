package part2.week18.mtw;

import java.util.Scanner;

public class Imple_10994 {

    static String[][] draw;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int len = 1+(n-1)*4;
        draw = new String[len][len];

        draw(0,len);

        for(String[] i : draw){
            System.out.println(String.join("", i));
        }

        sc.close();
    }

    static void draw(int start, int len){
        if(len < 0) return;
        // 테두리 채우기
        for(int i=start; i<start+len; i++){
            for(int j=start; j<start+len; j++){
                if(i==start || i==start+len-1){
                    draw[i][j] = "*";
                }else if(j==start || j==start+len-1){
                    draw[i][j] = "*";
                }else{
                    draw[i][j] = " ";
                }
            }
        }
        draw(start+2, len-4);
    }
}
