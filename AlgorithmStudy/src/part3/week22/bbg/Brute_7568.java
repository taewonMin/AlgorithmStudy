package part3.week22.bbg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
/*덩치 11580KB 80ms 1062B */
public class Brute_7568 {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	int[][] people = new int[Integer.parseInt(br.readLine())][2];
    	for(int i = 0 ; i < people.length ; i++) {
    		st = new StringTokenizer(br.readLine());
    		people[i][0] = Integer.parseInt(st.nextToken());
    		people[i][1] = Integer.parseInt(st.nextToken());
    	}
    	br.close();
    	
    	int[] rank = new int[people.length];
    	Arrays.fill(rank, 1);
    	
    	for(int i = 0 ; i < people.length ; i++) {
    		for(int j = 0 ; j < people.length ; j++) {
    			if(i==j) continue;
    			
	    		if(people[i][0] < people[j][0]) {
	    			if(people[i][1] < people[j][1]) {
	    				rank[i]++;
	    			}
	    		}
    		}
    	}
    	for(int i = 0 ; i < rank.length ; i++) {
    		System.out.print(rank[i]+" ");
    	}
    }
}
