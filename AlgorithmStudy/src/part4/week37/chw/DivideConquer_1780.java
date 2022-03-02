package part4.week37.chw;

public class DivideConquer_1780 {
    public static void main(String[] args) {

    }
}
/*

import sys
N = int(sys.stdin.readline())
arr2d = [[x for x in list(map(int,sys.stdin.readline().strip().split()))] for _ in range(N)]
result = []
def recur(x,y,N):
    color = arr2d[x][y]
    for i in range(x,x+N):
        for j in range(y,y+N):
            if color != arr2d[i][j]:
                recur(x,y,N//3)
                recur(x,y+N//3,N//3)
                recur(x,y+(N//3)*2,N//3)

                recur(x+N//3,y,N//3)
                recur(x+N//3,y+N//3,N//3)
                recur(x+N//3,y+(N//3)*2,N//3)

                recur(x+(N//3)*2,y,N//3)
                recur(x+(N//3)*2,y+N//3,N//3)
                recur(x+(N//3)*2,y+(N//3)*2,N//3)
                return
    if color == 1:
        result.append(1)
    elif color == 0:
        result.append(0)
    elif color == -1:
        result.append(-1)
recur(0,0,N)
print(result.count(-1))
print(result.count(0))
print(result.count(1))

*/