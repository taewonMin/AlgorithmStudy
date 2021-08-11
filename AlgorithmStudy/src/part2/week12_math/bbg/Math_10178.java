package part2.week12_math.bbg;

import java.util.Scanner;
//할로윈 17636KB 240ms
public class Math_10178 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 케이스 횟수
		int cnt = sc.nextInt();
		
		for(int i = 0 ; i < cnt ; i++) {
			int c = sc.nextInt();
			int v = sc.nextInt();
			System.out.printf("You get %d piece(s) and your dad gets %d piece(s).%n", c/v, c%v);
		}
		
		sc.close();
	}
}
/* 2020KB 0ms
#include <iostream>
using namespace std;

int main(){
    int cnt, c, v;
    
    cin >> cnt;
    for(int i=0 ; i<cnt ; i++){
        cin >> c >> v ;
        cout << "You get " << c/v << " piece(s) and your dad gets " << c%v << " piece(s)." << endl;
    }
    
    return 0;
}
*/