package part3.week24.psw;

import java.util.Scanner;
import java.util.function.BiFunction;

public class Sort_1181 {
    public static BiFunction<String,String,Integer> comparator = (s1, s2)->
            s1.length() == s2.length() ?
                    s1.compareTo(s2) :
                    Integer.compare(s1.length(),s2.length())
            ;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int N = sc.nextInt();
        String[] words = new String[N];
        for (int i = 0; i < N; i++) words[i] = sc.next();

        //Arrays.sort(words,(s1,s2)->comparator.apply(s1,s2)); // 728ms
        quickSort(words,0, N-1); // 664ms

        printWords(words);
        sc.close();
    }

    private static void printWords(String[] words) {
        StringBuffer sb = new StringBuffer();
        sb.append(words[0]+"\n");
        for (int i = 1; i < words.length; i++) {
            if (words[i-1].equals(words[i])) continue;
            sb.append(words[i]+"\n");
        }
        System.out.println(sb);
    }

    private static void quickSort(String[] words, int low, int high) {
        if(low < high){
            int mid = partition(words, low,high);
            quickSort(words,low,mid - 1);
            quickSort(words,mid,high);
        }
    }

    private static int partition(String[] words, int low, int high) {
        String pivot = words[(low+high)/2];

        while (low <= high){
            while (comparator.apply(words[low],pivot) < 0) low++;
            while (comparator.apply(words[high],pivot) > 0) high--;

            if (low <= high){
                swap(words,low,high);
                low++;
                high--;
            }
        }
        return low;
    }

    private static void swap(String[] words, int low, int high) {
        String temp = words[low];
        words[low] = words[high];
        words[high] = temp;
    }
}
