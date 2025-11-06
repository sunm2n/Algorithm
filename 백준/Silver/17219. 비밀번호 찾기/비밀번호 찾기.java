import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 저장된 사이트의 주소 수
        int M = sc.nextInt(); // 찾으려는 비밀번호의 수
        sc.nextLine();

        Map<String, String> memo = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String s = sc.nextLine();
            String[] parts = s.split(" ");
            memo.put(parts[0], parts[1]);
        }

        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < M; i++) {
            String s = sc.nextLine();
            sb.append(memo.get(s)).append("\n");
        }

        System.out.println(sb);
    }
}
