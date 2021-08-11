package part1.week1.chw;

public class LargestNumber {
	public static void main(String[] args) {
		int[] numbers = {3, 34, 5, 30, 9};
		int[] multiNumbers = new int[numbers.length];
		String strNum = "";
        for(int number = 0; number < numbers.length; number++){
        	multiNumbers[number] = numbers[number];
            strNum += numbers[number] + "";
        }
        int totalLength = strNum.length();
        
        for(int number = 0; number < multiNumbers.length; number++){
            String strNo = multiNumbers[number] + "";
            int numberLength = totalLength - strNo.length();
            multiNumbers[number] = (int) (multiNumbers[number] * Math.pow(10, numberLength));
//            System.out.println("No." + number +" : " + multiNumbers[number] );
        }
        
        for(int i=0; i<multiNumbers.length; i++) {
			for(int j=i+1; j<multiNumbers.length; j++) {
				if(multiNumbers[i] < multiNumbers[j]) { //내림차순
					
					int tmp = multiNumbers[i];
					multiNumbers[i] = multiNumbers[j];
					multiNumbers[j] = tmp;
					
					int realTemp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = realTemp;
				}else if(multiNumbers[i] == multiNumbers[j]){
					if(numbers[i] > numbers[j]) {
						int realTemp = numbers[i];
						numbers[i] = numbers[j];
						numbers[j] = realTemp;
					}
				}
			}
		}
        
        
        String answer = "";
        for(int result : numbers){
            answer+= result+"";
        }
        System.out.println(answer);
	}
}









// 프로그래머스
//class Solution {
//    public String solution(int[] numbers) {
//        
//		int[] multiNumbers = new int[numbers.length];
//		String strNum = "";
//        for(int number = 0; number < numbers.length; number++){
//        	multiNumbers[number] = numbers[number];
//            strNum += numbers[number] + "";
//        }
//        int totalLength = strNum.length();
//        
//        for(int number = 0; number < multiNumbers.length; number++){
//            String strNo = multiNumbers[number] + "";
//            int numberLength = totalLength - strNo.length();
//            multiNumbers[number] = (int) (multiNumbers[number] * Math.pow(10, numberLength));
//        }
//        
//        for(int i=0; i<multiNumbers.length; i++) {
//			for(int j=i+1; j<multiNumbers.length; j++) {
//				if(multiNumbers[i] < multiNumbers[j]) { //내림차순
//					
//					int tmp = multiNumbers[i];
//					multiNumbers[i] = multiNumbers[j];
//					multiNumbers[j] = tmp;
//					
//					int realTemp = numbers[i];
//                    numbers[i] = numbers[j];
//                    numbers[j] = realTemp;
//				}else if(multiNumbers[i] == multiNumbers[j]){
//					if(numbers[i] > numbers[j]) {
//						int realTemp = numbers[i];
//						numbers[i] = numbers[j];
//						numbers[j] = realTemp;
//					}
//				}
//			}
//		}
//        
//        String answer = "";
//        for(int result : numbers){
//            answer+= result+"";
//        }
//        
//        return answer;
//    }
//}
