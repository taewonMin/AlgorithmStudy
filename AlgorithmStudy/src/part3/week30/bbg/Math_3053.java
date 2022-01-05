package part3.week30.bbg;

/*
 * 택시기하학은 거리의 정의가 달라서 원을 그리면 마름모꼴 정사각형이 된다.
 * 거리가 R인 점들을 직선으로 연결한 형태
 * 마름모의 넓이 = 한 대각선 * 다른 대각선 / 2;
 * 
 * java8 13052kb 120ms
 * */
import java.util.Scanner;

public class Math_3053 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        sc.close();
        
        // 유클리드  기하학에서의 원의 넓이
        double euclidean = Math.PI * Math.pow(R, 2);
        // 택시 기하학에서의 원의 넓이
        double taxicap = Math.pow(2*R, 2) / 2;
        
        System.out.println(String.format("%.6f", euclidean) +"\n" + String.format("%.6f", taxicap));
    }
}
