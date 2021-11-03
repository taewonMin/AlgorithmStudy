package part3.week24.phk;

import java.util.Arrays;
import java.util.Scanner;

// 38320kb	1040ms
public class Sort_1181 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Word[] word_arr = new Word[n];
        for (int i = 0; i < word_arr.length; i++) {
            String temp = sc.next();
            word_arr[i] = new Word(temp, temp.length());
        }
        sc.close();

        Arrays.sort(word_arr, (a, b) -> {
            int cnt = a.length.compareTo(b.length);
            if(cnt != 0) return cnt;
            return a.word.compareTo(b.word);
            
        });

        for (int i = 0; i < word_arr.length; i++) {
            if(i > 0 && word_arr[i-1].word.equals(word_arr[i].word)) continue;
            System.out.println(word_arr[i].word);
        }

    }
}

class Word {

    String word;
    Integer length;

    Word(String word, int length){
        this.word = word;
        this.length = length;
    }
}
