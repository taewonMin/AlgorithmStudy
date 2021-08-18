package part2.week14.bbg;

import java.util.Scanner;
import java.util.regex.Pattern;
// 비밀번호 찾기
public class DS_17219 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int M = sc.nextInt();
		
		String[][] arr = new String[N][2];
		String idPat = "\\w+\\-*\\w*\\.\\w+(\\.\\w+)?";
		String pwPat = "[A-Z]+";
		for(int cnt = 0 ; cnt < N ; cnt++) {
			String tempId = sc.next();
			String tempPw = sc.next();
			if(Pattern.matches(idPat, tempId)) {
				arr[cnt][0] = tempId;
			}
			if(Pattern.matches(pwPat, tempPw)) {
				arr[cnt][1] = tempPw;
			}
		}
		
		int cnt = 0;
		int idx = 0;
		while(cnt < M) {
			if(arr[idx][1] != "") {
				System.out.println(arr[idx][1]);
				cnt++;
			}
			idx++;
		}
		sc.close();
	}
}
