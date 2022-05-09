package part5.week42.psw;

import java.util.*;

public class PGM_주차_요금_계산 {
    public static void main(String[] args) {
        int[] fees = {180, 5000, 10, 600};
        String[] records = {"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"};
        int[] answer = {14600, 34400, 5000};
//        int[] result = solution(fees,records);
//        System.out.println(Arrays.equals(answer,result));
    }

    public static int[] solution(int[] fees, String[] records){
        Map<String,Queue<String>> map = new HashMap<>();

        for (String str : records){
            String[] record = str.split(" ");
            if (map.get(record[1]) == null) map.put(record[1], new LinkedList<>());

            map.get(record[1]).add(record[0]);
        }
        String[] keys = map.keySet().toArray(new String[map.size()]);
        Arrays.sort(keys);

        int[] result = new int[map.size()];
        int i = 0;
        for (String key : keys){
            Queue<String> queue = map.get(key);

            int totalFee = fees[1];
            int totalTime = 0;
            while (!queue.isEmpty()){
                String in = queue.poll();
                String out = !queue.isEmpty() ? queue.poll() : "23:59";

                totalTime += (Integer.parseInt(out.substring(0,2))*60+Integer.parseInt(out.substring(3,5)))-
                        (Integer.parseInt(in.substring(0,2))*60+Integer.parseInt(in.substring(3,5)));
            }

            if (totalTime > fees[0]){
                totalFee += Math.ceil((float)(totalTime-fees[0])/fees[2])*fees[3];
            }

            result[i++] = totalFee;
        }
        return result;
    }


}
