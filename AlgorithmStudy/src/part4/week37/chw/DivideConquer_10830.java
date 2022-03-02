package part4.week37.chw;

public class DivideConquer_10830 {
    public static void main(String[] args) {

    }
}
/*

import sys
N, B = map(int, sys.stdin.readline().strip().split())
matrix = [list(map(int,sys.stdin.readline().strip().split())) for _ in range(N)]
def matrix_square(mat1, mat2):
    result = []
    for i in range(N):
        tmp_arr = []
        for j in range(N):
            sum = 0
            for k in range(N):
                sum += mat1[i][k]*mat2[k][j]
            tmp_arr.append(sum%1000)
        result.append(tmp_arr)
    return result
def calcul(a, b):
    if b == 1:
        return a
    else:
        tmp = calcul(a, b//2)
        tmp_square = matrix_square(tmp, tmp)
        if b % 2 == 1: 
            return matrix_square(tmp_square, a)
        return tmp_square
result = calcul(matrix, B)
for arr in result:
    str1 = ''
    for num in arr:
        str1+=str(num%1000) + ' '
    print(str1)

*/