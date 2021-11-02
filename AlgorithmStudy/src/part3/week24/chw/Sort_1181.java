package part3.week24.chw;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;

public class Sort_1181 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt= sc.nextInt();
        HashSet<String> set = new HashSet<String>();
        for(int i = 0; i < cnt; i++) {
        	set.add(sc.next());
        }
        sc.close();
        String[] arr = set.toArray(new String[0]);
        Arrays.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if(o1.length() == o2.length()) {
					return o1.compareTo(o2);
				}else{
					return o1.length() - o2.length();
				}
			}
		});
        for(String i : arr) {
        	System.out.println(i);
        }
    }
}