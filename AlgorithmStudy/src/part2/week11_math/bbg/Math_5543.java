package part2.week11_math.bbg;

import java.util.Arrays;
import java.util.Scanner;

//상근날드 17588KB 212ms
public class Math_5543 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] burgers = new int[3];
		int[] beverages = new int[2];
		
		for(int idx = 0 ; idx < burgers.length ; idx++) {
			burgers[idx] = sc.nextInt();
		}
		for(int idx = 0 ; idx < beverages.length ; idx++) {
			beverages[idx] = sc.nextInt();
		}
		
		Arrays.sort(burgers);
		Arrays.sort(beverages);
		
		System.out.println(burgers[0] + beverages[0] - 50);
		
		sc.close();
	}
}
/* 1112KB	0ms
 #include <stdio.h>

int main(){
    int burgers[3]{};
    int beverages[2]{};
    int temp;
    for(int idx = 0 ; idx < sizeof(burgers)/sizeof(int) ; idx++){
        scanf("%d\n", &burgers[idx]);
    }
    for(int idx = 0 ; idx < sizeof(beverages)/sizeof(int) ; idx++){
        scanf("%d\n", &beverages[idx]);
    }
    // 버거 정렬
    for(int j = 0 ; j < sizeof(burgers)/sizeof(int) ; j++ ){
        for(int i = 0 ; i <sizeof(burgers)/sizeof(int)-1 ; i++ ){
            if(burgers[i] > burgers[i+1]){
                temp = burgers[i];
                burgers[i] = burgers[i+1];
                burgers[i+1] = temp;
            }
        }
    }
    // 음료 정렬
    for(int j = 0 ; j < sizeof(beverages)/sizeof(int) ; j++ ){
        for(int i = 0 ; i <sizeof(beverages)/sizeof(int)-1 ; i++ ){
            if(beverages[i] > beverages[i+1]){
                temp = beverages[i];
                beverages[i] = beverages[i+1];
                beverages[i+1] = temp;
            }
        }
    }
    
    printf("%d\n", burgers[0] + beverages[0] - 50);
    
    return 0;
} 
 */