package part3.week21.mtw;

import java.util.Scanner;

public class Brute_2231 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int range = (String.valueOf(N).charAt(0)-'0') + 9*(String.valueOf(N).length()-1);
        int constructor = 0;
        for(int i=N-range; i<N; i++){
            int sum = i;
            for(char j : String.valueOf(i).toCharArray()){
                sum += j - '0';
            }
            if(sum == N){
                constructor = i;
                break;
            }
        }

        System.out.println(constructor);

        sc.close();
    }
}
