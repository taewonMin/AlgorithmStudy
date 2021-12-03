package part3.week23.phk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Sort_10814 {
    public static void main(String[] args) throws IOException{
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // String[][] arr = new String[n][2];
        // for(String[] a : arr){
        //     a[0] = sc.next();
        //     a[1] = sc.next();
        // }
        // sc.close();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[][] arr = new String[n][2];
        for(String[] a : arr){
            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s); 
            a[0] = st.nextToken(); 
            a[1] = st.nextToken(); 
        }

        for (int i = 1; i < arr.length; i++) {
            for(int j = 0; j < arr.length - i; j++) {
                
                if(Integer.parseInt(arr[j][0]) > Integer.parseInt(arr[j+1][0])){
                    String temp_0 = arr[j][0];
                    String temp_1 = arr[j][1];
    
                    arr[j][0] = arr[j+1][0];
                    arr[j][1] = arr[j+1][1];
    
                    arr[j+1][0] = temp_0;
                    arr[j+1][1] = temp_1;
    
                }

            }
        }

        for (String[] a : arr) {
            System.out.println(a[0] + " " + a[1] );
        }
    }
}
