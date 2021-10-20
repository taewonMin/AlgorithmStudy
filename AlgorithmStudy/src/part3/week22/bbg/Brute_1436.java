package part3.week22.bbg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;
/*영화감독 메모리초과*/
public class Brute_1436 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		br.close();
		int count = 0;
		int result = 665;
		StringBuffer sb = new StringBuffer();
		String pattern = "\\d*(666)+\\d*";
		while(count < N) {
			result++;
			sb.delete(0, sb.length());
			sb.append(result);
			if(Pattern.matches(pattern, sb)) { 
				count++;
			}
		}
		System.out.println(result);
	}
}
