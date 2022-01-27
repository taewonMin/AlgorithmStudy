package part4.week33.psw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
            if (a.gap==b.gap) return Integer.compare(a.start,b.start);
            return Integer.compare(a.gap,b.gap);
        });

        List<Meeting> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            boolean flag = true;
            for (int j = 0; j < list.size(); j++) {
                if (meetings[i].contains(list.get(j))){
                    flag = false;
                    break;
                }
            }
            if (flag) list.add(meetings[i]);
        }
        System.out.println(list.size());
    }
}

class Meeting{
    int start;
    int end;
    int gap;

    public Meeting(int start, int end) {
        this.start = start;
        this.end = end;
        this.gap = end-start;
    }

    public boolean contains(Meeting meeting){
        if (this.start <= meeting.start && meeting.end <= this.end ) return false;
        return true;
    }
}
/*
11
1 4
3 5
0 6
5 7
3 8
5 9
6 10
8 11
8 12
2 13
12 14
 */