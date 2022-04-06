import sys
import heapq

N = int(sys.stdin.readline())
max_heap = []
for _ in range(N):
    num = int(sys.stdin.readline())
    if num == 0:
        if len(max_heap) == 0:
            print(0)
        else:
            print(heapq.heappop(max_heap)[1])
    else:
        heapq.heappush(max_heap, (-num, num))