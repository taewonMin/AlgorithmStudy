package part3.week29.psw;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//222044	4756
public class Math_9020 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) eratos(sc.nextInt());
        sc.close();
    }

    public static void eratos(int n){
        List<Boolean> primeList = new ArrayList<Boolean>(n+1);
        // 0번째와 1번째를 소수 아님으로 처리
        primeList.add(false);
        primeList.add(false);

        // 2~ n 까지 소수로 설정
        for(int i=2; i<=n; i++ ) primeList.add(i, true);

        // 배수 삭제
        for(int i=2; (i*i)<=n; i++){
            if(primeList.get(i)){
                for(int j = i*i; j<=n; j+=i) primeList.set(j, false);
            }
        }

        List<Integer> data = new ArrayList<>();
        for (int i = 0; i < primeList.size(); i++) {
            if (primeList.get(i)) data.add(i);
        }

        Integer[] gap = null;
        for (int i = 0; i < data.size(); i++) {
            for (int j = i; j < data.size(); j++) {
                if (data.get(i)+data.get(j) == n){
                    if (gap==null) {
                        gap = new Integer[]{data.get(i),data.get(j)};
                    }else {
                        if (Math.abs(data.get(i)-data.get(j))  < Math.abs(gap[0]-gap[1])){
                            gap[0] = data.get(i);
                            gap[1] = data.get(j);
                        }
                    }
                }
            }
        }

        System.out.println(gap[0] + " " + gap[1]);

    }
}
