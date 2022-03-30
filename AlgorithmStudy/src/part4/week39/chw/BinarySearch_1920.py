import sys

N = int(sys.stdin.readline())
n_numbers = [int(number) for number in sys.stdin.readline().split()]
n_numbers.sort()
M = int(sys.stdin.readline())
m_numbers = [int(number) for number in sys.stdin.readline().split()]

def binarySearch(numbers, num, start, end):
    if start > end: return 0
        
    mid = (start+end)//2
    if numbers[mid] == num:
        return 1
    elif numbers[mid] < num:
        return binarySearch(numbers, num, mid+1, end)
    else:
        return binarySearch(numbers, num, start, mid-1)

for num in m_numbers:
    print(binarySearch(n_numbers, num, 0, N-1))