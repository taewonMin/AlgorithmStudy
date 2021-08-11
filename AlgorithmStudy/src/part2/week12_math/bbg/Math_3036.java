package part2.week12_math.bbg;

import java.util.Scanner;
//링
public class Math_3036 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] rings = new int[N];

		for(int cnt=0 ; cnt < N ; cnt++) {
			rings[cnt] = sc.nextInt();
		}
		
		for(int cnt=1 ; cnt < N ; cnt++) {
			int e = 0; // 나머지 담을 변수
			String result = "";
			if(rings[0] >= rings[cnt]) {
				e =  rings[0]%rings[cnt];
			}else {
				e = rings[cnt]%rings[0];
			}
			
			if(e == 0) {
				if(rings[0] >= rings[cnt]) {
					result = rings[0]/rings[cnt] + "/" + rings[cnt]/rings[cnt];
				}else {
					result = rings[0]/rings[0] + "/" + rings[cnt]/rings[0];
				}
			}else {
				if(rings[0]%e == 0) {
					result = rings[0]/e + "/" + rings[cnt]/e;
				}else {
					result = rings[0] + "/" + rings[cnt];
				}
			}
			System.out.println(result);
		}
		
		sc.close();
	}
}
/*
#include <iostream>
using namespace std;
int main(){
    int N;
    cin >> N ;
    int nums[N]{};
    
    for(int cnt = 0 ;cnt < N ; cnt++){
        cin >> nums[cnt];
    }
    for(int cnt=1 ; cnt < N ; cnt++ ){
        int e ;
        if(nums[0] >= nums[cnt]){
            e = nums[0]%nums[cnt];
        }else{
            e = nums[cnt]%nums[0];
        }
        
        if(e == 0){
            if(nums[0] >= nums[cnt]){
                cout << nums[0]/nums[cnt] << "/" << nums[cnt]/nums[cnt] << endl;
            }else{
                cout << nums[0]/nums[0] << "/" << nums[cnt]/nums[0] << endl;
            }
        }else{
            if(nums[0]%e == 0){
                cout << nums[0]/e << "/" << nums[cnt]/e << endl;
            }else{
                cout << nums[0] << "/" << nums[cnt] << endl;
            }
        }
    }
    return 0;
}

*/