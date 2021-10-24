package part3.week23.mtw;

import java.util.Scanner;

public class BackTracking_15649 {
    public static int N;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        int M = sc.nextInt();
        for(int i=1; i<N+1; i++){
            dfs(M, String.valueOf(i));
        }

        sc.close();
    }

    public static void dfs(int M, String str){
        if(M == 1){
            System.out.println(str);
            return;
        }
        for(int i=1; i<N+1; i++){
            if(!str.contains(String.valueOf(i))){
                dfs(M-1, str+" "+i);
            }
        }
    }
}
