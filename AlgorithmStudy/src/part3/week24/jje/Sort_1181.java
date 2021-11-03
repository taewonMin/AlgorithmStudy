package part3.week24.jje;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;

public class Sort_1181 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] dupleArr = new String[n];
        for (int i = 0; i < n; i++) {
            dupleArr[i] = sc.next();
        }
        HashSet<String> set = new HashSet<>(Arrays.asList(dupleArr));
        String[] resultArr = set.toArray(new String[0]);
        sort(resultArr, 0, resultArr.length - 1);
        /*
        Arrays.sort(resultArr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                } else {
                    return o1.length() - o2.length();
                }
            }
        });
        */
        for (int i = 0; i < resultArr.length; i++) {
            System.out.println(resultArr[i]);
        }
        sc.close();
    }
    static void sort(String[] arr, int low, int high){
        if (low >= high) return;

        int mid = partition(arr, low, high); //재귀 호출할 때 우측 리스트의 시작 인덱스
        sort(arr, low, mid - 1);
        sort(arr, mid, high);
    }

    static int partition(String[] arr, int low, int high){
        int pivot = arr[(low + high) / 2].length();
        while (low <= high) {
            while (arr[low].length() < pivot) low ++;
            while (arr[high].length() > pivot) high--;
            if (low <= high) {
               swap(arr, low, high);
               low++;
               high--;
            }
        }
        return low;
    }

    static void swap(String[] arr, int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
