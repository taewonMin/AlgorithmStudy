package part2.week18.jje;

import java.util.Scanner;

public class Imple_10994 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //8*2 //16 8*4//32 8*6//48..
        //1 5 9 13
        //0*0 0*1 0*2 0*3 0*4
        //1*0
        //2*0     2*2 3*2 4*2 5*2..
        //3*0     2*3
        int n = sc.nextInt();
        int length = (n-1)*4+1;
        int halfLength = length/2;

        String[][] starArray = new String[length][length];

        for (int j = 0; j < length; j++) {
            System.out.println();
            for (int i = 0; i < length; i++) {
                //j가 2일때, i-2까지만 / i가 2일 때 j-2까지만
                if(j == 0 || j+1 == length || i+1 == length || i == 0) {
                    starArray[i][j] = "*";
                }else if(i <= halfLength && j <= halfLength){
                    if((starArray[i-1][j-1]=="*")){
                        starArray[i][j] = " ";
                    }else{
                        starArray[i][j] = "*";
                    }
                }else if(i > halfLength && j <= halfLength){
                    if((starArray[i+1][j-1]=="*")){
                        starArray[i][j] = " ";
                    }else{
                        starArray[i][j] = "*";
                    }
                }else{
                    starArray[i][j]=starArray[i][halfLength-(j-halfLength)];
                }

                System.out.print(starArray[i][j]);
            }
        }


        sc.close();
    }
}
