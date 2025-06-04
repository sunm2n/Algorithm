
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 노드의 개수
        int M = sc.nextInt(); // 질문의 횟수
        int V = sc.nextInt(); // N번 노드가 가르키는 노드의 번호
        StringBuilder sb = new StringBuilder();

        int []node = new int[N+1];

        for (int i = 1; i <= N; i++) {
            node[i] = sc.nextInt();
        }

        for (int i = 1; i <= M; i++) {
            int qes = sc.nextInt(); // 질문
            if(qes >= N) {
                qes = qes - V + 1;
                qes = qes % (N - V + 1) + V;
            } else {
                qes = qes + 1;
            }
            sb.append(node[qes]).append("\n");
        }

        System.out.println(sb);
    }
}
