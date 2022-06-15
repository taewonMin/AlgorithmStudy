package part5.week47.mtw;

import java.util.ArrayList;
import java.util.Scanner;

// 소수의 연속합
public class TwoPointer_1644 {
    public static ArrayList<Integer> primeList = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        boolean[] prime = new boolean[N+1];
        for(int i=2; i<=Math.sqrt(N); i++){
            if(prime[i]==false){
                for(int n=2,j=i*n; j<=N; n++,j=i*n){
                    prime[j] = true;
                }
            }
        }

        for(int i=2; i<prime.length; i++){
            if(prime[i]==false){
                primeList.add(i);
            }
        }

        twoPointer(N);

        sc.close();
    }

    public static void twoPointer(int N){
        int result = 0;
        int start = 0;
        int end = 0;
        int sum = primeList.isEmpty() ? 0 : primeList.get(0);

        while(start<primeList.size()){
            if(sum < N){
                if(end==primeList.size()-1){
                    break;
                }
                sum += primeList.get(++end);
            }else if(sum == N){
                sum -= primeList.get(start++);
                result++;
            }else{
                sum -= primeList.get(start++);
            }
        }

        System.out.println(result);
    }
}
