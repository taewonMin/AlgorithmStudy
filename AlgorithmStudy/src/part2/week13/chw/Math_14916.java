package part2.week13.chw;

import java.util.Scanner;

public class Math_14916 {
	// 자바 for문 232ms
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int change = sc.nextInt();
		int cnt = change / 5;
		for(int i = cnt; i >= 0; i--) {
			if(((change - 5 * i) % 2) == 0) {
				System.out.println(i + (change - 5 * i) / 2);
				break;
			}else if(i == 0) {
				System.out.println(-1);
			}
		}
		sc.close();
	}
}
	
// 자바 while문 228ms
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		int change = sc.nextInt();
//		int cnt = change / 5;
//		
//		while(true) {
//			if((change - 5 * cnt) % 2 == 0) {
//				System.out.println(cnt + (change - 5 * cnt) / 2);
//				break;
//			}else if(cnt == 0) {
//				System.out.println(-1);
//				break;
//			}else {
//				cnt--;
//			}
//		}
//		sc.close();
//	}

/*
파이썬 

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