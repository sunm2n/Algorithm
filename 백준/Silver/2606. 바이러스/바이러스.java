
import java.util.*;

public class Main {
    static boolean[] visited;
    static ArrayList<Integer>[] graph;

    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int comuter = sc.nextInt(); // 컴퓨터 수
        int link = sc.nextInt(); // 연결 수

        visited = new boolean[comuter + 1];
        graph = new ArrayList[comuter + 1];

        for (int i = 1; i <= comuter; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < link; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a].add(b);
            graph[b].add(a); // 양방향 연결
        }

        dfs(1); // 1번 컴퓨터에서 시작

        System.out.println(count - 1); // 1번 컴퓨터 제외
    }

    static void dfs(int x) {
        visited[x] = true;
        count++;

        for (int next : graph[x]) {
            if (!visited[next]) {
                dfs(next);
            }
        }
    }
}
