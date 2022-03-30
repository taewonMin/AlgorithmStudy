# 풀이 1
# import sys

# N = int(sys.stdin.readline())
# n_numbers = [int(number) for number in sys.stdin.readline().split()]
# n_numbers.sort()
# M = int(sys.stdin.readline())
# m_numbers = [int(number) for number in sys.stdin.readline().split()]

# def binarySearch(numbers, num, start, end):
#     if start > end: return 0
#     mid = (start+end)//2
#     if numbers[mid] == num:
#         return numbers[start:end+1].count(num)
#     elif numbers[mid] < num:
#         return binarySearch(numbers, num, mid+1, end)
#     else:
#         return binarySearch(numbers, num, start, mid-1)

# for num in m_numbers:
#     print(binarySearch(n_numbers, num, 0, N-1))
    
# collections counter 풀이
import sys
from collections import Counter

N = int(sys.stdin.readline())
n_numbers = sys.stdin.readline().split()
M = int(sys.stdin.readline())
m_numbers = sys.stdin.readline().split()

C = Counter(n_numbers)
print(' '.join(f'{C[num]}' if num in C else '0' for num in m_numbers))
# print(f'{C[num]}' if num in C else '0' for num in m_numbers)
# for num in m_numbers:
#     if num in C:
#         print(C[num])
#     else:
#         print('0')
