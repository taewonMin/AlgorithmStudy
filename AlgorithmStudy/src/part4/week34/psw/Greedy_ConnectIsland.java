package part4.week34.psw;

public class Greedy_ConnectIsland {
    public static void main(String[] args) {
        int[][] costs = {{0,1,1},{0,2,2},{1,2,5},{1,3,1},{2,3,8}};
        int n = 4;
        int assume = new Greedy_ConnectIsland().solution(n,costs);
        System.out.println(assume);
    }

    static int[] node = null;
    public int solution(int n, int[][] costs){
        // 1. 탐욕법 선택 기준 -> 비용이 가장 적게 드는 순서로 정렬
        int answer = 0,A=0,B=1,COST=2;
        java.util.Arrays.sort(costs,(a,b)->Integer.compare(a[COST],b[COST]));

        // 2. 기존 연결된 노드 확인 -> dfs 도 적절해 보임
        node = new int[n+1];
        for (int i = 0; i < node.length; i++) {
            node[i] = i;
        }
        for (int i = 0; i < costs.length; i++) {
            // 각각의 도시의 부모가 모두 같다면 이미 연결된 다리
            int parentA = findParent(costs[i][A]);
            int parentB = findParent(costs[i][B]);

            if (parentA!=parentB){ // 연결된 적이 없다면 비용이 적은 순으로 연결
                node[parentB] = parentA;// A를 부모 노드로 연결
                answer += costs[i][COST];
            }
        }
        return answer;
    }

    private int findParent(int child) {
        if (node[child] == child){ // 최상위 노드일 경우
            return child;
        }else {
            return node[child] = findParent(node[child]);
        }
    }
}
