import java.util.*;

public class Main {

    static boolean[] visited;
    static ArrayList<Integer>[] graph;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 정점의 개수
        int M = sc.nextInt(); // 간선의 개수
        int V = sc.nextInt(); // 시작 정점

        graph = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph[u].add(v);
            graph[v].add(u);
        }
        
        //작은 순으로 방문하기 위해 정렬
        for (int i = 1; i <= N; i++) {
            Collections.sort(graph[i]);
        }
        
        visited = new boolean[N + 1];
        dfs(V);
        System.out.println();
        
        visited = new boolean[N + 1];
        bfs(V);
    }
    
    public static void dfs(int V) {
        visited[V] = true;
        System.out.print(V + " ");

        for (int next : graph[V]) {
            if(!visited[next]) {
                dfs(next);
            }
        }
    }
    
    public static void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        visited[start] = true;
        q.offer(start);
        
        while (!q.isEmpty()) {
            int V = q.poll();
            System.out.print(V + " ");

            for (int next :graph[V]) {
                if ((!visited[next])) {
                    visited[next] = true;
                    q.offer(next);
                }
            }
        }
    }
}
