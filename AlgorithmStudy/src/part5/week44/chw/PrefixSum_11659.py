import sys
import itertools

N, M = map(int, sys.stdin.readline().split())
arr = list(itertools.accumulate(list(map(int, sys.stdin.readline().split()))))
for _ in range(M):
    i, j = map(int, sys.stdin.readline().split())
    print(arr[j-1]) if i - 1 == 0 else print(arr[j-1]-arr[i-2])