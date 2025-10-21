import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

// 
class Rod {
    int length; // 막대 길이 (조각 수)
    long cost;  // 자르는 비용

    public Rod(int length, long cost) {
        this.length = length;
        this.cost = cost;
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // 테스트 케이스 개수

        for (int i_case = 0; i_case < T; i_case++) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();

            // --- 1단계: S[i] = 1인 막대와 S[i] >= 2인 막대 분리 ---
            int base_pieces = 0; // S[i]=1인 막대(기본 조각) 수
            ArrayList<Rod> rods_to_cut = new ArrayList<>(); // 자를 수 있는 막대 목록
            int max_achievable_pieces = 0; // 자르기로 얻을 수 있는 최대 조각 수

            for (int j = 0; j < N; j++) {
                int L = sc.nextInt(); // 현재 막대 길이
                if (L == 1) {
                    base_pieces++;
                } else if (L >= 2) {
                    // (L-1) * (L-1)이 int 오버플로우는 나지 않지만, a와 곱할 때 오버플로우 발생
                    // (long)a * (L - 1) * (L - 1) + b
                    long cost = (long)a * (L - 1) * (L - 1) + b;
                    rods_to_cut.add(new Rod(L, cost));
                    max_achievable_pieces += L;
                }
            }

            // --- 2단계: 목표 K 설정 ---
            int target_K = K - base_pieces; // 잘라서 추가로 얻어야 하는 조각 수

            // 이미 K개를 만족한 경우
            if (target_K <= 0) {
                System.out.println(0);
                continue; // 다음 테스트 케이스로
            }

            // --- 3단계: DP (Knapsack) ---
            // dp[j] = j개의 조각을 얻기 위한 최소 비용
            long[] dp = new long[max_achievable_pieces + 1];
            Arrays.fill(dp, Long.MAX_VALUE / 2); // 매우 큰 값으로 초기화

            dp[0] = 0; // 0개의 조각은 비용 0

            for (Rod rod : rods_to_cut) {
                int L = rod.length;
                long C = rod.cost;

                // 역순으로 순회해야 Knapsack 0/1 (물건 1번 사용)이 됨
                for (int j = max_achievable_pieces; j >= L; j--) {
                    if (dp[j - L] != Long.MAX_VALUE / 2) { // (j-L)개를 만드는 게 가능했다면
                        dp[j] = Math.min(dp[j], dp[j - L] + C);
                    }
                }
            }

            // --- 4단계: 정답 찾기 ---
            // target_K "이상"의 조각 중 최소 비용
            long min_cost = Long.MAX_VALUE / 2;
            for (int j = target_K; j <= max_achievable_pieces; j++) {
                min_cost = Math.min(min_cost, dp[j]);
            }

            System.out.println(min_cost);
        }

        sc.close();
    }
}