import sys
import heapq
N = int(sys.stdin.readline())
abs_heap = []
result_heap = []
for _ in range(N):
    num = int(sys.stdin.readline())
    if num == 0:
        if len(abs_heap) == 0:
            print(0)
        else:
            print(heapq.heappop(abs_heap)[1])
    else:
        heapq.heappush(abs_heap, (abs(num), num))