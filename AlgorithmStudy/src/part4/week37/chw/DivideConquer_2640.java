package part4.week37.chw;

public class DivideConquer_2640 {
    public static void main(String[] args) {

    }
}
/*

import sys

N, M = map(int, sys.stdin.readline().strip().split())
A = []
for _ in range(N):
    A.append(list(map(int, sys.stdin.readline().strip().split())))

M, K = map(int, sys.stdin.readline().strip().split())
B = []
for _ in range(M):
    B.append(list(map(int, sys.stdin.readline().strip().split())))

for i in range(N):
    arr = []
    for j in range(K):
        sum = 0
        for k in range(M):    
            sum += A[i][k]*B[k][j]
        arr.append(str(sum))
    print(' '.join(arr))  

*/