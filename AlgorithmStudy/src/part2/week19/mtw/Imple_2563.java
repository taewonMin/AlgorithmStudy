package part2.week19.mtw;

import java.util.Scanner;

public class Imple_2563 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean[][] paper = new boolean[100][100];
        int num = sc.nextInt();
        int area = 0;
        for(int i=0; i<num; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();

            for(int j=0; j<10; j++){
                for(int k=0; k<10; k++){
                    if(paper[x+j][y+k] == false){
                        paper[x+j][y+k] = true;
                        area++;        
                    }
                }
            }
        }

        System.out.println(area);
        
        sc.close();
    }
}
