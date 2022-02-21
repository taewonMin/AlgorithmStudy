package part4.week34.psw;

public class Greedy_Joystick {
    public static void main(String[] args) {
        String name = "JEROEN";
        int assume = new Greedy_Joystick().solution(name);
        System.out.println(assume);
    }

    public int solution(String name){
        int answer = 0;
        int len = name.length();
        for(int i=0; i<len; i++){
            if(name.charAt(i) > 'N'){
                answer += 'Z' - name.charAt(i) +1;
            } else{
                answer += name.charAt(i) - 'A';
            }
        }
        return answer;
    }


}
