package part2.week20.mtw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Brute_2798 {
    public static int[] card;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        card = new int[N];
        st = new StringTokenizer(br.readLine());
        int len = st.countTokens();
        for(int i=0; i<len; i++){
            card[i] = Integer.parseInt(st.nextToken());
        }
        
        System.out.println(blackJack(M));
        
        br.close();
    }

    public static int blackJack(int M){
        int max = 0;
        for(int i=0; i<card.length; i++){
            if(card[i] < M){
                for(int j=i+1; j<card.length; j++){
                    if(card[i] + card[j] < M){
                        for(int k=j+1; k<card.length; k++){
                            int sum = card[i] + card[j] + card[k];
                            if(sum == M){
                                return sum;
                            }else if(sum < M && sum > max){
                                max = sum;
                            }
                        }
                    }
                }
            }
        }
        return max;
    }
}
