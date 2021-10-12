package part3.week21.mtw;

import java.util.Scanner;

// 영화감독 숌
class Brute_1436 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        System.out.println(bruteForce(N));

        sc.close();
    }

    public static String bruteForce(int N){
        String answer = "666";
        int cnt = 1;
        int preNum = 1;
        int lastNum = 0;
        while(cnt != N){
            // 6660~6669 : 6659666 (6660000 ... 6669999) 6670666 -> 1000개 * 10
            // 665666 (666000 666001 666002 ... 666998 666999) 667666 -> 1000개
            if(preNum/10 == 666 || preNum%1000 == 666){ 
                answer = String.valueOf(preNum*1000 + lastNum);
                lastNum++;
                if(lastNum == 1000){
                    lastNum = 0;
                    preNum++;
                }
            }else if(preNum%100 == 66){   // 65666 (66600 66601 66602 ... 66698 66699) 67666 -> 100개
                answer = preNum + String.valueOf(600 + lastNum);
                lastNum++;
                if(lastNum == 100){
                    lastNum = 0;
                    preNum++;
                }
            }else if(preNum%10 == 6){ // 5666 (6660 6661 6662 ... 6668 6669) 7666 -> 10개
                answer = preNum + "66" + lastNum;
                lastNum++;
                if(lastNum == 10){
                    lastNum = 0;
                    preNum++;
                }
            }else{
                answer = preNum + "666";
                preNum++;
            }
            cnt++;
        }

        return answer;
    }
}