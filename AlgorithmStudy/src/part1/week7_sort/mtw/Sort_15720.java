package part1.week7_sort.mtw;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

// 카우버거
public class Sort_15720 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        sc.nextLine();

        Integer[] bugger = new Integer[B];
        Integer[] side = new Integer[C];
        Integer[] drink = new Integer[D];
        int total = 0;
        for(int j=0; j<B; j++){
            bugger[j] = sc.nextInt();
            total += bugger[j];
        }
        Arrays.sort(bugger, Collections.reverseOrder());
        sc.nextLine();

        for(int j=0; j<C; j++){
            side[j] = sc.nextInt();
            total += side[j];
        }
        Arrays.sort(side, Collections.reverseOrder());
        sc.nextLine();

        for(int j=0; j<D; j++){
            drink[j] = sc.nextInt();
            total += drink[j];
        }
        Arrays.sort(drink, Collections.reverseOrder());

        System.out.println(total);
        total = 0;
        int max = Math.max(B, Math.max(C,D));
        for(int i=0; i<max; i++){
            if(i<B && i<C && i<D){
                total += (bugger[i]+side[i]+drink[i])*0.9;
            }else{
                if(i < B){
                    total += bugger[i];
                }
                if(i < C){
                    total += side[i];
                }
                if(i < D){
                    total += drink[i];
                }
            }
        }
        System.out.println(total);

        sc.close();
    }
}
