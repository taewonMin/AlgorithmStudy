package part5.week42.psw;

public class Test {
    public static void main(String[] args) {

        int[] a = {1,1,1,1,1,1,1,1,1,1} , b = {5,5,5,5,1,1,1,1,1,1};
        for (int i = 0; i < 10 && a[i] < b[i]; i++) {
            System.out.println(i);
        }
    }
}
