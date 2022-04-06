import sys
import heapq
N = int(sys.stdin.readline())
min_heap = []
for _ in range(N):
    num = int(sys.stdin.readline())
    if num == 0:
        if len(min_heap) == 0:
            print(0)
        else:
            print(heapq.heappop(min_heap))
    else:
        heapq.heappush(min_heap, num)