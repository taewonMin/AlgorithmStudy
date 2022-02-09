package part4.week34.chw;

import java.util.Arrays;
import java.util.Scanner;

public class Greedy_1951 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int[][] arr2d = new int[N][2];
    	for(int i = 0; i < N; i++) {
    		arr2d[i][1] = sc.nextInt();
    		arr2d[i][0] = sc.nextInt();
    	}
    	Arrays.sort(arr2d, (o1, o2) -> {
    		if(o1[0] == o2[0]) {
    			return Integer.compare(o1[1], o2[1]);
    		}else {
    			return Integer.compare(o1[0], o2[0]);
    		}
    	});
        
    	int temp = arr2d[0][0];
    	int result = 1;
        for(int i = 1; i < arr2d.length; i++) {
        	if(arr2d[i][1] >= temp) {
        		result++;
        		temp = arr2d[i][0];
        	}
        }
        System.out.println(result);
    	sc.close();
    }
}
/*


	0 6          1  4  //         4   1 // 
	1 4          3  5             5   3    
	2 13         0  6             6   0    
	3 5          5  7  //         7   5 // 
	3 8          3  8             8   3    
	5 7          5  9             9   5    
	5 9          6  10            10  6    
	6 10         8  11 //         11  8 // 
	8 11         8  12            12  8    
	8 12         2  13            13  2    
	12 14		 12 14 //		  14  12 //

*/
