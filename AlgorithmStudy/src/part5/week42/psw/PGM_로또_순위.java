package part5.week42.psw;

import java.util.*;

public class PGM_로또_순위 {
    public static void main(String[] args) {
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums ={31, 10, 45, 1, 6, 19};
        int[] result = {3,5};
        int[] answer = solution(lottos,win_nums);
        System.out.println(Arrays.equals(result,answer));
    }

    public static int[] solution(int[] lottos, int[] win_nums){
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 6; i++) {
            set.add(win_nums[i]);
        }
        int zero = 0, hit = 0;
        Arrays.sort(lottos);
        for (int i = 0; i < 6; i++) {
            if (lottos[i]==0){
                zero++;
            }else {
                if (set.contains(lottos[i])){
                    hit++;
                }
            }
        }
        return new int[]{7-(hit+zero==0 ? 1 : hit+zero),7-(hit < 2 ? 1 : hit)};
    }
}
