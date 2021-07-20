package week10_math.bbg;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

//귀여운 //다시커밋
public class Math_17294 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BigDecimal num = new BigDecimal(sc.next());
		int length = num.precision();
		BigDecimal[] numArr = new BigDecimal[length]; // 정수만 준다는 가정 하에
		int idx = length-1;
		while(idx >= 0) {
			BigDecimal temp = num.remainder(new BigDecimal("10"));
			numArr[idx--] = temp;
			num = num.divide(new BigDecimal("10")).setScale(0, RoundingMode.FLOOR);
		}
		BigDecimal dist = BigDecimal.ZERO;
		if(length != 1)  dist = numArr[0].subtract(numArr[1]);
		boolean flag = true; 
		idx = 1;
		while(length != 1 && flag && idx < length-1) flag = numArr[idx].subtract(dist) == numArr[idx++ +1] ? true : false;

		System.out.println(length == 1 || (idx == length-1 && flag ) ? "◝(⑅•ᴗ•⑅)◜..°♡ 뀌요미!!" : "흥칫뿡!! <(￣ ﹌ ￣)>");
		
		sc.close();
	}
}
/*
  float distance = 1의자리 수 - 2의자리수;
  2의자리수 + distance == 3의자리수 이면 while 계속 반복, 안맞으면 break
  밖에 변수 놓고 while의 비교 조건으로 쓰자.
  length 까지 다 돌면 무조건 break임.
  조건 2개 줘야함 카운트변수(시작은 0)가 length-2 가 아니고 현재수+distance가 다음수 이면 반복
  3자리 수.
  0번째에서 혹은 0번 들어가기 전 차를 구하고 1번값과 2번값을 계산한다. 그럼 끝인거. 그러면 반복은 length-2까지 해야해.
  
  각 자리수를 배열로 담는 방법 문자열로 바꿔서 split으로 쪼개거나 (간단하지만 메모리 등 걱정)
  얻은 숫자의 length 파악해서 length만큼의 10의 제곱수로 몫을 구해 나가? length만큼의 배열 정해서 끝방부터 넣기 10으로 계속 나머지 구해서..10 10의2승 10의 3승으로 아님 걍 계속 10으로 나눠주던지
  
 */
