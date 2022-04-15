package part5.week42.psw;

import java.util.*;

public class PGM_신고_결과_받기 {
    public static void main(String[] args) {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k = 2;
        int[] result  = {2,1,1,0};
        int[] answer = solution(id_list,report,k);
        System.out.println(Arrays.equals(result,answer));
    }

    static int cnt;
    public static int[] solution(String[] id_list, String[] report, int k){
        Map<String, Set<String>> reportSet = new HashMap<>();
        Map<String,Integer> res = new HashMap<>();

        for (int i = 0; i < report.length; i++) {
            String a = report[i].split(" ")[0];
            String b = report[i].split(" ")[1];
            if (reportSet.get(a) == null) reportSet.put(a, new HashSet<>());
            if (reportSet.get(a).add(b)){
                if (res.get(b)==null) res.put(b,0);
                res.put(b,res.get(b)+1);
            }
        }

        int[] answer = new int[id_list.length];

        for (int i = 0; i < answer.length; i++) {
            cnt = 0;
            if (reportSet.get(id_list[i]) != null){
                reportSet.get(id_list[i]).forEach((id)->{
                    if (res.get(id) != null && res.get(id) >= k){
                        cnt++;
                    }
                });
            }
            answer[i] = cnt;
        }
        return answer;
    }
}
