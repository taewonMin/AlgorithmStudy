package part1.week3_sort.chw;

import java.util.Scanner;

public class Sort_13333 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
        
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		int answer = 0;
        
        for(int h = 0; h < arr.length+1; h++){
            int hUp = 0;
            int hDown = 0;
            
            for(int i = 0; i < arr.length; i++){
                if(arr[i] >= h){
                    hUp += 1;
                }else{
                    hDown += 1;
                }
            }
            int totalTreatise = arr.length;
            int remainder = totalTreatise - h;
            
            
            if(h == hUp && hDown <= h && remainder <= h){
                answer = h;   
            }
            
            
            if(h != 0 && h < hUp && h > hDown) {
            	answer = h;
            }
             
        }
        
        System.out.println(answer);
	}
}
