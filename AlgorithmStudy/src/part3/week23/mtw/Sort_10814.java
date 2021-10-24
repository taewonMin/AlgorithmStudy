package part3.week23.mtw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Sort_10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Member[] memberList = new Member[N];

        for(int i=0; i<N; i++){
            String[] input = br.readLine().split(" ");
            memberList[i] = new Member(Integer.parseInt(input[0]), input[1], i);
        }

        Arrays.sort(memberList, (a, b) -> {
            int cnt = a.age.compareTo(b.age);
            if(cnt != 0){
                return cnt;
            }
            return a.order.compareTo(b.order);
        });

        for(Member member : memberList){
            System.out.println(member.toString());
        }

        br.close();
    }
}

class Member{
    Integer age;
    String name;
    Integer order;

    Member(int age, String name, int order){
        this.age = age;
        this.name = name;
        this.order = order;
    }

    @Override
    public String toString() {
        return this.age + " " + this.name;
    }
}
