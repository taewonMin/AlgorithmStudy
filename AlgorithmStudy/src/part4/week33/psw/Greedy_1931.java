package part4.week33.psw;

import java.util.Arrays;
import java.util.Scanner;

public class Greedy_1931 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Meeting[] meetings = new Meeting[n];
        for (int i = 0; i < n; i++) {
            meetings[i] = new Meeting(sc.nextInt(),sc.nextInt());
        }

        Arrays.sort(meetings,(a,b)->{
            if (a.end==b.end) return Integer.compare(a.start,b.start);
            return Integer.compare(a.end,b.end);
        });

        int max= meetings[0].end, answer=1;
        for (int i = 1; i < n; i++) {
            if (meetings[i].end >= max && meetings[i].start >= max){
                answer++;
                max = meetings[i].end;
            }
        }
        System.out.println(answer);
    }
}

class Meeting{
    int start;
    int end;

    public Meeting(int start, int end) {
        this.start = start;
        this.end = end;
    }
}
/*
11
1 4
3 4
4 4
5 7
3 8
5 9
6 10
8 11
8 12
2 13
12 14
 */