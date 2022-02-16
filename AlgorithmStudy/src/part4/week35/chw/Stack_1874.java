package part4.week35.chw;

public class Stack_1874 {
    public static void main(String[] args) {

    }
}
/*

import sys

n = int(sys.stdin.readline())
stack = []
arr = [num+1 for num in range(n+1)]
result = []
for _ in range(n):
    input_num = int(sys.stdin.readline())
    for num in arr:
        if len(stack) != 0 and stack[-1] == input_num:
            result.append('-')
            rm_num = stack.pop()
            arr.remove(rm_num)
            break
        else:
            if num not in stack:
                result.append('+')
                stack.append(num)
if len(stack) == 0:
    for num in result:
        print(num)
else:
    print('NO')

*/