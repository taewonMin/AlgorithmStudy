package week13.chw;

import java.util.Scanner;

public class Math_1292 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		sc.close();
	}
}
/*
파이썬
def make_arr(B, arr):
    total = 0
    idx = 1
    while True:
        total += idx
        if int(B) < total:
            break
        idx+=1
    for i in range(idx):
        for _ in range(i+1):
            arr.append(i+1)   
    return arr

A, B = input().split()

result = 0
arr = make_arr(B, [])
for i in range(int(A)-1,int(B)):
    result += arr[int(A)]
print(result)


*/