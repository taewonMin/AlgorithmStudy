package part2.week17.jje;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Tree_1991 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<String, List<String>> treeMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            ArrayList<String> numList = new ArrayList<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            String key = st.nextToken();
            numList.add(st.nextToken());
            numList.add(st.nextToken());
            treeMap.put(key, numList);
        }

        leftTree(treeMap);


        sc.close();
    }

    public static void leftTree(Map<String, List<String>> treeMap){
        for(String key : treeMap.keySet()){
            System.out.println(key);
            List<String> numList = treeMap.get(key);
            if(!".".equals(numList.get(0))){
                System.out.println(numList.get(0));
            }

        }
    }
}