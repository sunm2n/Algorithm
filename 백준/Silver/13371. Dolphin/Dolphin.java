import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // 테스트 케이스 개수
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            long n = sc.nextLong();
            long k = 0; // n이 속한 라운드(k)를 저장할 변수

            long low = 1;
            long high = 2000000000;

            while (low <= high) {
                long mid = (low + high) / 2;

                long shouts = 3L * mid * (mid + 1) / 2L;

                if (shouts < n) {
                    // mid 라운드까지의 구호 수보다 n이 크다.
                    // 정답(k)은 mid보다 큰 쪽에 있다.
                    low = mid + 1;
                } else {
                    // totalShouts >= n
                    // n이 mid 라운드에 포함되거나, 그 이전 라운드일 수 있다.
                    // mid를 정답 후보로 저장하고, 더 작은 k가 있는지 왼쪽(high)을 탐색한다.
                    k = mid;
                    high = mid - 1;
                }
            }

            long prevShouts = 3L * (k - 1) * k / 2L;

            // k 라운드 내에서 n이 몇 번째인지 계산
            long indexInRound = n - prevShouts;

            // k 라운드는 "k dolphin(s)" k개, "k jump(s)" k개, "splash" k개로 구성됨

            if (indexInRound <= k) {
                // "k dolphin(s)" 구간
                if (k == 1) {
                    sb.append("1 dolphin").append("\n");
                } else {
                    sb.append(k + " dolphins").append("\n");
                }
            } else if (indexInRound <= 2 * k) {
                // "k jump(s)" 구간
                if (k == 1) {
                    sb.append("1 jump").append("\n");
                } else {
                    sb.append(k + " jumps").append("\n");
                }
            } else {
                // "splash" 구간 (indexInRound <= 3 * k)
                sb.append("splash").append("\n");
            }
        }

        System.out.println(sb);
    }
}
