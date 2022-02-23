package part4.week36.chw;

public class Queue_5430 {
    public static void main(String[] args) {

    }
}

/*
import sys
from collections import deque

T = int(sys.stdin.readline())
for _ in range(T):
    p = sys.stdin.readline().strip()
    n = int(sys.stdin.readline())
    deq = deque(sys.stdin.readline().strip()[1:-1].split(','))
    
    check_error = False
    r_cnt = 0
    result = '['
    if n == 0:
        deq = []
    for c in p:
        if c == 'R':
            r_cnt += 1
        elif len(deq) < 1:
            print('error')
            check_error = True
            break
        elif r_cnt % 2 == 1:
            deq.pop()
        else:
            deq.popleft()

    if not check_error:
        if r_cnt % 2 == 1:
            deq.reverse()
        # for num in deq:
        #     result += num+','
        # print(result[:-1]+']')
        print("[" + ",".join(deq) + "]")

*/