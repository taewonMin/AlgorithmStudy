package part5.week42.psw;


import java.util.Arrays;
/*
라이언이 가장 큰 점수 차이로 우승할 수 있는 방법이 여러 가지 일 경우
, 가장 낮은 점수를 더 많이 맞힌 경우를 return 해주세요.
 */
public class PGM_양궁 {
    public static void main(String[] args) {
        int n = 10;
        int[] info = {2,1,1,1,0,0,0,0,0,0,0};
        int[] answer = {0,2,2,0,1,0,0,0,0,0,0};
        int[] result = new PGM_양궁().solution(n,info);
    }

    public int[] solution(int n, int[] info){
        dfs(info, n, 1);
        return result;
    }

    static int[] log = new int[11], result={-1};
    static int max = Integer.MIN_VALUE;
    //static long x = 649877, y = 2645740922;
    private void dfs(int[] info, int n, int cnt) {
        if (n==cnt-1){
            int p_score = 0, l_score = 0;
            for (int i = 0; i < 11; i++) {
                if (info[i]+log[i] != 0) {
                    if (info[i] < log[i]) l_score += (10-i);
                    else p_score += (10-i);
                }
            }

            if (p_score < l_score && l_score - p_score >= max){
                max = l_score - p_score;
                result = log.clone();
            }
            return;
        }

        for(int i = 0; i < 11 && log[i] < info[i]+1; i++) {
            log[i]++;
            dfs(info,n,cnt+1);
            log[i]--;
        }

//        for(int i = 0; i < 11; i++) {
//            if (log[i] < info[i]+1){
//                log[i]++;
//                bf(info,n,cnt+1);
//                log[i]--;
//            }else break;
//        }
    }
}

/*
3 ? ? ? ? ? ? ? ? //
2 ? ? ? ? ? ? ? ?
1 ? ? ? ? ? ? ?
0 ? ? ? ? ? ? ? ?
1   2   3   4   5   6   7   8   9   10

t  t
    f
f   t
    f
모든 경우의 수 = 1024
근데 가지치기가 가능함, 전체 탐색은 필요 없음 -> backTracking
백트래킹 조건
1. 화살을 다 쏴버린 경우
2. 앞으로 이겼을때 얻을 수 있는 최대 점수가, 상대의 총점보다 낮을 때

Q. 이길 수 있는 경우에 그 기록을 정답으로 내는데 기록을 어떻게 들고다닐까? (파라매터?)
    -> 점수의 max 를 확인하고 전역변수에 저장

들고 다녀야 하는 것.
1. 과녁 인덱스
2. 남은 화살 수
3. 내 점수
4. 점수 기록
 */


