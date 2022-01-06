package part3.week30.psw;

import java.util.Scanner;
// https://mathbang.net/101
public class Math_1002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        // 원의 교점의 개수 중점과 반지름이 같을때 -> -1
        // 접점이 2개인 경우 2개
        // 접점이 1개인경우 1 : 내접, 외접
        // 접점이 없을경우 0 : 동심원,
        while (t-- > 0){
            int x1 = sc.nextInt(),y1=sc.nextInt(),r1=sc.nextInt();
            int x2 = sc.nextInt(),y2=sc.nextInt(),r2=sc.nextInt();
            System.out.println(findContact(x1,y1,r1,x2,y2,r2));
        }
        sc.close();
    }

    public static int findContact(int x1,int y1,int r1,int x2,int y2,int r2){
        if (x1==x2&&y1==y2) return r1==r2? -1 : 0; //중점이 같고 같은 원 or 속함

        double d = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        if (r1+r2==d || Math.abs(r1-r2)==d) return 1; // 외접 or 내접
        if (r1+r2 < d || d < Math.abs(r1-r2)) return 0; // 교점 없음
        return 2;
    }
}

