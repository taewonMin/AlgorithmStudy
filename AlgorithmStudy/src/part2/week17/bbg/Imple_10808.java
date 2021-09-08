package part2.week17.bbg;

/* 알파벳 찾기  12784KB 108ms  */
import java.util.Scanner;
public class Imple_10808 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    	String S = sc.next();
        sc.close();
        char[] arr = S.toCharArray();
        int[] cntArr = new int[26];

        //ascii코드 97부터 122까지 -97 이 인덱스임.
        for(int cnt = 0 ; cnt < arr.length ; cnt++) {
        	int ascii = arr[cnt]; 
        	cntArr[ascii-97] += 1;
        }
        for(int cnt = 0 ; cnt < cntArr.length ; cnt++) {
			System.out.print(cntArr[cnt] + " ");
		}
    }
}
// 12840KB 120ms
//public class Imple_10808 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String S = sc.next();
//		sc.close();
//		char[] arr = S.toCharArray();
//		int[] cntArr = new int[26];
//		for(int cnt = 0 ; cnt < arr.length ; cnt++) {
//			switch (arr[cnt]) {
//			case 'a':
//				cntArr[0] += 1;
//				break;
//			case 'b':
//				cntArr[1] += 1;
//				break;
//			case 'c':
//				cntArr[2] += 1;
//				break;
//			case 'd':
//				cntArr[3] += 1;
//				break;
//			case 'e':
//				cntArr[4] += 1;
//				break;
//			case 'f':
//				cntArr[5] += 1;
//				break;
//			case 'g':
//				cntArr[6] += 1;
//				break;
//			case 'h':
//				cntArr[7] += 1;
//				break;
//			case 'i':
//				cntArr[8] += 1;
//				break;
//			case 'j':
//				cntArr[9] += 1;
//				
//				break;
//			case 'k':
//				cntArr[10] += 1;
//				break;
//			case 'l':
//				cntArr[11] += 1;
//				break;
//			case 'm':
//				cntArr[12] += 1;
//				break;
//			case 'n':
//				cntArr[13] += 1;
//				break;
//			case 'o':
//				cntArr[14] += 1;
//				break;
//			case 'p':
//				cntArr[15] += 1;
//				break;
//			case 'q':
//				cntArr[16] += 1;
//				break;
//			case 'r':
//				cntArr[17] += 1;
//				break;
//			case 's':
//				cntArr[18] += 1;
//				break;
//			case 't':
//				cntArr[19] += 1;
//				break;
//			case 'u':
//				cntArr[20] += 1;
//				break;
//			case 'v':
//				cntArr[21] += 1;
//				break;
//			case 'w':
//				cntArr[22] += 1;
//				break;
//			case 'x':
//				cntArr[23] += 1;
//				break;
//			case 'y':
//				cntArr[24] += 1;
//				break;
//			default:
//				cntArr[25] += 1;
//				break;
//			}
//		}
//		for(int cnt = 0 ; cnt < cntArr.length ; cnt++) {
//			System.out.print(cntArr[cnt] + " ");
//		}
//		
//	}
//}
