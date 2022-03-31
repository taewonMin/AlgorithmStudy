import sys

K, N = map(int, sys.stdin.readline().split())

max = 0
arr = []
for i in range(K):
    input = int(sys.stdin.readline())
    arr.append(input)
    if max == 0: max = input
    elif max < input: max = input

def calcul_N(mid):
    sum = 0
    for num in arr:
        sum += num // mid
    return sum

def binarySearch(start, end):
    if start > end: return end

    mid = (start+end)//2
    cal_n = calcul_N(mid)
    if cal_n >= N:
        return binarySearch(mid+1, end)
    else:
        return binarySearch(start, mid-1)

print(binarySearch(1, max))