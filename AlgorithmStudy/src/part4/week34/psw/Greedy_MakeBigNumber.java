package part4.week34.psw;

public class Greedy_MakeBigNumber {
    public static void main(String[] args) {
        String number = "4177252841";
        int k = 4;
        String assume = new Greedy_MakeBigNumber().solution(number,k);
        System.out.println(number+" | "+k+" | "+assume);
    }

    public String solution(String number, int k){
        int maxLen = number.length()-k;
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < number.length(); i++) {
            int maxIdx = i;
            int len = i+k+1;
            for (int j = i+1; j < len; j++) {
                if (number.charAt(maxIdx) < number.charAt(j)){
                    maxIdx=j;
                }
            }
            k -= (maxIdx-i);
            sb.append(number.charAt(maxIdx));
            i=maxIdx;
            if (sb.length() == maxLen) break;
        }
        return sb.toString();
    }
}
