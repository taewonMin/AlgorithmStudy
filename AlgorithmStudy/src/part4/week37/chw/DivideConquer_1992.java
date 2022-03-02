package part4.week37.chw;

public class DivideConquer_1992 {
    public static void main(String[] args) {

    }
}
/*

import sys
N = int(sys.stdin.readline())
arr2d = [[int(x) for x in sys.stdin.readline().strip()] for _ in range(N)]
result = []
def recur(x, y, N):
    color = arr2d[x][y]
    for i in range(x,x+N):
        for j in range(y,y+N):
            if color != arr2d[i][j]:
                result.append('(')
                recur(x,y,N//2)
                recur(x,y+N//2,N//2)
                recur(x+N//2,y,N//2)
                recur(x+N//2,y+N//2,N//2)
                result.append(')')
                return
    if color:
        result.append('1')
    else:
        result.append('0')
recur(0,0,N)
print(''.join(result))

*/