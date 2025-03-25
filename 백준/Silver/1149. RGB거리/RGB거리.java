import java.util.Scanner;

public class Main {
    final static int red = 0;
    final static int green = 1;
    final static int blue = 2;

    static int N;
    static int[][] cost; // 비용을 저장할 배열
    static int[][] ans; // 비용의 합을 저장할 배열
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt(); //집의 수 입력받기
        int num;
        cost = new int[N][3];
        ans = new int[N][3];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 3; j++) {
                cost[i][j] = sc.nextInt();
            }
        }

        // 초기화
        ans[0][red] = cost[0][red];
        ans[0][green] = cost[0][green];
        ans[0][blue] = cost[0][blue];

        System.out.println(Math.min(paint_cost(N-1, red), Math.min(paint_cost(N-1, green), paint_cost(N-1, blue))));
    }

    public static int paint_cost(int N, int color) {
        if (ans[N][color] == 0) {//탐색이 안된 배열이라면
            if (color == red) {
                ans[N][red] = Math.min(paint_cost(N - 1, green), paint_cost(N - 1, blue)) + cost[N][red];
            } else if (color == green) {
                ans[N][green] = Math.min(paint_cost(N - 1, red), paint_cost(N - 1, blue)) + +cost[N][green];
            } else {
                ans[N][blue] = Math.min(paint_cost(N - 1, red), paint_cost(N - 1, green)) + cost[N][blue];
            }
        }
        return ans[N][color];
    }
}