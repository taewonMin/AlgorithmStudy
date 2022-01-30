package part4.week34.psw;

public class Greedy_TrafficCamera {
    public static void main(String[] args) {
        int[][] routes = {{-20,-15}, {-14,-5}, {-18,-13}, {-5,-3}};
        int assume = new Greedy_TrafficCamera().solution(routes);
        System.out.println(assume);
    }

    public int solution(int[][] routes) {
        int answer = 1;
        java.util.Arrays.sort(routes,(a,b)->Integer.compare(a[1],b[1]));

        int maxEnd = routes[0][1];
        for (int i = 1; i < routes.length; i++) {
            if (routes[i][0] > maxEnd){
                maxEnd = routes[i][1];
                answer++;
            }
        }
        return answer;
    }
}
