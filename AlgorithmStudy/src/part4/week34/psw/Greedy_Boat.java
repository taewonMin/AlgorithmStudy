package part4.week34.psw;

public class Greedy_Boat {
    public static void main(String[] args) {
        int[] people = {70, 50, 80};
        int limit = 100;
        int assume = new Greedy_Boat().solution(people,limit);
        System.out.println(assume);
    }
    // Tow Pointer 알고리즘
    public int solution2(int[] people, int limit){
        java.util.Arrays.sort(people);
        int answer = 0;
        int lt = 0, rt = people.length-1;
        while (lt<=rt){
            int sum = people[lt]+people[rt];
            if(lt!=rt-- && sum<=limit) lt++;
            answer++;
        }
        return answer;
    }
/*
    무인도에 갇힌 사람은 1명 이상 50,000명 이하입니다.
    각 사람의 몸무게는 40kg 이상 240kg 이하입니다.
    구명보트의 무게 제한은 40kg 이상 240kg 이하입니다.
    구명보트의 무게 제한은 항상 사람들의 몸무게 중 최댓값보다 크게 주어지므로 사람들을 구출할 수 없는 경우는 없습니다.
 */
    public int solution(int[] people, int limit){
        java.util.Arrays.sort(people);
        int len = people.length;
        int answer = 0;
        boolean[] isBoarded = new boolean[len];

        for (int i = len-1; i > -1; i--) {
            if (!isBoarded[i]){
                boolean flag = false;
                if (people[i]+40<=limit){
                    for (int j = 0; j < i; j++) {
                        if (people[i]+people[j]>limit) break;
                        if (!isBoarded[j]&&people[i]+people[j]<=limit){
                            isBoarded[j]=true;
                            answer++;
                            flag = true;
                            break;
                        }
                    }
                }
                if (!flag) { answer++; }
            }
        }
        return answer;
    }
}
