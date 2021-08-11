package part1.week3_sort.chw;

import java.util.Arrays;

public class Programmers_K번째수 {
	public static void main(String[] args) {
		
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		
		int[] answer = new int[commands.length];
        
        for(int i = 0; i < commands.length; i++){
            
            int startNum = commands[i][0] - 1;
            int endNum = commands[i][1] - 1;
            int arrLength = endNum - startNum + 1;
            
            int[] arr = new int[arrLength];
            
            for(int k = startNum; k < endNum+1; k++){
                arr[k-startNum] = array[k];
            }
            
            Arrays.sort(arr);
            
            answer[i] = arr[commands[i][2] - 1];
            
        }
        
        for(int num : answer) {
        	System.out.println(num);
        }
	}
}