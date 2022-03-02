package part4.week37.chw;

public class DivideConquer_2630 {
    public static void main(String[] args) {

    }
}
/*

import sys

N = int(sys.stdin.readline())
arr2d = [[x for x in list(map(int,sys.stdin.readline().strip().split()))] for _ in range(N)]

def recur(x,y,N):
    global blueCnt
    global whiteCnt
    val = arr2d[x][y]
    for i in range(x,x+N):
        for j in range(y,y+N):
            if val != arr2d[i][j]:
                recur(x,y,N//2)
                recur(x,y+N//2,N//2)
                recur(x+N//2,y,N//2)
                recur(x+N//2,y+N//2,N//2)
                return

    if val == 1:
        blueCnt+=1
    else:
        whiteCnt+=1
        
global blueCnt
global whiteCnt
blueCnt = 0
whiteCnt = 0
recur(0,0,N)
print(whiteCnt)
print(blueCnt)


*/