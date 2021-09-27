package part2.week18.mtw;

import java.util.Scanner;

public class Math_1100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int answer = 0;
        for(int i=0; i<8; i++){
            String input = sc.nextLine();
            for(int j=0; j<input.length(); j++){
                if(i%2 == 0 && j%2 == 0 && input.charAt(j) == 'F'){
                    answer++;
                }else if(i%2 == 1 && j%2 == 1 && input.charAt(j) == 'F'){
                    answer++;
                }
            }
        }

        System.out.println(answer);

        sc.close();

    }
}
