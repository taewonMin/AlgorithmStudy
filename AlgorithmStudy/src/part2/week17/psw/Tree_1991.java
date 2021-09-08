package part2.week17.psw;

import java.util.Scanner;

public class Tree_1991 {
    static Node root = null;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final byte N = sc.nextByte();
        root = new Node('A');

        for (int i = 0; i < N; i++) {
            char parent = sc.next().charAt(0);
            setChildNode(parent,sc.next().charAt(0),sc.next().charAt(0));
        }

        sc.close();
    }

    private static void setChildNode(char parent, char left, char right) {
        Node parentNode = findNode(root,parent);
        if(parentNode != null){
            if(left != '.') parentNode.left = new Node(left);
            if(right != '.') parentNode.right = new Node(right);
        }else{
            System.out.println();
        }
    }

    private static Node findNode(Node node,char targert) { // 부모 노드가 없을 순 없다.
        if(node.value == targert){
            return node;
        }else{
            if(node.left != null) {
                if(node.left.value == targert) return node.left;
                findNode(node.left,targert);
            }
            if(node.right != null) {
                if(node.right.value == targert) return node.right;
                findNode(node.right,targert);
            }
        }
        return null;
    }


    public static void preorder(){ // 전위 순위, 뿌리 먼저 방문 -> dfs(깊이 우선 탐색)


    }

    public static void inorder(){ // 중위 순위, 왼쪽 하위 트리 한번찍고 뿌리
        // 깊이 탐색을 해서 자식이 없을때 -> null 일때 출력
    }

    public static void postorder(){ // 후위 순위, 하위트리 방문 후 뿌리

    }


}

class Node{
    char value;
    Node left;
    Node right;

    public Node(char value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public Node(char value) {
        this.value = value;
    }

    public boolean isEnd(){
        return left == null && right == null;
    }
}