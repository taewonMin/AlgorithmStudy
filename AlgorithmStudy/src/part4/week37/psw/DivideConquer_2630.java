package part4.week37.psw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DivideConquer_2630 {
    static String[][] map;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        map = new String[n][];
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            map[i] = line.split(" ");
            sb.append(line);
        }

        int[] answer;
        if (sb.indexOf("0") == -1 || sb.indexOf("1") == -1) {
            answer = sb.indexOf("0") > -1 ? new int[]{1,0} : new int[]{0,1};
        }else {
            answer = divAndConq(0,0,n);
        }
        System.out.println(answer[0]+"\n"+answer[1]);
    }

    private static int[] divAndConq(int i, int j, int n) {
        int[] cnt = {0,0};
        for (int k = 0; k < 2; k++) {
            for (int l = 0; l < 2; l++) {
                int x = i + k*(n/2), y = j + l*(n/2), z = n/2;
                boolean same = search(x,y,z);
                if (!same){
                    int[] hing = divAndConq(x,y,z);
                    cnt[0] += hing[0];
                    cnt[1] += hing[1];
                }else {
                    int idx = "1".equals(map[x][y]) ? 1 : 0;
                    cnt[idx]++;
                }
            }
        }
        return cnt;
    }

    private static boolean search(int i, int j, int n) {
        String flag = map[i][j];
        for (int k = 0; k < n; k++) {
            for (int l = 0; l < n; l++) {
                if (!flag.equals(map[k+i][l+j])) return false;
            }
        }
        return true;
    }
}
