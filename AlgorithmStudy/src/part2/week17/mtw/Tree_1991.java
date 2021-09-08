package part2.week17.mtw;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Tree_1991 {
	static Map<String, String[]> tree = new HashMap<>();
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        
        for(int i=0; i<N; i++) {
        	String node = sc.next();
        	String[] arr = new String[2];
        	arr[0] = sc.next();
        	arr[1] = sc.next();
        	tree.put(node, arr);
        }
        
        preOrder("A");
        System.out.println();
        inOrder("A");
        System.out.println();
        postOrder("A");
        
        sc.close();
    }
    
    static void preOrder(String root) {
    	if(root.equals(".")) return;
    	
    	System.out.print(root);
    	preOrder(tree.get(root)[0]);
    	preOrder(tree.get(root)[1]);
    }
    static void inOrder(String root) {
    	if(root.equals(".")) return;
    	
    	inOrder(tree.get(root)[0]);
    	System.out.print(root);
    	inOrder(tree.get(root)[1]);
    }
    static void postOrder(String root) {
    	if(root.equals(".")) return;
    	
    	postOrder(tree.get(root)[0]);
    	postOrder(tree.get(root)[1]);
    	System.out.print(root);
    }
}
