import sys
import itertools

N,K = map(int, sys.stdin.readline().split())
cum = [0]+list(itertools.accumulate(list(map(int, sys.stdin.readline().split()))))
result = -sys.maxsize
for i in range(K,N+1):
    if cum[i] - cum[i-K] > result:
        result = cum[i] - cum[i-K]
print(result)