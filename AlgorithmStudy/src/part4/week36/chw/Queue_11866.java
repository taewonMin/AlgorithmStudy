package part4.week36.chw;

public class Queue_11866 {
    public static void main(String[] args) {

    }
}
/*

import sys
from collections import deque

deq = deque()
N, K = list(map(int, sys.stdin.readline().split()))
answer = "<"
for num in range(N):
    deq.append(num+1)
idx = 1
while deq:
    if idx % K == 0:
        val = deq.popleft()
        answer += str(val) + ', '
    else:
        deq.append(deq.popleft())
    idx += 1
print(answer[:-2] + '>')

*/