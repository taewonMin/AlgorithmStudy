package week10_math.bbg;

import java.util.Scanner;

//파스칼 17672KB 212ms
public class Math_16395 {
	static int[][] pascalArr = new int[30][30]; 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(pascal(sc.nextInt(), sc.nextInt()));
	}
	
	public static int pascal(int row, int col) {
		for(int r = 0 ; r < row ; r++) {
			for(int c = 0 ; c < r+1 ; c++) { //  첫번째 돌땐 0번방만 채우고 나가야돼
				if(r==0 && c==0) {
					pascalArr[r][c] = 1;
				}else if(r!=0 && c==0) {	
					pascalArr[r][c] = pascalArr[r-1][c];
				}else if(c != 0 && c != r){
					pascalArr[r][c] = pascalArr[r-1][c-1] + pascalArr[r-1][c];
				}else { // 0 0은 아니면서 c가 r과 같을 때
					pascalArr[r][c] = pascalArr[r-1][c-1];
				}
			}
		}
		return pascalArr[row-1][col-1];
	}
}
/* 1112KB 0ms
 #include <stdio.h>

 int main(){
    int pascalArr[30][30]{}; // 이차원배열 선언 및 초기화({})
    int row, col;
    scanf("%d\n", &row);
    scanf("%d\n", &col);
    
    pascalArr[0][0] = 1;
    for(int r=1 ; r<row ; r++){
        for(int c=0 ; c<r+1 ; c++){
            if(c==0){
                pascalArr[r][c] = pascalArr[r-1][c];
            }else if(c!=0 && c!= r){
                pascalArr[r][c] = pascalArr[r-1][c-1] + pascalArr[r-1][c];
            }else{
                pascalArr[r][c] = pascalArr[r-1][c-1];
            }
        }
    }
    
    printf("%d", pascalArr[row-1][col-1]);
    
    return 0;
 } 
 */
