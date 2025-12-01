import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static int N, M;
    public static int[] arr; // 수열을 담을 배열
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M];

        // 깊이 0, 시작 숫자 1부터 탐색 시작
        dfs(0, 1);

        System.out.println(sb);
    }

    // depth: 현재까지 고른 숫자의 개수
    // start: 이번에 고를 숫자의 시작 범위 (비내림차순 유지용)
    public static void dfs(int depth, int start) {
        // [Base Case] 목표 깊이(M)에 도달하면 출력 저장 후 리턴
        if (depth == M) {
            for (int val : arr) {
                sb.append(val).append(' ');
            }
            sb.append('\n');
            return;
        }

        // [Recursive Step] start부터 N까지 반복
        for (int i = start; i <= N; i++) {
            arr[depth] = i; // 현재 깊이에 i를 저장

            // 다음 깊이로 이동
            // 중복 허용이므로 다음 단계의 start도 i 그대로 유지 (i부터 다시 고를 수 있음)
            dfs(depth + 1, i);
        }
    }
}