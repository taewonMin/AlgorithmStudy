package part5.week42.psw;

public class PGM_건물 {
    public static void main(String[] args) {
//        int[][] board = {{5,5,5,5,5},{5,5,5,5,5},{5,5,5,5,5},{5,5,5,5,5}};
//        int[][] skill = {{1,0,0,3,4,4},{1,2,0,2,3,2},{2,1,0,3,1,2},{1,0,1,3,3,1}};
        int[][] board = {{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1}};
        int[][] skill = {{2,0,0,1,1,1},{2,1,1,2,2,2},{2,2,2,3,3,3},{2,3,3,4,4,4}};
        int answer = 10;
        int result = new PGM_건물().solution2(board,skill);
    }

    public int solution(int[][] board, int[][] skill){
        int n = board.length, m = board[0].length;
        int[][] prefix = new int[n+1][m+1];

        for (int i = 0; i < skill.length; i++) {
            command(prefix,skill[i]);
        }

        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(j != 0) prefix[i][j] += prefix[i][j-1];
                if (board[i][j] + prefix[i][j]> 0) result++;
            }
        }
        return result;
    }

    private void command(int[][] prefix, int[] skill) {
        int action = skill[0]==1 ? -skill[5] : skill[5];
        int a1 = skill[1], b1 = skill[2], a2 = skill[3], b2 = skill[4];
        for (int i = a1; i <= a2; i++) {
            prefix[i][b1] += action;
            prefix[i][b2+1] += -action;
        }
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////
    static int[][] sum;
    static int N, M;

    public int solution2(int[][] board, int[][] skill) {
        N = board.length;
        M = board[0].length;

        sum = new int[N + 1][M + 1];
        for (int[] s : skill) {
            int y1 = s[1], x1 = s[2];
            int y2 = s[3], x2 = s[4];
            int degree = s[5] * (s[0] == 1 ? -1 : 1);

            sum[y1][x1]         += degree;
            sum[y1][x2 + 1]     += (degree * -1);
            sum[y2 + 1][x1]     += (degree * -1);
            sum[y2 + 1][x2 + 1] += degree;
        }
        operate();

        // 살아남은 건물 확인
        int answer = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (board[i][j] + sum[i][j] > 0) answer++;
            }
        }
        return answer;
    }

    // 누적합 계산
    private static void operate() {
        // 상하
        for (int y = 1; y < N; y++) {
            for (int x = 0; x < M; x++) {
                sum[y][x] += sum[y - 1][x];
            }
        }
        // 좌우
        for (int x = 1; x < M; x++) {
            for (int y = 0; y < N; y++) {
                sum[y][x] += sum[y][x - 1];
            }
        }
    }
}
/*
skill의 각 행은 [type, r1, c1, r2, c2, degree]
type은 1 혹은 2입니다.
type이 1일 경우는 적의 공격을 의미합니다. 건물의 내구도를 낮춥니다.
type이 2일 경우는 아군의 회복 스킬을 의미합니다. 건물의 내구도를 높입니다.
(r1, c1)부터 (r2, c2)까지 직사각형 모양의 범위 안에 있는 건물의 내구도를 degree 만큼 낮추거나 높인다는 뜻입니다.
0 ≤ r1 ≤ r2 < board의 행의 길이
0 ≤ c1 ≤ c2 < board의 열의 길이
1 ≤ degree ≤ 500
type이 1이면 degree만큼 건물의 내구도를 낮춥니다.
type이 2이면 degree만큼 건물의 내구도를 높입니다.
 */