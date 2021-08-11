package part2.week13.chw;

import java.util.Scanner;

public class Math_1292 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int start = sc.nextInt();
		int end = sc.nextInt();
		
		int result = 0;
		int total = 0;
		int idx = 1;
		int idx2 = 0;
		
		int[] arr = new int[end];
		
		while(true) {
			total += idx;
			if(end < total) break;
			idx++;
		}
		
		for(int i = 0; i < idx; i++) {
			for(int j = 0; j < i + 1; j++) {
				if(idx2 == end) break;
				arr[idx2] = i + 1;
				idx2++;
			}
		}
		
		for(int i = start - 1; i < end; i++) {
			result += arr[i];
		}
		System.out.println(result);
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
    result += arr[i]
print(result)


*/