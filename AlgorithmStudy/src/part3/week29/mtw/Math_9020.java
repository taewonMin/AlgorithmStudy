package part3.week29.mtw;

import java.io.*;

public class Math_9020 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++){
            int n = Integer.parseInt(br.readLine());
            int firNum = n/2;
            int secNum = n/2;
            while(isPrime(firNum)==false || isPrime(secNum)==false){
                firNum--;
                secNum++;
            }
            bw.write(firNum+" "+secNum);
            bw.newLine();
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static boolean isPrime(int n){
        for(int i=2; i*i<=n; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
