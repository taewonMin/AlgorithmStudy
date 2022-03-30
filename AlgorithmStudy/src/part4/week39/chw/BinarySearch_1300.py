import sys

N = int(sys.stdin.readline())
K = int(sys.stdin.readline())

start, end = 1, K

while start <= end:
    mid = (start + end)//2
    tmp = 0
    for i in range(1, N+1):
        tmp += min(mid//i, N)
    if tmp >= K:
        ans = mid
        end = mid-1
    else:
        start = mid+1
print(ans)