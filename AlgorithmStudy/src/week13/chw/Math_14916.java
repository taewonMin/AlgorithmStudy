package week13.chw;

import java.util.Scanner;

public class Math_14916 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		sc.close();
	}
}

/*

for문 80ms
change = int(input())
cnt = change // 5
for i in range(cnt,-1,-1):
    if (change - 5 * i) % 2 == 0:
        print(i + (change - 5 * i) // 2)
        break    
    elif i == 0:
        print(-1)

while문 76ms
change = int(input())
cnt = change // 5
while True:
    if (change - 5 * cnt) % 2 == 0:
        print(cnt + (change - 5 * cnt) // 2)
        break    
    elif cnt == 0:
        print(-1)
        break
    else:
        cnt-=1
*/