package part4.week37.chw;

public class DivideConquer_1629 {
    public static void main(String[] args) {

    }
}
/*

import sys
A, B, C = map(int, sys.stdin.readline().strip().split())

def calcul(a, n):
    if n == 1:
        return a % C
    else:
        tmp = calcul(a,n//2)
        if n % 2 == 0:
            return (tmp * tmp) % C
        else:
            return (tmp * tmp * A) % C

print(calcul(A,B))

*/