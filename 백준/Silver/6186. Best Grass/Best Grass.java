import java.util.*;

public class Main {

    static int R, C;
    static char [][]clump;
    static boolean [][]visited;

    //상하좌우 이동
    static int []dx = {-1, 1, 0, 0};
    static int []dy = {0, 0, -1, 1};

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        R = sc.nextInt();
        C = sc.nextInt();
        sc.nextLine(); // 개행 처리

        clump = new char[R][C];
        visited = new boolean[R][C];

        for (int i = 0; i < R; i++) {
            clump[i] = sc.nextLine().toCharArray();
        }

        int count = 0;

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if(clump[i][j] =='#' && !visited[i][j]) {
                    bfs(i, j);
                    count++;
                }
            }
        }

        System.out.println(count);
    }

    static void bfs(int x, int y) {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{x, y});
        visited[x][y] = true;

        while (!q.isEmpty()) {
            int []currnet = q.poll();
            int cx = currnet[0];
            int cy = currnet[1];

            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if(nx >= 0 && nx < R && ny >= 0 && ny < C) {
                    if (clump[nx][ny] == '#' && !visited[nx][ny]) {
                        visited[nx][ny] = true;
                        q.offer(new int[]{nx, ny});
                    }
                }
            }
        }
    }
}
