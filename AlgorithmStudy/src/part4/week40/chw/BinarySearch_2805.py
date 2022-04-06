import sys

N, M = map(int, sys.stdin.readline().split())
tree_arr = list(map(int, sys.stdin.readline().split()))
tree_arr.sort()

def calculate_m(mid):
    sum = 0
    for tree in tree_arr:
        if tree < mid: continue
        sum += tree - mid
    return sum

start, end = 0, tree_arr[-1]
while start<=end:
    mid = (start+end)//2
    calcul_m = calculate_m(mid)
    if calcul_m >= M:
        start = mid + 1
    else:
        end = mid - 1
print(end)