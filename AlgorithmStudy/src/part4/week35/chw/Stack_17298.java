package part4.week35.chw;

public class Stack_17298 {
    public static void main(String[] args) {

    }
}
/*

import sys

n = int(sys.stdin.readline())
stack = list(map(int, sys.stdin.readline().split()))

result = ''
for i in range(n-1):
    for j in range(i+1,n):
        if stack[i] < stack[j]:
            result += str(stack[j]) + ' '
            break

        if j == n-1:
            result += '-1 '
result += '-1'
print(result)

*/