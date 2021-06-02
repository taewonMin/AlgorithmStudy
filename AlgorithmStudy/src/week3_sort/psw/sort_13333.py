n = int(input())
answer = 0
array = [int(i) for i in input().split()]

array.sort(key=None, reverse=False)
i = 0
for k in array :
    if k <= n-i :
        answer = k
        if i+1 < n :
            q = array[i+1]
            for j in range(q-k):
                if q - (j+1) < n-i :
                    answer = q-(j+1)
                    break
    i += 1 

if array[0] > n :
    answer = n 
print(answer)